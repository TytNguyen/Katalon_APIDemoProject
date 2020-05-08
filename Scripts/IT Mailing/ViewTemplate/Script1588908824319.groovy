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

CustomKeywords.'example.Login.LoginAuthen'('tien.nguyen', 'Kms@1998', 'emailconfig')

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/a_Template'))

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input_View Content_resetTemplate'))

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input_CC_cc'), 'tien.nguyen@kms-technology.com')

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__subject'), 'testing')

WebUI.switchToFrame(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/iframe'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/body_TemplateADeadlineDateabcb'), 
    '[TemplateA]\n[DeadlineDate]')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/button_View Content'))

temp = WebUI.getText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/viewData'))

println('No of Resources are ' + temp)

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/button_'))

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input_View Content_saveTemplate'))

result = WebUI.getText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/span_Save successfully'))

WebUI.verifyMatch(result, 'Save successfully!', true)

WebUI.closeBrowser()

