package api.simple;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleRunner {

    @Test
    void testParallel(){
        Results results = Runner.path("classpath:api/simple/jsonplace.feature").parallel(1);
        assertTrue(results.getFailCount() == 0, results.getErrorMessages());
    }
}
