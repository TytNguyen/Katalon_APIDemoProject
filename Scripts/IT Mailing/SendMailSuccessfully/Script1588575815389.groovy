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

CustomKeywords.'example.Login.LoginAuthen'('tien.nguyen', 'Kms@1998', 'home')

WebUI.uploadFile(findTestObject('Object Repository/Page_Index - KMSITMailingPresentation/input_Import_file'), 'D:\\project\\Book2.xlsx')

WebUI.click(findTestObject('Object Repository/Page_Index - KMSITMailingPresentation/input_Book2xlsx_import'))

expectedOptions = CustomKeywords.'example.GetDropdownBoxData.getResource'(findTestObject('Object Repository/Page_Index - KMSITMailingPresentation/select_All'))

WebUI.selectOptionByValue(findTestObject('Page_Index - KMSITMailingPresentation/select_All'), 'Review 3G / Internet Allowance', false)

WebUI.click(findTestObject('Object Repository/Page_Index - KMSITMailingPresentation/span_Send mails'))

result = WebUI.getText(findTestObject('Object Repository/Page_Index - KMSITMailingPresentation/span_Emails failed to send'))

WebUI.verifyMatch(result, 'Emails sent!', true)

actualOptions = CustomKeywords.'example.GetDropdownBoxData.getResource'(findTestObject('Object Repository/Page_Index - KMSITMailingPresentation/select_All'))

CustomKeywords.'example.GetDropdownBoxData.Compare'(expectedOptions, actualOptions)

WebUI.closeBrowser()

