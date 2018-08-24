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

'Авторизация исполнителем заказчика'
WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Перейти в Планирование\r\n'
WebUI.click(findTestObject('page_home/span_planning'))

'Перейти к плану закупок'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/a_purchasePlan'))

'Сформировать новый план закупок'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/btn_newPurchasePlan'))

'Изменить год формирования плана закупок'
new_budgetYear = WebUiBuiltInKeywords.modifyObjectProperty(findTestObject('menu_planning/page_year/radio_budgetYear'), 'value', 
    'equals', GlobalVariable.BudgetYear, true)

'Установить год формирования плана закупок'
WebUiBuiltInKeywords.check(new_budgetYear)

'Выбрать год формирования плана закупок'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/page_year/button_OK'))

'Раскрыть адресную книгу выбора ответственного исполнителя'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/button_otv'))

'Найти ответственного исполнителя'
WebUiBuiltInKeywords.setText(findTestObject('document_purchasePlan/input_otv'), GlobalVariable.Login)

'Установить чек напротив найденной фамилии\r\n'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/check_otv'))

'Завершить выбор ответственного исполнителя'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/btn_select'))

'Раскрыть адресную книгу для выбора утверждающего\r\n'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/button_utv'))

'Ввести в поле поиска адресной книги фамилию '
WebUiBuiltInKeywords.setText(findTestObject('document_purchasePlan/input_utv'), '')

'Напротив найденной фамилии установить чек'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/check_otv'))

'Завершить выбор Утверждающего'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/btn_select'))

'Сохранить документ'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/btn_save'))

'Проверить наличие кнопки "Редактировать", чтобы убедиться в успешности операции'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

