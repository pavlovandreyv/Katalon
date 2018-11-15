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

'Авторизация'
WebUI.callTestCase(findTestCase('BASE/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Перейти в меню "Планирование"'
WebUiBuiltInKeywords.click(findTestObject('page_home/span_planning'))

'Нажать на кнопку "Сформировать бюджет"'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/a_newBudget'))

'Изменить год бюджета'
new_budgetYear = WebUiBuiltInKeywords.modifyObjectProperty(findTestObject('menu_planning/page_year/radio_budgetYear'), 'value', 
    'equals', GlobalVariable.BudgetYear, true)

'Выбрать бюджет'
WebUiBuiltInKeywords.check(new_budgetYear)

'Нажать кнопку подтверждения формирования бюджета'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/page_year/button_OK'))

'Проверка доступности кнопки выбора источника финансирования'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_budget/btn_sourceFinancing'), 60)

'Раскрыть справочник выбора источника финансирования'
WebUI.click(findTestObject('document_budget/btn_sourceFinancing'))

'Найти источник финансирования в справочнике'
WebUI.setText(findTestObject('document_budget/dictionary_sourceFinancing/find_sourceFinancing'), GlobalVariable.sourceFinancing)

'Установить чек на первом найденном значении'
WebUiBuiltInKeywords.click(findTestObject('document_budget/dictionary_sourceFinancing/el_sourceFinancing'))

'Выбрать источник финансирования и закрыть справочник'
WebUiBuiltInKeywords.click(findTestObject('document_budget/dictionary_sourceFinancing/btn_select'))

'Раскрыть справочник выбора КБК'
WebUiBuiltInKeywords.click(findTestObject('document_budget/btn_KBK'))

'Ввести искомое значение КБК'
WebUiBuiltInKeywords.setText(findTestObject('document_budget/dictionary_KBK/find_KBK'), GlobalVariable.KBK)

'Нажать на кнопку "Найти"'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

'Проверка наличия чекбокса выбора КБК'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_budget/dictionary_KBK/check_KBK'), 180)

'Установить чек на первом найденном значении'
WebUiBuiltInKeywords.click(findTestObject('document_budget/dictionary_KBK/check_KBK'))

'Выбрать КБК и закрыть справочник'
WebUiBuiltInKeywords.click(findTestObject('document_budget/dictionary_KBK/btn_select'))

'Ожидание: модальный контрол'
WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('special/modal_Budget'), 60)

'Ожидание: модального контрола'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/modal fade'), 60)

'Ввести сумму лимита'
WebUiBuiltInKeywords.setText(findTestObject('document_budget/input_limitAmount'), GlobalVariable.limitAmount)

'Ожидание перехода маски в определенный статус'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 60)

'Ожидание недоступности маски, перекрывающей "Сохранить"'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 60)

'Нажать кнопку "Сохранить" бюджет'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/btn_save'))

'Проверка успешного завершения регистрации бюджета'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 60)

'Закрыть браузер'
WebUI.closeBrowser()
