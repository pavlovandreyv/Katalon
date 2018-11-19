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

'Ожидание меню Планирование'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Pages/page_home/span_planning'), 60)

'Перейти по меню Планирование\r\n'
WebUI.click(findTestObject('Pages/page_home/span_planning'))

'Ожидание меню "Позиции план-графика"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('menu_planning/a_positionSchedulePlan'), 60)

'Перейти по меню Позиции плана-графика'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/a_positionSchedulePlan'))

'Ожидание меню Актуальные'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('menu_request/link_all'), 60)

'Перейти по меню Актуальные'
WebUiBuiltInKeywords.click(findTestObject('menu_request/link_all'))

'Изменить значение реквизита документа'
new_object = WebUI.modifyObjectProperty(findTestObject('BASE/object'), 'text', 'equals', NameObjectPurchase, true)

'Ожидание доступности документа с определенным значением'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

