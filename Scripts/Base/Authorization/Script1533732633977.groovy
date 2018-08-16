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

'Переход на тестовый стенд'
WebUiBuiltInKeywords.openBrowser(GlobalVariable.Server)

'Максимальный экран браузера'
WebUI.maximizeWindow()

'Проверка наличия поля "Имя пользователя"'
WebUI.verifyElementPresent(findTestObject('page_authorization/input_login'), 0)

'Проверка наличия поля "Пароль"'
WebUI.verifyElementPresent(findTestObject('page_authorization/input_password'), 0)

'Проверка наличия кнопки "Войти"'
WebUI.verifyElementPresent(findTestObject('page_authorization/button_come'), 0)

'Проверка наличия кнопки "Войти по ЭП"'
WebUI.verifyElementPresent(findTestObject('page_authorization/button_comeEP'), 0)

'Проверка наличия ссылки "Регистрация"'
WebUI.verifyElementPresent(findTestObject('page_authorization/a_registry'), 0)

'Проверка наличия ссылки "Восстановление пароля"'
WebUI.verifyElementPresent(findTestObject('page_authorization/a_passwordRecovery'), 0)

'Ввод логина'
WebUiBuiltInKeywords.setText(findTestObject('page_authorization/input_login'), GlobalVariable.Login)

'Ввод пароля'
WebUiBuiltInKeywords.setText(findTestObject('page_authorization/input_password'), GlobalVariable.Password)

'Клик по кнопке "Войти"'
WebUiBuiltInKeywords.click(findTestObject('page_authorization/button_come'))

'Проверка наличия меню "Мои задачи"'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('page_home/span_myTasks'), 0)

'Проверка наличия меню "Администрирование"'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('page_home/span_administration'), 0)

'Проверка наличия кнопки "Выход"'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('page_home/span_exit'), 0)

