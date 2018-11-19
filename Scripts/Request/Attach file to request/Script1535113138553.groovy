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

'Адрес файла 1'
new_file1 = (System.getProperty('user.dir') + File1)

'Адрес файла 2'
new_file2 = (System.getProperty('user.dir') + File2)

'Адрес файла 3'
new_file3 = (System.getProperty('user.dir') + File3)

'Ожидание контрола'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/Toolbar_horizon/btn_attachFile'), 60)

'Нажать на кнопку "Прикрепить файл"'
WebUiBuiltInKeywords.click(findTestObject('BASE/Toolbar_horizon/btn_attachFile'))

'Ожидание контрола'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/File/btn_selectFile'), 60)

'Загрузить Файл 1'
WebUI.uploadFile(findTestObject('BASE/File/btn_selectFile'), new_file1)

'Ожидание контрола'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_request/btn_selectCategory'), 60)

'Фокус на списке с категориями'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/btn_selectCategory'))

'Раскрыть список с категориями'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/list_category'), FailureHandling.STOP_ON_FAILURE)

'Ожидание контрола\r\n'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_request/item_nameDescription'), 60)

'Выбрать в списке значение'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/item_nameDescription'))

'Ожидание'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/File/btn_selectFile'), 60)

'Загрузить Файл 2'
WebUI.uploadFile(findTestObject('BASE/File/btn_selectFile'), new_file2)

'Ожидание '
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_request/btn_selectCategory'), 60)

'Фокус на контроле категорий'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/btn_selectCategory'))

'Раскрыть список с категориями'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/list_category'), FailureHandling.STOP_ON_FAILURE)

'Ожидание значения'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_request/item_rationaleNMCK'), 60)

'Выбрать значение из списка'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/item_rationaleNMCK'))

'Ожидание '
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/File/btn_selectFile'), 60)

'Загрузить Файл 3'
WebUI.uploadFile(findTestObject('BASE/File/btn_selectFile'), new_file3)

'Ожидание'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_request/btn_selectCategory'), 60)

'Фокус на контроле категорий'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/btn_selectCategory'))

'Раскрыть список с категориями'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/list_category'), FailureHandling.STOP_ON_FAILURE)

'Ожидание'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_request/item_projectContract'), 60)

'Выбрать значение из списка с категориями'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/item_projectContract'))

'Завершить редактирование прикрепления файлов нажатием на кнопку "ОК"'
WebUiBuiltInKeywords.click(findTestObject('BASE/Alert/btn_OK'))

'Ожидание успешного завершения операции закрытием диалога'
WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('special/modal-content'), 60)

'Закрыть браузер'
WebUI.closeBrowser()

