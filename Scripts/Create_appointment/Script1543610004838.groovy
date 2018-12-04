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

WebUI.callTestCase(findTestCase('LOGIN'), [('LOGIN') : 'John Doe', ('PASSWORD') : 'ThisIsNotAPassword'], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_Make appointment/select_Facility'), 'Hongkong CURA Healthcare Center', false)

WebUI.click(findTestObject('Page_Make appointment/Checkbox_Apply for hospital'))

WebUI.setText(findTestObject('Page_Make appointment/textarea_Comment_comment'), 'Lorem Ipsum is simply dummy text ')

WebUI.click(findTestObject('Page_Make appointment/input_None_programs'))

Date today = new Date()

String todaysDate = today.format('dd/MM/yyyy')

WebUI.setText(findTestObject('Page_Make appointment/Textfield_Visit Date'), todaysDate)

println(todaysDate)

WebUI.click(findTestObject('Page_Make appointment/button_Book Appointment'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Appointment Confirmation/Appointment Confirmation_confirmation message'), 
    2)

