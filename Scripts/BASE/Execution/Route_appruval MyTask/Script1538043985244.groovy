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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Открыть браузер'
WebUiBuiltInKeywords.openBrowser(GlobalVariable.Server)

'Очистить куки (в IE иногда с первого раза не чистит)'
for (def index : (0..5)) {
    'Удалить куки'
    WebUI.deleteAllCookies()
}

'Обновить страницу'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'Развернуть браузер на весь экран'
WebUI.maximizeWindow()

'Ввести Логин'
WebUiBuiltInKeywords.setText(findTestObject('page_authorization/input_login'), GlobalVariable.Login)

'Ввести Пароль'
WebUiBuiltInKeywords.setText(findTestObject('page_authorization/input_password'), GlobalVariable.Password)

'Нажать Войти'
WebUiBuiltInKeywords.click(findTestObject('page_authorization/btn_logIn'))

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('page_home/span_exit'), 60)

'Перейти на вкладку Утверждения'
WebUI.navigateToUrl(GlobalVariable.Server + '/Performer/Confirmations')

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/wait myTask_menu'), 60)

'Развернуть меню действий'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/action_myTask'))

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/block menu_myTask'), 60)

'Нажать "Утвердить"'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/action_approval'))

'Выбрать сертификат'
WebUI.callTestCase(findTestCase('BASE/Certificate selection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('my_tasks/action_myTask'), 60)

'Закрыть браузер'
WebUI.closeBrowser()

