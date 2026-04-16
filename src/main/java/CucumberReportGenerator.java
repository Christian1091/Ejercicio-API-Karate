import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CucumberReportGenerator {

    public static void main(String[] args) {

        File outputDir = new File("target/karate-reports");

        List<String> jsonFiles = new ArrayList<>();
        for (File file : outputDir.listFiles()) {
            if (file.getName().endsWith(".json")) {
                jsonFiles.add(file.getAbsolutePath());
            }
        }

        String projectName = "PetStore API Testing";

        Configuration config = new Configuration(outputDir, projectName);

        config.addClassifications("Framework", "Karate");
        config.addClassifications("Type", "API Testing");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        reportBuilder.generateReports();
    }
}