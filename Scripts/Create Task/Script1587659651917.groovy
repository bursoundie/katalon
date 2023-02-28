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

WebUI.callTestCase(findTestCase('User Login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://uat.nimblex.com.ng/')

not_run: WebUI.click(findTestObject('Object Repository/task test/Page_NimbleX  Home/a_ LOGIN'))

not_run: WebUI.click(findTestObject('Object Repository/task test/Page_NimbleX  Home/label_Your User ID'))

not_run: WebUI.setText(findTestObject('Object Repository/task test/Page_NimbleX  Home/input_Login_UserName'), '19888')

not_run: WebUI.click(findTestObject('Object Repository/task test/Page_NimbleX  Home/label_Your Password'))

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/task test/Page_NimbleX  Home/input_Your User ID_Password'), 
    'i+5BGimB4GCoouppBLPUGA==')

not_run: WebUI.click(findTestObject('Object Repository/task test/Page_NimbleX  Home/button_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/task test/Page_nimbleX  General Dashboard ( General S_33ce64/a_Task Management'))

WebUI.click(findTestObject('Object Repository/task test/Page_nimbleX  General Dashboard ( General S_33ce64/a_My Tasks'))

WebUI.click(findTestObject('Object Repository/task test/Page_nimbleX  Task Management/a_ Create a New Task'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/task test/Page_nimbleX  Task Management/div_-- Please select --ComplaintsInquiriesL_9a5e27'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/task test/Page_nimbleX  Task Management/span_Lead Generation'))

WebUI.click(findTestObject('Object Repository/task test/Page_nimbleX  Task Management/input_Linked To_DueDate'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/task test/Page_nimbleX  Task Management/select_202020212022'), 
    '2021', true)

'december = 12'
not_run: WebUI.click(findTestObject('Object Repository/task test/Page_nimbleX  Task Management/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'))

'december = 12'
WebUI.click(findTestObject('task test/Page_nimbleX  Task Management/button_Today'))

not_run: WebUI.click(findTestObject('Object Repository/task test/Page_nimbleX  Task Management/div_9'))

WebUI.closeBrowser()

WebUI.delay(5)

