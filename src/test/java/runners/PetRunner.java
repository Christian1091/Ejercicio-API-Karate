package runners;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

class PetRunner {

    @Test
    void testAll() {

        Results results = Runner.path("classpath:features")
                .outputCucumberJson(true)
                .reportDir("target/karate-reports")
                .parallel(1);
    }
}