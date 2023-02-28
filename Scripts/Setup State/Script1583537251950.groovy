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

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://uat.nimblex.com.ng/')

not_run: WebUI.click(findTestObject('Object Repository/Setup State/Page_NimbleX  Home/a_ LOGIN'))

not_run: WebUI.setText(findTestObject('Object Repository/Setup State/Page_NimbleX  Home/input_Login_UserName'), 'viczona3@qa.team')

not_run: WebUI.click(findTestObject('Object Repository/Setup State/Page_NimbleX  Home/label_Your Password'))

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Setup State/Page_NimbleX  Home/input_Your User ID_Password'), 
    'i+5BGimB4GCoouppBLPUGA==')

not_run: WebUI.click(findTestObject('Object Repository/Setup State/Page_NimbleX  Home/button_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Setup State/Page_nimbleX  General Dashboard ( General S_33ce64/a_Configuration  Setup'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Setup State/Page_nimbleX  General Dashboard ( General S_33ce64/a_State Setup'))

WebUI.click(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/span_Add new record'))

'Change the input value '
WebUI.setText(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Name_StateName'), 'teststate')

'Change the input value '
WebUI.setText(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Code_StateCode'), '00008935')

'Change the input value '
WebUI.setText(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Type_Type'), 'VALID')

'Change the input value '
WebUI.setText(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Region_Region'), 'YABALEFT')

'Change the input value '
WebUI.setText(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Country_Country'), 'NIGERIA')

not_run: WebUI.click(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_Active_IsActive'))

not_run: WebUI.click(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_Active_IsActive'))

WebUI.click(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/span_Save'))

WebUI.delay(5)

//WebUI.sendKeys(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Setup_filter'), Keys.chord(Keys.ENTER))
//WebUI.sendKeys(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Setup_filter'), Keys.chord(Keys.BACK_SPACE))
//WebUI.setText(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Setup_filter'), 'TEwSERS')
'Serach parameter'
WebUI.setText(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Setup_filter'), 'teststate')

WebUI.sendKeys(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Setup_filter'), Keys.chord(
        Keys.CONTROL, Keys.ENTER))

WebUI.sendKeys(findTestObject('Object Repository/Setup State/Page_nimbleX  State Setup/input_State Setup_filter'), Keys.chord(
        Keys.CONTROL, Keys.ENTER))

WebUI.delay(10)

WebUI.takeScreenshot('C:\\Users\\Respect\\Katalon Studio\\FCMB\\Screenshots\\SETUP.jpeg')

WebUI.closeBrowser()

