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

'Авторизация утверждающим'
WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание доступность меню действий'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('my_tasks/act_menu'), 60)

'Развернуть меню действия Утверждения'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/act_menu'))

'Ожидание доступности кнопки Утверждения'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('my_tasks/act_approval'), 60)

'Выбрать действие Утвердить'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/act_approval'))

'Выбрать сертификат'
WebUI.callTestCase(findTestCase('Base/Certificate selection'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание завершения операции утверждения'
WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('my_tasks/act_menu'), 60)

