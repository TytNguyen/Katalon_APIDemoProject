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

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/button_Reset'))

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__smtpserver'), 'dsadsa')

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__displayname'), 'dsadsad')

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__account'), 'sadad')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__password'), 
    'aBritI+HA7GTu5jUXuLBbA==')

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__port'), 'fsd')

WebUI.dismissAlert()

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input__fromaddress'), 'rưerwe')

WebUI.dismissAlert()

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/button_Save'))

WebUI.waitForAlert(1)

WebUI.verifyAlertPresent(1)

message = WebUI.getAlertText()

println(' alert: ' + message)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/a_Template'))

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input_CC_cc'), 'tien.nguyen@kms-technology.com')

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input_View Content_saveTemplate'))

WebUI.navigateToUrl('http://tien.nguyen:Kms%401998@192.168.74.132:8081/EmailConfig')

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/a_Template'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/select_Resource Review 3G  Internel Allowan_ccb87a'), 
    'TemplateD', true)

WebUI.setText(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input_CC_cc'), 'tien.nguyen@kms-technology.com')

WebUI.click(findTestObject('Object Repository/Page_Email Config - KMSITMailingPresentation/input_View Content_saveTemplate'))

