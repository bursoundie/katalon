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

not_run: WebUI.navigateToUrl('https://uat.nimblex.com.ng/Dashboard/General')

WebUI.setText(findTestObject('Object Repository/Page_Search/Page_nimbleX  General Dashboard ( General S_33ce64/input_Abiodun Osaks_txtCustomerId'), 
    '31760')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Search/Page_nimbleX  General Dashboard ( General S_33ce64/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Search/Page_nimbleX  General Dashboard ( General S_33ce64/td_192959'), 
    0)

WebUI.delay(5)

not_run: WebUI.closeBrowser()

