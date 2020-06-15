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
		List<List<String>> data = dataTable.asLists(String.class);

		WebUI.navigateToUrl(GlobalVariable.URL)
		Thread.sleep(1000);

		String categoryText = WebUI.getText(findTestObject('Object Repository/Page_peebu_web/span_Category'));

		if (!(categoryText.equals(data.get(1).get(3)))) {
			WebUI.waitForElementVisible(findTestObject('Object Repository/Page_peebu_web/button_info'), 5)
			WebUI.click(findTestObject('Object Repository/Page_peebu_web/button_info'));
			WebUI.waitForElementVisible(findTestObject('Object Repository/Page_peebu_web/dropdown_Category'), 5)
			WebUI.click(findTestObject('Object Repository/Page_peebu_web/dropdown_Category'));
			WebUI.scrollToElement(findTestObject('Object Repository/Page_peebu_web/button_Vet'), 10);
			WebUI.waitForElementVisible(findTestObject('Object Repository/Page_peebu_web/button_Vet'), 5)
			WebUI.click(findTestObject('Object Repository/Page_peebu_web/button_Vet'))
			WebUI.waitForElementVisible(findTestObject('Object Repository/Page_peebu_web/button_Save'), 5)
			WebUI.click(findTestObject('Object Repository/Page_peebu_web/button_Save'));
			Thread.sleep(1000);
		}
	}

	@Then("the user sees at least one table line with the transaction details")
	public void the_user_sees_at_least_one_table_line_with_the_transaction_details() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_peebu_web/Filter/first_column_entity'), 10)
	}

	@Then("the user sees an {string} button on the {string} table column")
	public void the_user_sees_an_button_on_the_table_column(String string, String string2) {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_peebu_web/button_' + string), 10)
	}

	@When("the user selects the {string} button on the first table line")
	public void the_user_selects_the_button_on_the_first_table_line(String string) {
		WebUI.waitForElementVisible(findTestObject('Object Repository/Page_peebu_web/button_' + string), 5)
		WebUI.click(findTestObject('Object Repository/Page_peebu_web/button_' + string))
	}

	@Then("the user sees the transaction information modal window")
	public void the_user_sees_the_transaction_information_modal_window() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_peebu_web/div_Transaction Info'), 10)
	}

	@When("the user selects the {string} button")
	public void the_user_selects_the_button(String string) {
		WebUI.waitForElementVisible(findTestObject('Object Repository/Page_peebu_web/button_' + string), 5)
		WebUI.click(findTestObject('Object Repository/Page_peebu_web/button_' + string))
		Thread.sleep(1000);
		
	}

	@Then("the user goes back to the PeeBu Home Page")
	public void the_user_goes_back_to_the_PeeBu_Home_Page() {
		//assert WebUI.getWindowTitle() == "PeeBu";
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_peebu_web/header_Current Balance'), 10)
	}

	@When("the user selects the {string} button on the {string} dropdown")
	public void the_user_selects_the_button_on_the_dropdown(String string, String string2) {
		WebUI.waitForElementVisible(findTestObject('Object Repository/Page_peebu_web/dropdown_' + string2), 5)
		WebUI.click(findTestObject('Object Repository/Page_peebu_web/dropdown_' + string2))
		WebUI.scrollToElement(findTestObject('Object Repository/Page_peebu_web/button_' + string), 10)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Page_peebu_web/button_' + string), 5)
		WebUI.click(findTestObject('Object Repository/Page_peebu_web/button_' + string))
	}

	@Then("the user sees the updated transaction with the {string} category")
	public void the_user_sees_the_updated_transaction_with_the_category(String string) {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_peebu_web/span_Category'), string)
	}

	@Then("the user sees the following information on the details")
	public void the_user_sees_the_following_information_on_the_details(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);

		assert WebUI.getAttribute(findTestObject('Object Repository/Page_peebu_web/details_Entity'), 'value').equals(data.get(1).get(0))
		assert WebUI.getAttribute(findTestObject('Object Repository/Page_peebu_web/details_Amount'), 'value').equals(data.get(1).get(1))
		assert WebUI.getAttribute(findTestObject('Object Repository/Page_peebu_web/details_Type'), 'value').equals(data.get(1).get(2))
		assert WebUI.getText(findTestObject('Object Repository/Page_peebu_web/details_Category')).equals(data.get(1).get(3))
	}
}