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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat.nimblex.com.ng/')

WebUI.click(findTestObject('Object Repository/Invalid_Search/Page_NimbleX  Home/a_ LOGIN'))

'viczona3@qa.team\r\n19888'
WebUI.setText(findTestObject('Object Repository/Invalid_Search/Page_NimbleX  Home/input_Login_UserName'), 'viczona3@qa.team')

WebUI.setText(findTestObject('Object Repository/Invalid_Search/Page_NimbleX  Home/input_Your User ID_Password_1'), 'Green100%')

WebUI.click(findTestObject('Object Repository/Invalid_Search/Page_NimbleX  Home/button_Login'))

//WebUI.waitForElementPresent(findTestObject('Page_NimbleX Login/Page_nimbleX  General Dashboard ( General Statistics  Customer Search )/a_Customer List'), 7)
WebUI.delay(5)

'set screenshot repository path'
WebUI.takeScreenshot('C:\\Users\\Respect\\Katalon Studio\\FCMB\\Screenshots\\login.jpg')

WebUI.delay(5)
WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

