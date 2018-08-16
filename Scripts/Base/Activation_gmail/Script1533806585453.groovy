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

'Открытие формы авторизации на gmail\r\n'
WebUI.openBrowser('https://mail.google.com')

'Ввод email\r\n'
WebUI.setText(findTestObject('page_gmail/input_email'), 'test.cognitive@gmail.com')

'Далее'
WebUiBuiltInKeywords.click(findTestObject('page_gmail/span_next'))

'Проверка достпности поля пароля'
WebUI.waitForElementClickable(findTestObject('page_gmail/input_password'), 2)

'Ввод пароля'
WebUiBuiltInKeywords.setText(findTestObject('page_gmail/input_password'), 'TestDepartment2016')

'//to do: переделать. Ожидание 1 секунда (без этого валится с ошибкой)'
not_run: WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('page_gmail/span_next'), 2)

WebUiBuiltInKeywords.click(findTestObject('page_gmail/span_next'))

'Далее'
not_run: WebUiBuiltInKeywords.sendKeys(findTestObject('page_gmail/input_password'), Keys.chord(Keys.ENTER))

'Открыть письмо с активационной ссылкой'
WebUiBuiltInKeywords.click(findTestObject('page_gmail/mail'))

'Получить url активационной ссылки для перехода внутри 1й вкладки'
url_activation = WebUiBuiltInKeywords.getAttribute(findTestObject('page_gmail/mail_url'), 'href')

'Перейти по ссылке активации пользователя'
WebUiBuiltInKeywords.navigateToUrl(url_activation)

'Проверка успешного перехода по url'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('page_gmail/message_pass'), 0)

