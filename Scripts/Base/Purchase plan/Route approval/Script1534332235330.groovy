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

'Авторизация исполнителем заказчика'
WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть определенный план закупок'
WebUI.callTestCase(findTestCase('Base/Purchase plan/Open purchase plan'), [:], FailureHandling.STOP_ON_FAILURE)

'Нажать на кнопку "На утверждение"'
WebUI.click(findTestObject('DOCUMENT/Toolbar/btn_forApproval'))

'Ожидание скрытия перекрывающих кнопку "Ок" элементов'
WebUI.waitForElementNotVisible(findTestObject('special/modal-loading-wrapper'), 60)

'Нажать на кнопку "ОК"'
WebUI.click(findTestObject('DOCUMENT/Dialog/btn_OK'))

'Проверка успешности операции'
WebUiBuiltInKeywords.waitForElementNotVisible(findTestObject('DOCUMENT/Toolbar/btn_forApproval'), 60)

