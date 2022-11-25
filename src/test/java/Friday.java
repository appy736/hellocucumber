import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today ) ? "TGIF" : "Nope";
    }
}

public class Friday {

    private String today;
    private String actualAnswer ;
    @Given("Today is {string}")
    public void todayIsSunday(String day) {
        today = day ;
    }

    @When("I ask whether its Friday yet")
    public void iAskWhetherItsFridayYet() {
        actualAnswer= IsItFriday.isItFriday(today ) ;

    }

    @Then("I should be told {string}")
    public void iShouldBeToldNope(String expectedAnswer) {
        Assert.assertEquals(expectedAnswer  ,actualAnswer );
    }

    @Given("today is friday")
    public void today_is_Friday() {
        today = "Friday";
    }
}
