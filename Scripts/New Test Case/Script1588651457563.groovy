import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://tien.nguyen:Kms%401998@192.168.74.132:8081/EmailConfig')

WebUI.click(findTestObject('Page_Email Config - KMSITMailingPresentation/a_Template'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__subject'))

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__subject'), 'abc')

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/p_testing 123'))

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/body_TemplateADeadlineDateabcb'), 
    '<p style="">[TemplateA]</p><p style="">[DeadlineDate]</p><p style="">abcb</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Page_Email Config - KMSITMailingPresentation/input_View Content_saveTemplate'))

WebUI.click(findTestObject('Page_Email Config - KMSITMailingPresentation/span_Save successfully'))

