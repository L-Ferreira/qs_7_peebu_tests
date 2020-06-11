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



class AccessWebsiteStepDefs {
	@Given("the user has an open browser")
	public void the_user_has_an_open_browser() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.openBrowser('')
	}

	@When("the user navigates to the PeeBu Home Page")
	public void the_user_navigates_to_the_PeeBu_Home_Page() {
		WebUI.navigateToUrl(GlobalVariable.URL)	}

	@Then("the user sees the {string} header")
	public void the_user_sees_the_header(String string) {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_peebu_web/header_' + string), 0)
	}

	@Then("the user sees the {string} component")
	public void the_user_sees_the_component(String string) {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_peebu_web/component_' + string), 0)
	}

	@When("the user scrolls down to the {string} header")
	public void the_user_scrolls_down_to_the_header(String string) {
		WebUI.scrollToElement(findTestObject('Object Repository/Page_peebu_web/header_' + string), 0)
	}
}