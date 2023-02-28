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

not_run: WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('User Login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl('https://uat.nimblex.com.ng/')

not_run: WebUI.click(findTestObject('Object Repository/Page_Search_Emp/Page_NimbleX  Home/a_ LOGIN'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Search_Emp/Page_NimbleX  Home/label_Your User ID'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Search_Emp/Page_NimbleX  Home/input_Login_UserName'), 'viczona3@qa.team')

not_run: WebUI.click(findTestObject('Object Repository/Page_Search_Emp/Page_NimbleX  Home/label_Your Password'))

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Search_Emp/Page_NimbleX  Home/input_Your User ID_Password'), 
    'i+5BGimB4GCoouppBLPUGA==')

not_run: WebUI.click(findTestObject('Object Repository/Page_Search_Emp/Page_NimbleX  Home/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Search_Emp/Page_nimbleX  General Dashboard ( General S_33ce64/input_Abiodun Osaks_txtEmploymentId'), 
    'ABSG/ABSSC/P590')

WebUI.click(findTestObject('Object Repository/Page_Search_Emp/Page_nimbleX  General Dashboard ( General S_33ce64/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Search_Emp/Page_nimbleX  General Dashboard ( General S_33ce64/td_ABSGABSSCP590'), 
    5)

WebUI.delay(5)

WebUI.closeBrowser()

