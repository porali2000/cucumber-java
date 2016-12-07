package step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import feature.Belly;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by x1ku on 12/7/2016.
 */
public class StepDefinitions {
    private Belly belly;
    private int waitingTime;

    @Given("^I eat (\\d+) cakes$")
    public void eat_cakes(int cakes) throws Throwable {
        belly = new Belly();
        belly.eat(cakes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int waitingTime) throws Throwable {
        this.waitingTime = waitingTime;
    }

    @Then("^my belly should (.*)$")
    public void my_belly_should_sound_as_expected(String expectedSound) throws Throwable {
        String actualSound = belly.getSound(waitingTime);
        assertThat(actualSound, is(expectedSound));
    }
}
