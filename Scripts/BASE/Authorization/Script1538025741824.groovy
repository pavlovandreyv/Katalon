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

'Открыть браузер'
WebUiBuiltInKeywords.openBrowser(GlobalVariable.Server)

'Удалить куки браузера'
WebUI.deleteAllCookies()

'Обновить страницу'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'Развернуть браузер на весь экран'
WebUI.maximizeWindow()

'Ввести логин'
WebUiBuiltInKeywords.setText(findTestObject('page_authorization/input_login'), GlobalVariable.Login)

'Ввести пароль'
WebUiBuiltInKeywords.setText(findTestObject('page_authorization/input_password'), GlobalVariable.Password)

'Нажать на кнопку "Вход"'
WebUiBuiltInKeywords.click(findTestObject('page_authorization/button_come'))

'Ожидание доступности кнопки "Выход"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('page_home/span_exit'), 60)

