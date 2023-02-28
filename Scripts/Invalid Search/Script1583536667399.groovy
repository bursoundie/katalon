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

WebUI.navigateToUrl('https://uat.nimblex.com.ng/')

WebUI.click(findTestObject('Object Repository/Invalid_Search/Page_NimbleX  Home/a_ LOGIN'))

WebUI.setText(findTestObject('Object Repository/Invalid_Search/Page_NimbleX  Home/input_Login_UserName'), 'viczona3@qa.team')

WebUI.setText(findTestObject('Object Repository/Invalid_Search/Page_NimbleX  Home/input_Your User ID_Password_1'), 'Green100%')

WebUI.click(findTestObject('Object Repository/Invalid_Search/Page_NimbleX  Home/button_Login'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Invalid_Search/Page_nimbleX  General Dashboard ( General S_33ce64/input_Abiodun Osaks_txtCustomerId'), 
    '37')

WebUI.setText(findTestObject('Object Repository/Invalid_Search/Page_nimbleX  General Dashboard ( General S_33ce64/input_Abiodun Osaks_txtEmploymentId'), 
    '73')

WebUI.click(findTestObject('Invalid Login Response/Page_nimbleX  General Dashboard ( General Statistics  Customer Search )/button_Search'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_nimbleX  General Dashboard ( General S_33ce64/td_No data available'), 0, 
    FailureHandling.OPTIONAL)

WebUI.takeScreenshot('C:\\Users\\Respect\\Katalon Studio\\FCMB\\Screenshots\\invalidsearch.jpeg')

WebUI.delay(5)

WebUI.closeBrowser()

