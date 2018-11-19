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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Нажать на кнопку "Создать позицию ПЗ"'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_purchasePlan/btn_newPPZ'))

'Раскрыть список выбора Периодичности закупки'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPZ/btn_purchaseFrequency'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть словарь выбора ОКПД2'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPZ/btn_OKPD2'))

'Найти определенный ОКПД2'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPZ/find_OKPD2'), OKPD2)

WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввести наименование закупки'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPZ/input_nameObjectPurchase'), NameObjectPurchase)

'Перейти на вкладку Финансов'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPZ/menu_financing'))

'Раскрыть список КБК'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPZ/btn_KBK'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввести Сумму финансирования'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPZ/input_amountFinancing'), AmountFinance)

'Перейти на вкладку Обоснования потребности закупки'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPZ/menu_rationaleNeed'))

'Раскрыть список с наименованиями государственных программ'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPZ/btn_targetedPrograms'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть список с наименованиями предприятий'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPZ/btn_programActivities'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Перейти на вкладку Обоснования закупки'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPZ/menu_rationalePurchase'))

'Ввести определнное значение в поле "Обоснование соответствия объекта"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPZ/input_conformity'), Conformiti)

'Сохранить документ'
WebUiBuiltInKeywords.click(findTestObject('BASE/btn_save'))

'Проверить доступность кнопки "Редактировать" в качестве подтверждения успешной регистрации документа'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/btn_edit'), 60)

'Закрыть браузер'
WebUI.closeBrowser()

