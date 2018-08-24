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

'Авторизоваться исполнителем заказчика'
WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть определенный план закупок'
WebUI.callTestCase(findTestCase('Base/Purchase plan/Open purchase plan'), [:], FailureHandling.STOP_ON_FAILURE)

'Перейти на вкладку позиции плана закупок'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_vertical/menu_positionPurchasePlan'))

'Изменить название закупки на определенный в профиле'
url_ppz1 = WebUiBuiltInKeywords.modifyObjectProperty(findTestObject('document_purchasePlan/PPZ/a_urlPPZ'), 'text', 'equals', 
    GlobalVariable.NameObjectPurchase, true)

'Получить url ППГ для перехода внутри 1й вкладки'
url_ppz2 = WebUI.getAttribute(url_ppz1, 'href')

'Перейти на ППГ внутри одной вкладки'
WebUiBuiltInKeywords.navigateToUrl(url_ppz2)

'Нажать на кнопку "Создать позицию ПГ"'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_newPPG'))

'Ожидание доступности 1го реквизита для ввода на форме ППГ'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_PPG/inpute_descriptionObjectPurchase'), 60)

'Ввести значение в поле "Описание объекта закупки"'
WebUI.setText(findTestObject('document_PPG/inpute_descriptionObjectPurchase'), GlobalVariable.NameObjectPurchase)

'Раскрыть справочник выбора способа определения поставщика'
WebUiBuiltInKeywords.click(findTestObject('document_PPG/btn_methodSupplier'))

'Ожидание доступности поля ввода'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_PPG/find_methodSuppler'), 60)

'Ввод определенного значения в поисковое поле'
WebUiBuiltInKeywords.setText(findTestObject('document_PPG/find_methodSuppler'), GlobalVariable.MethodSuppler)

'Нажать на кнопку найти (для успешного завершения поиска)'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'), FailureHandling.STOP_ON_FAILURE)

'Установить чек на выбранном значении'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор Способа определения поставщика'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание доступности поля "Обоснование способа определения поставщика"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_PPG/input_rationaleMethodSupplier'), 60)

'Ввести значение в поле "Обоснование способа определения поставщика"'
WebUiBuiltInKeywords.setText(findTestObject('document_PPG/input_rationaleMethodSupplier'), GlobalVariable.RationaleMethodSupplier)

'Раскрыть справочник "Метод определения НМЦК"'
WebUiBuiltInKeywords.click(findTestObject('document_PPG/btn_methodNMCK'))

'Ожидание доступности значений справочника'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 60)

'Выбрать первое в списке значение'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор Метода определения НМЦК'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ввести значение в поле "Обоснование метода"'
WebUiBuiltInKeywords.setText(findTestObject('document_PPG/input_rationaleMethod'), GlobalVariable.RathionaleMethod)

'Перейти на вкладку "Планирование платежей"'
WebUiBuiltInKeywords.click(findTestObject('document_PPG/a_paymentPlanning'))

'Ожидание доступности кнопки выбора КБК'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_budget/btn_KBK'), 60)

'Раскрыть список КБК'
WebUiBuiltInKeywords.click(findTestObject('document_PPZ/btn_KBK'))

'Установить чек на первом попавшемся КБК'
WebUiBuiltInKeywords.check(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор КБК'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ввести значение в поле "Сумма ППГ"'
WebUiBuiltInKeywords.setText(findTestObject('document_PPG/input_amountPPG'), GlobalVariable.AmountPPG)

'Перейти на вкладку "График осуществления закупки"'
WebUiBuiltInKeywords.click(findTestObject('document_PPG/a_purchaseSchedule'))

'Ожидание прогрузки реквизитов формы'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_PPG/input_plannedPeriod'), 60)

'Ввести значение из профиля в поле "Планируемый срок размещения"'
WebUiBuiltInKeywords.setText(findTestObject('document_PPG/input_plannedPlacement'), GlobalVariable.PlannedPlacement)

'Ввести значение из профиля в поле "Планируемый срок исполнения контракта"'
WebUiBuiltInKeywords.setText(findTestObject('document_PPG/input_plannedPerformance'), GlobalVariable.PlannedPerformance)

'Ввести значение из профиля в поле "Планируемый срок (сроки отдельных этапов) поставки товаров (выполнения работ, оказания услуг)"'
WebUiBuiltInKeywords.setText(findTestObject('document_PPG/input_plannedPeriod'), GlobalVariable.PlannedPerod)

'Сохранить документ'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание успешного сохранения документа проверкой доступности кнопки "Редактировать"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 60)

