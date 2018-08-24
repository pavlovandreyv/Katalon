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

'Авторизоваться исполнителем заказчика'
WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть определенный план график'
WebUI.callTestCase(findTestCase('Base/Schedule plan/Open schedule plan'), [:], FailureHandling.STOP_ON_FAILURE)

'Перейти на вкладку позиции план-графика'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_vertical/menu_positionSchedulePlan'))

'Изменить название закупки на определенный в профиле'
url_ppz1 = WebUiBuiltInKeywords.modifyObjectProperty(findTestObject('document_purchasePlan/PPZ/a_urlPPZ'), 'text', 'equals', 
    GlobalVariable.NameObjectPurchase, true)

'Получить url ППГ для перехода внутри 1й вкладки'
url_ppz2 = WebUI.getAttribute(url_ppz1, 'href')

'Перейти на ППГ внутри одной вкладки'
WebUiBuiltInKeywords.navigateToUrl(url_ppz2)

'Нажать на кнопку "Создать позицию"'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_newPosition'))

'Ввести название позиции из профиля'
WebUiBuiltInKeywords.setText(findTestObject('document_positionPPG/input_namePosition'), GlobalVariable.NameObjectPurchase)

'Перейти на вкладку Сумма выплат'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_vertical/menu_amountPayments'))

'Ожидание следующего контрола'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_positionPPG/input_averagePrice'), 60)

'Ввести среднюю стоимость за единицу'
WebUiBuiltInKeywords.setText(findTestObject('document_positionPPG/input_averagePrice'), GlobalVariable.AmountPPG)

'Раскрыть спраочник единиц измерения'
WebUiBuiltInKeywords.click(findTestObject('document_positionPPG/btn_unit'))

'Ожидание доступности значения справочника'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Выбрать первое в списке значение единицы измерения'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор значения'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ввести количество текущего года'
WebUiBuiltInKeywords.setText(findTestObject('document_positionPPG/input_numberCurrentYear'), '1')

'Сохранить документ'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание успешного завершения операции доступностью кнопки редактирования'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 60)

