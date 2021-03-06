package example

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory




public class GetDropdownBoxData {
	@Keyword
	public static List<String> getResource (TestObject objectto) {
		WebElement element = WebUiCommonHelper.findWebElement(objectto, 20);
		List<String> expectedOptions = new ArrayList<>()
		Select ele = new Select(element)
		for (WebElement option : ele.getOptions()) {
			System.out.println("Dropdown options are: " + option.getText())
			expectedOptions.add(option.getText())
		}
		return expectedOptions
	}

	@Keyword
	public static void Compare (List<String> expectedOptions, List<String> actualOptions) {
		for (int i = 0; i < expectedOptions.size(); i++) {
			if (!expectedOptions[i].equals(actualOptions[i])) {
				System.out.println("Resource " + expectedOptions[i] + " had sent mail")
			}
		}
	}
}
