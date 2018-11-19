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

'Перейти на вкладку утверждения'
WebUI.navigateToUrl(GlobalVariable.Server + '/Performer/Tasks')

'Ожидание скрытия сообщения загрузки'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/wait myTask_menu'), 60)

'Развернуть меню действий над Поручением'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/action_myTask'))

'Ожидание доступности кнопки Отчета об исполнении'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/block menu_myTask'), 60)

'Выбрать действие отчитаться об исполнении'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/action_Performance'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('special/modal-loading-wrapper'), 0)

'Подтвердить действие исполнения'
WebUI.click(findTestObject('BASE/Alert/btn_OK'))

'Ожидание завершения операции утверждения'
WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('my_tasks/action_myTask'), 60)

'Закрыть браузер'
WebUI.closeBrowser()

