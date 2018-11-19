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
import java.lang.String as String
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Перейти в меню "Планирование"'
WebUiBuiltInKeywords.click(findTestObject('Pages/page_home/span_planning'))

'Нажать на кнопку "Сформировать бюджет"'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/a_newBudget'))

'Изменить год бюджета'
new_budgetYear = WebUiBuiltInKeywords.modifyObjectProperty(findTestObject('menu_planning/page_year/radio_budgetYear'), 'value', 
    'equals', BudgetYear, true)

'Выбрать бюджет'
WebUiBuiltInKeywords.check(new_budgetYear)

'Нажать кнопку подтверждения формирования бюджета'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/page_year/button_OK'))

'Проверка доступности кнопки выбора источника финансирования'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_budget/btn_sourceFinancing'), 60)

'Раскрыть справочник выбора источника финансирования'
WebUI.click(findTestObject('Documents/document_budget/btn_sourceFinancing'))

'Найти источник финансирования в справочнике'
WebUI.setText(findTestObject('Documents/document_budget/dictionary_sourceFinancing/find_sourceFinancing'), SourceFinancing)

WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть справочник выбора КБК'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_budget/btn_KBK'))

WebUI.waitForElementPresent(findTestObject('Documents/document_budget/dictionary_KBK/find_KBK'), 180)

'Ввести искомое значение КБК'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_budget/dictionary_KBK/find_KBK'), KBK)

'Нажать на кнопку "Найти"'
WebUiBuiltInKeywords.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание: модальный контрол'
not_run: WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('special/modal_Budget'), 60)

'Ожидание: модального контрола'
not_run: WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/modal fade'), 60)

'Ввести сумму лимита'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_budget/input_limitAmount'), limitAmount)

'Ожидание перехода маски в определенный статус'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 60)

'Ожидание недоступности маски, перекрывающей "Сохранить"'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 60)

'Нажать кнопку "Сохранить" бюджет'
WebUiBuiltInKeywords.click(findTestObject('BASE/btn_save'))

'Проверка успешного завершения регистрации бюджета'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/btn_edit'), 60)

'Закрыть браузер'
WebUI.closeBrowser()

