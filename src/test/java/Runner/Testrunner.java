package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions (
        features="src/test/java/feature/Takealot.feature",
        glue="Steps",
        plugin ={"pretty","html:target/takealot.html", "json:target/takealot.json"}
        //Filetype:Path/Filename.type
)

public class Testrunner {
}
