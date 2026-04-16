package runners;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetRunner {

    @Test
    void testAll() {

        Results results = Runner.path("classpath:features")
                .outputCucumberJson(true)
                .reportDir("target/karate-reports")   // 🔥 ESTO ES LO QUE TE FALTA
                .parallel(1);

        System.out.println("Report dir: " + results.getReportDir());

        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}