import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Открыть браузер'
WebUI.openBrowser(GlobalVariable.Server)

WebUI.maximizeWindow()

'Перейти в раздел Регистрации'
WebUI.click(findTestObject('Pages/page_authorization/a_registration'))

WebUI.waitForElementPresent(findTestObject('Pages/page_registration/btn_registration'), 0)

'Проверка наличия полей на форме'
WebUI.verifyElementPresent(findTestObject('Pages/page_registration/btn_organization'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_inn'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_chief'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/btn_pullEP'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_changeChief'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_lastName'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_firstName'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_middleName'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_position'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_email'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_phone'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_login'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_password'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/input_passwordConfirm'), 0)

'Нажать на "Регистрация", для того чтобы обязательные поля подсветились'
WebUI.click(findTestObject('Pages/page_registration/btn_registration'))

'Проверка обязательности полей'
WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_organization'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_lastName'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_firstName'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_middleName'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_position'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_email'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_phone'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_login'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_password'), 0)

WebUI.verifyElementPresent(findTestObject('Pages/page_registration/required/required_passwordConfirm'), 0)

WebUI.closeBrowser()

