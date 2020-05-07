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

WebUI.openBrowser('')

CustomKeywords.'example.Login.LoginAuthen'('tien.nguyen', 'Kms@1998', 'emailconfig')


WebUI.click(findTestObject('Page_Email Config - KMSITMailingPresentation/button_Reset'))

WebUI.setText(findTestObject('Page_Email Config - KMSITMailingPresentation/input__smtpserver'), smtp)

WebUI.setText(findTestObject('Page_Email Config - KMSITMailingPresentation/input__port'), port)

WebUI.setText(findTestObject('Page_Email Config - KMSITMailingPresentation/input__displayname'), name)

WebUI.setText(findTestObject('Page_Email Config - KMSITMailingPresentation/input__fromaddress'), address)

WebUI.setText(findTestObject('Page_Email Config - KMSITMailingPresentation/input__account'), account)

WebUI.setEncryptedText(findTestObject('Page_Email Config - KMSITMailingPresentation/input__password'), password)

WebUI.click(findTestObject('Page_Email Config - KMSITMailingPresentation/button_Save'))

result = WebUI.getText(findTestObject('Page_Email Config - KMSITMailingPresentation/span_Save successfully'))

WebUI.verifyMatch(result, 'Save successfully!', true)

WebUI.click(findTestObject('Page_Email Config - KMSITMailingPresentation/a_Template'))

WebUI.closeBrowser()

