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

'Адрес файла 1'
new_file1 = (System.getProperty('user.dir') + GlobalVariable.File1)

'Ожидание контрола'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/Toolbar_horizon/btn_attachFile'), 60)

'Нажать на кнопку "Прикрепить файл"'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_attachFile'))

'Ожидание контрола'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/File/btn_selectFile'), 60)

'Загрузить Файл 1'
WebUI.uploadFile(findTestObject('DOCUMENT/File/btn_selectFile'), new_file1)

'Завершить редактирование прикрепления файлов нажатием на кнопку "ОК"'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Alert/btn_OK'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/File/btn_selectFile'), 60)

