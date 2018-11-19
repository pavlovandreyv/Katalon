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
import groovy.time.TimeCategory as TimeCategory
import java.lang.System as System

'Перейти на вкладку позиции плана закупок'
WebUiBuiltInKeywords.click(findTestObject('BASE/Toolbar_vertical/menu_positionPurchasePlan'))

'Изменить название закупки на определенный в профиле'
url_ppz1 = WebUiBuiltInKeywords.modifyObjectProperty(findTestObject('Documents/document_purchasePlan/PPZ/a_urlPPZ'), 'text', 'equals', 
    NameObjectPurchase, true)

'Получить url ППГ для перехода внутри 1й вкладки'
url_ppz2 = WebUI.getAttribute(url_ppz1, 'href')

'Перейти на ППГ внутри одной вкладки'
WebUiBuiltInKeywords.navigateToUrl(url_ppz2)

'Нажать на кнопку "Создать позицию ПГ"'
WebUiBuiltInKeywords.click(findTestObject('BASE/Toolbar_horizon/btn_newPPG'))

'Ожидание доступности 1го реквизита для ввода на форме ППГ'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_PPG/inpute_descriptionObjectPurchase'), 60)

'Ввести значение в поле "Описание объекта закупки"'
WebUI.setText(findTestObject('Documents/document_PPG/inpute_descriptionObjectPurchase'), NameObjectPurchase)

'Раскрыть справочник выбора способа определения поставщика'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPG/btn_methodSupplier'))

'Ожидание доступности поля ввода'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_PPG/find_methodSuppler'), 60)

'Ввод определенного значения в поисковое поле'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPG/find_methodSuppler'), MethodSuppler)

'Нажать на кнопку найти (для успешного завершения поиска)'
WebUiBuiltInKeywords.click(findTestObject('BASE/Dictionary_check/btn_find'), FailureHandling.STOP_ON_FAILURE)

'Выбрать найденное значение из словаря'
WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание доступности поля "Обоснование способа определения поставщика"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_PPG/input_rationaleMethodSupplier'), 60)

'Ввести значение в поле "Обоснование способа определения поставщика"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPG/input_rationaleMethodSupplier'), RationaleMethodSupplier)

'Раскрыть справочник "Метод определения НМЦК"'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPG/btn_methodNMCK'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввести значение в поле "Обоснование метода"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPG/input_rationaleMethod'), RathionaleMethod)

'Перейти на вкладку "Планирование платежей"'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPG/a_paymentPlanning'))

'Ожидание доступности кнопки выбора КБК'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_budget/btn_KBK'), 60)

WebUI.click(findTestObject('Documents/document_budget/btn_KBK'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввести значение в поле "Сумма ППГ"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPG/input_amountPPG'), AmountPPG)

'Перейти на вкладку "Дополнительные сведения"'
WebUiBuiltInKeywords.click(findTestObject('BASE/Toolbar_vertical/menu_additionalInfo'))

'Ожидание доступности кнопки "Банковское сопровождение контракта"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_PPG/btn_bankSupportContract'), 60)

'Раскрыть справочник поля "Банковское сопровождение контракта"'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPG/btn_bankSupportContract'))

'Ожидание доступности значения из справочника'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/Dictionary_check/check_item'), 60)

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Перейти на вкладку "График осуществления закупки"'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_PPG/a_purchaseSchedule'))

'Ожидание прогрузки реквизитов формы'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_PPG/input_plannedPeriod'), 60)

'Определение дат для заполнения вкладки График осуществления закупки'
use(TimeCategory, { 
        today = new Date()

        today2 = (today + 1.days)

        today3 = (today + 2.days)
    })

PlannedPlacement = today.format('dd.MM.yyyy')

PlannedPerformance = today2.format('dd.MM.yyyy')

PlannedPerod = today3.format('dd.MM.yyyy')

'Ввести значение из профиля в поле "Планируемый срок размещения"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPG/input_plannedPlacement'), PlannedPlacement.toString())

'Ввести значение из профиля в поле "Планируемый срок исполнения контракта"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPG/input_plannedPerformance'), PlannedPerformance.toString())

'Ввести значение из профиля в поле "Планируемый срок (сроки отдельных этапов) поставки товаров (выполнения работ, оказания услуг)"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_PPG/input_plannedPeriod'), PlannedPerod.toString())

'Сохранить документ'
WebUiBuiltInKeywords.click(findTestObject('BASE/btn_save'))

'Ожидание успешного сохранения документа проверкой доступности кнопки "Редактировать"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/btn_edit'), 60)

'Закрыть браузер'
WebUI.closeBrowser()

