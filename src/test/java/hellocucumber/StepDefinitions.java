package hellocucumber;

import io.cucumber.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    static {
        WebDriverManager.chromedriver().setup();
    }

    WebDriver driver = new ChromeDriver();

    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("in given block");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("I have chrome")
    public void iHaveChrome() {
        driver.manage().window();
    }

    @When("I enter URL")
    public void iEnterURL() {
        driver.get("https://www.next.co.uk/");
    }

    @Then("NEXT website should open")
    public void nextWebsiteShouldOpen() {
        Assert.assertEquals("Next Official Site: Online Fashion, Kids Clothes & Homeware", driver.getTitle());

        driver.quit();
    }



}
