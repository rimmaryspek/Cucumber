package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {
    @When("user clicks on EmployeeList option")
    public void user_clicks_on_employee_list_option() {
        WebElement epmListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        click(epmListOption);
    }
    @When("user enter valid employee id")
    public void user_enter_valid_employee_id() {
        WebElement epmIdField = driver.findElement(By.id("empsearch_id"));
       sendText(epmIdField,"45154A");
    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        WebElement searchButton = driver.findElement(By.id("searchBtn"));
       click(searchButton);
    }
    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("Employee information can be seen");
    }
    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        WebElement searchNameField = driver.findElement(By.id("empsearch_employee_name_empName"));
        sendText(searchNameField, "dawggy");
    }
}
