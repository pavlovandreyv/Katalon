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

'Авторизоваться'
WebUI.callTestCase(findTestCase('BASE/Authorization'), [('Login') : findTestData('Test data.xlsx/Tab_Variables_User').getValue('default', 1)
        , ('Password') : findTestData('Test data.xlsx/Tab_Variables_User').getValue('default', 2), ('DeleteAllCookies') : false], 
    FailureHandling.STOP_ON_FAILURE)

'Открыть протокол Вскрытия'
WebUI.callTestCase(findTestCase('BASE/Open/Open protocol review'), [:], FailureHandling.STOP_ON_FAILURE)

'Отправить в ЕИС-эмуляция'
WebUI.callTestCase(findTestCase('BASE/EIS/Send to EIS'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Переключить статусы протокола'
WebUI.callTestCase(findTestCase('BASE/EIS/Update from EIS'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание доступности следущего контрола'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/Tab/tab_route'), 60)

'Перейти на вкладку Маршрута'
WebUiBuiltInKeywords.click(findTestObject('BASE/Tab/tab_route'))

'Ожидание доступности меню действий'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/Route/action_route'), 60)

'Развернуть меню действий над Поручением'
WebUiBuiltInKeywords.click(findTestObject('BASE/Route/action_route'))

'Выбрать Отчитаться об исполнении'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/action_Performance'))

'Ожидание: модальный контрол'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/modal-loading-wrapper'), 60)

'Завершить исполнение'
WebUiBuiltInKeywords.click(findTestObject('BASE/Alert/btn_OK'))

'Ожидание завершения операции'
WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('BASE/Route/action_route'), 60)

WebUI.closeBrowser()

