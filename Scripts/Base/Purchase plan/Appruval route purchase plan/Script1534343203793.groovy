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

'Авторизация утверждающим'
WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход в раздел На исполнении'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/menu_performance'))

'Переход на вкладку Утверждения'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/span_approval'))

'Развернуть меню действия Утверждения'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/act_menu'))

'Выбрать действие Утвердить'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/act_approval'))

'Выбрать сертификат'
WebUI.callTestCase(findTestCase('Base/Certificate selection'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание завершения операции утверждения'
WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('my_tasks/act_menu'), 60)

'Открыть план закупок'
WebUI.callTestCase(findTestCase('Base/Purchase plan/Open purchase plan'), [:], FailureHandling.STOP_ON_FAILURE)

'Перейти на вкладку Маршрута'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/toolbar_reading/menu_route'))

'Ожидание доступности меню действий'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('routs/route_menu'), 60)

'Развернуть меню действий над Поручением'
WebUiBuiltInKeywords.click(findTestObject('routs/route_menu'))

'Выбрать Отчитаться об исполнении'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/act_reportPerformance'))

'Завершить исполнение'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dialog/btn_OK'))

'Ожидание завершения операции'
WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('routs/route_menu'), 60)

