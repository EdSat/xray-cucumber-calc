package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.xray.tutorials.Calculator;
import sun.jvm.hotspot.debugger.Page;

import static org.junit.Assert.*;

public class StepDefinitions {
    private Integer int1;
    private Integer int2;
    private Integer result;


    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(Integer int1) {
        this.int2 = this.int1;
        this.int1 = int1;
    }
    
    
    @When("I press add")
    public void i_press_add() {
        this.result =  Calculator.Add(this.int1, this.int2);
    }

    @When("I press multiply")
    public void i_press_multiply() {
        this.result =  Calculator.Multiply(this.int1, this.int2);
    }


    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(Integer value) {
        assertEquals(value, this.result);
    }

    @Given("that I am on the base url")
    public void that_i_am_on_the_base_url() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I login")
    public void i_login() {
        System.out.println("Trying to login");
    }
    @Then("I am logged in successfully")
    public void i_am_logged_in_successfully() {
        System.out.println("Successfull Login");
    }
    @When("I create a new Wareneingang")
    public void i_create_a_new_wareneingang() {
        System.out.println("Created new Wareneingang");
    }

}
