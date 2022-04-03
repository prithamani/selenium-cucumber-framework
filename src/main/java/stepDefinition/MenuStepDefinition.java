package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.CommonLibrary;

public class MenuStepDefinition extends CommonLibrary {
    @Given("I am on the home page {string}")
    public void i_am_on_the_home_page(String string) {
        driver.get(url);
 driver.manage().timeouts().i

    }
    @When("I hoover on the menu option {string}")
    public void i_hoover_on_the_menu_option(String string) {

    }
    @When("I click the women link")
    public void i_click_the_women_link() {

    }
    @Then("I should navigate to the women screen")
    public void i_should_navigate_to_the_women_screen() {

    }

}
