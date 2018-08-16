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

'Авторизация исполнителем заказчика'
WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть план закупок по определенному году'
WebUI.callTestCase(findTestCase('Base/Purchase plan/Open purchase plan'), [:], FailureHandling.STOP_ON_FAILURE)

'Нажать на кнопку "Создать позицию ПЗ"'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/btn_newPPZ'))

'Раскрыть список выбора Периодичности закупки'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/btn_purchaseFrequency'))

'Выбрать первую попавшуются периодичность'
WebUI.check(findTestObject('DOCUMENT/Dialog_requisite/check_item'), FailureHandling.STOP_ON_FAILURE)

'Завершить выбор периодичности'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dialog_requisite/btn_select'))

'Раскрыть словарь выбора ОКПД2'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/btn_OKPD2'))

'Найти определенный ОКПД2'
WebUiBuiltInKeywords.setText(findTestObject('document_PPZ/find_OKPD2'), GlobalVariable.OKPD2)

'Выбрать найденный ОКПД2'
WebUiBuiltInKeywords.check(findTestObject('DOCUMENT/Dialog_requisite/check_item'))

'Завершить выбор ОКПД2'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dialog_requisite/btn_select'))

'Ввести наименование закупки'
WebUiBuiltInKeywords.setText(findTestObject('document_PPZ/input_nameObjectPurchase'), GlobalVariable.NameObjectPurchase)

'Перейти на вкладку Финансов'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/menu_financing'))

'Раскрыть список КБК'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/btn_KBK'))

'Установить чек на первом попавшемся КБК'
WebUiBuiltInKeywords.check(findTestObject('DOCUMENT/Dialog_requisite/check_item'))

'Завершить выбор КБК'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dialog_requisite/btn_select'))

'Ввести Сумму финансирования'
WebUiBuiltInKeywords.setText(findTestObject('document_PPZ/input_amountFinancing'), GlobalVariable.AmountFinance)

'Перейти на вкладку Обоснования потребности закупки'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/menu_rationaleNeed'))

'Раскрыть список с наименованиями государственных программ'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/btn_targetedPrograms'))

'Выбрать первое попавшееся в списке значение'
WebUiBuiltInKeywords.check(findTestObject('DOCUMENT/Dialog_requisite/check_item'))

'Завершить выбор наименования государственной программы'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dialog_requisite/btn_select'))

'Раскрыть список с наименованиями предприятий'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/btn_programActivities'))

'Установить чек напротив первого попавшегося мероприятия'
WebUiBuiltInKeywords.check(findTestObject('DOCUMENT/Dialog_requisite/check_item'))

'Завершить выбор мероприятия'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dialog_requisite/btn_select'))

'Перейти на вкладку Обоснования закупки'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/menu_rationalePurchase'))

'Ввести определнное значение в поле "Обоснование соответствия объекта"'
WebUiBuiltInKeywords.setText(findTestObject('document_PPZ/input_conformity'), GlobalVariable.conformiti)

'Сохранить документ'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/btn_save'))

'Проверить доступность кнопки "Редактировать" в качестве подтверждения успешной регистрации документа'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

