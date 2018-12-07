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

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/Button/btn_createApp'), 0)

'Создать заявку участника'
WebUI.click(findTestObject('BASE/Button/btn_createApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_application/input_numberApp'), 0)

'Ввести номер заявки'
WebUI.setText(findTestObject('Documents/document_application/input_numberApp'), '1')

'Раскрыть справочник Контрагентов'
WebUI.click(findTestObject('Documents/document_application/btn_nameApp'))

WebUI.waitForElementPresent(findTestObject('BASE/Dictionary_check/input_find'), 0)

'В поле поиска ввести наименование первого контрагента'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), Contractor1)

'Нажать найти'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Сохранить заявку участника'
WebUI.click(findTestObject('BASE/btn_save'))

'Ожидание завершения регистрации доступностью кнопки редактирования'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Перейти на вкладку Извещения'
WebUI.click(findTestObject('Documents/document_application/tab_notice'))

'Изменить значение реквизита поискового документа'
new_object = WebUI.modifyObjectProperty(findTestObject('BASE/object'), 'text', 'equals', NameObjectPurchase, true)

'Ожидание доступности документа'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Нажать на кнопку Заявка участника'
WebUI.click(findTestObject('BASE/Button/btn_createApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_application/input_numberApp'), 0)

'Ввести номер заявки участника'
WebUI.setText(findTestObject('Documents/document_application/input_numberApp'), '2')

'Ввести Предлагаемую цену'
WebUI.setText(findTestObject('Documents/document_application/input_availablePrice'), AmountPPG)

'Раскрыть список контрагентов'
WebUI.click(findTestObject('Documents/document_application/btn_nameApp'))

'Установить чек на первом списке Контрагенте'
WebUI.waitForElementPresent(findTestObject('BASE/Dictionary_check/input_find'), 0)

'Ввести в поле поиска наименование 2го контрагента'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), Contractor2)

'Нажать найти контрагента'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Нажать Сохранить документ'
WebUI.click(findTestObject('BASE/btn_save'))

'Ожидание завершения регистрации'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Создать Заявку участника'
WebUI.click(findTestObject('BASE/Button/btn_createApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_application/input_numberApp'), 0)

'Установить номер заявки'
WebUI.setText(findTestObject('Documents/document_application/input_numberApp'), '3')

'Ввести Предлагаемую цену'
WebUI.setText(findTestObject('Documents/document_application/input_availablePrice'), AmountPPG - 1000.toString())

'Раскрыть список контрагентов'
WebUI.click(findTestObject('Documents/document_application/btn_nameApp'))

'Установить чек на первом списке Контрагенте'
WebUI.waitForElementPresent(findTestObject('BASE/Dictionary_check/input_find'), 0)

'В поле поиска ввести наименование 3го контрагента'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), Contractor3)

'Нажать на кнопку Найти'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Нажать кнопку Сохранить'
WebUI.click(findTestObject('BASE/btn_save'))

'Ожидание завершения регистрации доступностью кнопки редактирования'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Закрыть браузер'
WebUI.closeBrowser()

