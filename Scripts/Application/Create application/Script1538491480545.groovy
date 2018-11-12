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

'Авторизация'
WebUI.callTestCase(findTestCase('BASE/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть Извещение'
WebUI.callTestCase(findTestCase('BASE/Open/Open notice'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Toolbar_horizon/btn_createApp'), 0)

'Создать заявку участника'
WebUI.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_createApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_application/input_numberApp'), 0)

'Ввести номер заявки'
WebUI.setText(findTestObject('document_application/input_numberApp'), '1')

'Раскрыть справочник Контрагентов'
WebUI.click(findTestObject('document_application/btn_nameApp'))

'Установить чек на первом списке Контрагенте'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/input_find'), 0)

'В поле поиска ввести наименование первого контрагента'
WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), GlobalVariable.Contractor1)

'Нажать найти'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

'Ожидание искомого значения'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Установить чек на найденном контрагенте'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор контрагента'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/btn_select'), 0)

'Сохранить заявку участника'
WebUI.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание завершения регистрации доступностью кнопки редактирования'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Перейти на вкладку Извещения'
WebUI.click(findTestObject('document_application/tab_notice'))

'Изменить значение реквизита поискового документа'
new_object = WebUI.modifyObjectProperty(findTestObject('DOCUMENT/object'), 'text', 'equals', GlobalVariable.NameObjectPurchase, 
    true)

'Ожидание доступности документа'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Нажать на кнопку Заявка участника'
WebUI.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_createApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_application/input_numberApp'), 0)

'Ввести номер заявки участника'
WebUI.setText(findTestObject('document_application/input_numberApp'), '2')

'Ввести Предлагаемую цену'
WebUI.setText(findTestObject('document_application/input_availablePrice'), GlobalVariable.AmountPPG.toString())

'Раскрыть список контрагентов'
WebUI.click(findTestObject('document_application/btn_nameApp'))

'Установить чек на первом списке Контрагенте'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/input_find'), 0)

'Ввести в поле поиска наименование 2го контрагента'
WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), GlobalVariable.Contractor2)

'Нажать найти контрагента'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

'Ожидание искомого значения'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Установить чек напротив найденного контрагента'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор контрагента'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/btn_select'), 0)

'Нажать Сохранить документ'
WebUI.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание завершения регистрации'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Создать Заявку участника'
WebUI.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_createApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_application/input_numberApp'), 0)

'Установить номер заявки'
WebUI.setText(findTestObject('document_application/input_numberApp'), '3')

'Ввести Предлагаемую цену'
WebUI.setText(findTestObject('document_application/input_availablePrice'), GlobalVariable.AmountPPG - 1000.toString())

'Раскрыть список контрагентов'
WebUI.click(findTestObject('document_application/btn_nameApp'))

'Установить чек на первом списке Контрагенте'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/input_find'), 0)

'В поле поиска ввести наименование 3го контрагента'
WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), GlobalVariable.Contractor3)

'Нажать на кнопку Найти'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

'Ожидание искомого значения'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Установить чек напротив найденного значения'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор контрагента'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/btn_select'), 0)

'Нажать кнопку Сохранить'
WebUI.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание завершения регистрации доступностью кнопки редактирования'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Закрыть браузер'
WebUI.closeBrowser()

