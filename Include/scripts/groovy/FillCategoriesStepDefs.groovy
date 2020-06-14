import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class FillCategoriesStepDefs {
	@Given("there is at least one transaction with no category")
	public void there_is_at_least_one_transaction_with_no_category() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@Then("the user should see an alert to fill missing categories")
	public void the_user_should_see_an_alert_to_fill_missing_categories() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@Given("all transactions have a valid category field")
	public void all_transactions_have_a_valid_category_field() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@Then("the user should not be able to see the {string} alert")
	public void the_user_should_not_be_able_to_see_the_alert(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@Then("the user should see a modal with the transactions with no category")
	public void the_user_should_see_a_modal_with_the_transactions_with_no_category() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@Given("there are <number> transactions with no category")
	public void there_are_number_transactions_with_no_category() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@Then("the user should see <number> transactions on the opened modal")
	public void the_user_should_see_number_transactions_on_the_opened_modal() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@When("the user selects the <category> category for the <transactionid> transaction")
	public void the_user_selects_the_category_category_for_the_transactionid_transaction() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@Then("the user should go back to the PeeBu Home Page")
	public void the_user_should_go_back_to_the_PeeBu_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
	
	@Then("the <transactionid> transaction should have the <category> category")
	public void the_transactionid_transaction_should_have_the_category_category() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TODO");
	}
}