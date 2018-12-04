import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL_DEV)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HOME_PAGE/MENU_icon'))

WebUI.delay(2)

WebUI.click(findTestObject('HOME_PAGE/a_Login'))

WebUI.delay(2)

WebUI.setText(findTestObject('LOGIN_PAGE/input_Username_username'), LOGIN)

WebUI.setText(findTestObject('LOGIN_PAGE/input_Password_password'), PASSWORD)

WebUI.click(findTestObject('LOGIN_PAGE/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Make appointment/select_Facility'), 2)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

