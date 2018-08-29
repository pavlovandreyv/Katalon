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

new_file1 = (System.getProperty('user.dir') + GlobalVariable.File1)

new_file2 = (System.getProperty('user.dir') + GlobalVariable.File2)

new_file3 = (System.getProperty('user.dir') + GlobalVariable.File3)

WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Base/Request/Open request'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/Toolbar_horizon/btn_attachFile'), 60)

WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_attachFile'))

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/File/btn_selectFile'), 60)

WebUI.uploadFile(findTestObject('DOCUMENT/File/btn_selectFile'), new_file1)

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_request/btn_selectCategory'), 60)

WebUiBuiltInKeywords.click(findTestObject('document_request/btn_selectCategory'))

WebUiBuiltInKeywords.click(findTestObject('document_request/list_category'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_request/item_nameDescription'), 60)

WebUiBuiltInKeywords.click(findTestObject('document_request/item_nameDescription'))

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/File/btn_selectFile'), 60)

WebUI.uploadFile(findTestObject('DOCUMENT/File/btn_selectFile'), new_file2)

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_request/btn_selectCategory'), 60)

WebUiBuiltInKeywords.click(findTestObject('document_request/btn_selectCategory'))

WebUiBuiltInKeywords.click(findTestObject('document_request/list_category'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_request/item_rationaleNMCK'), 60)

WebUiBuiltInKeywords.click(findTestObject('document_request/item_rationaleNMCK'))

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/File/btn_selectFile'), 60)

WebUI.uploadFile(findTestObject('DOCUMENT/File/btn_selectFile'), new_file3)

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_request/btn_selectCategory'), 60)

WebUiBuiltInKeywords.click(findTestObject('document_request/btn_selectCategory'))

WebUiBuiltInKeywords.click(findTestObject('document_request/list_category'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_request/item_projectContract'), 60)

WebUiBuiltInKeywords.click(findTestObject('document_request/item_projectContract'))

WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Alert/btn_OK'))

WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('DOCUMENT/Alert/btn_OK'), 60)

