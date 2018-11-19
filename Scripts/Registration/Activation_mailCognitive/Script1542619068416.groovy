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

WebUI.openBrowser('https://mail.cognitive.ru')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('mail.cognitive.ru/input_login'), 0)

'Ввести Логин'
WebUI.setText(findTestObject('mail.cognitive.ru/input_login'), GlobalVariable.LoginMail)

'Ввести Пароль'
WebUI.setText(findTestObject('mail.cognitive.ru/input_password'), GlobalVariable.PasswordMail)

'Войти\r\n'
WebUI.click(findTestObject('mail.cognitive.ru/button_logIn'))

WebUI.waitForElementPresent(findTestObject('mail.cognitive.ru/mail_E1'), 0)

'Открыть письмо активации'
WebUI.doubleClick(findTestObject('mail.cognitive.ru/mail_E1'))

WebUI.waitForElementPresent(findTestObject('mail.cognitive.ru/a_E1'), 0)

'Получить url активационной ссылки для перехода внутри 1й вкладки'
url_activation = WebUiBuiltInKeywords.getAttribute(findTestObject('mail.cognitive.ru/a_E1'), 'href')

'Перейти по ссылке активации пользователя'
WebUiBuiltInKeywords.navigateToUrl(url_activation)

'Проверка успешной активации'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('gmail.com/message_pass'), 120)

WebUI.closeBrowser()

