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

import io.cucumber.datatable.DataTable;

class TransactionDetailsStepDefs {
  @Given("the user has a transaction with the following information")
  public void the_user_has_a_transaction_with_the_following_information(DataTable dataTable) {
      // Write code here that turns the phrase above into concrete actions
      // For automatic transformation, change DataTable to one of
      // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
      // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
      // Double, Byte Short, Long, BigInteger or BigDecimal.
      //
      // For other transformations you can register a DataTableType.
    System.out.println("TODO");
  }

  @Then("the user sees at least one table line with the transaction details")
  public void the_user_sees_at_least_one_table_line_with_the_transaction_details() {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("TODO");
  }
  
  @Then("the user sees an {string} button on the {string} table column")
  public void the_user_sees_an_button_on_the_table_column(String string, String string2) {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("TODO");
  }
  
  @When("the user selects the {string} button on the first table line")
  public void the_user_selects_the_button_on_the_first_table_line(String string) {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("TODO");
  }
  
  @Then("the user sees the transaction information modal window")
  public void the_user_sees_the_transaction_information_modal_window() {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("TODO");
  }
  
  @When("the user selects the {string} button")
  public void the_user_selects_the_button(String string) {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("TODO");
  }
  
  @When("the user selects the {string} button on the {string} column")
  public void the_user_selects_the_button_on_the_column(String string, String string2) {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("TODO");
  }
  
  @Then("the user goes back to the PeeBu Home Page")
  public void the_user_goes_back_to_the_PeeBu_Home_Page() {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("TODO");
  }
  
  @Then("the user sees the updated transaction with the {string} category")
  public void the_user_sees_the_updated_transaction_with_the_category(String string) {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("TODO");
  }
  
  @Then("the user sees the following information on the details")
  public void the_user_sees_the_following_information_on_the_details(DataTable dataTable) {
      // Write code here that turns the phrase above into concrete actions
      // For automatic transformation, change DataTable to one of
      // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
      // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
      // Double, Byte Short, Long, BigInteger or BigDecimal.
      //
      // For other transformations you can register a DataTableType.
      System.out.println("TODO");
  }
}