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

'Ожидание доступности меню "Осуществление закупки"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('page_home/span_purchase'), 60)

'Нажать на меню "Осуществление закупки"'
WebUiBuiltInKeywords.click(findTestObject('page_home/span_purchase'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('menu_request/menu_notice'), 0)

'Перейти на вкладку "Извещения о закупочной процедуре"'
WebUI.click(findTestObject('menu_request/menu_notice'))

'Ожидание'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('menu_request/link_notice'), 60)

'Перейти по подменю "Извещение о закупочной процедуре"'
WebUiBuiltInKeywords.click(findTestObject('menu_request/link_notice'))

'Изменить значение реквизита поискового документа'
new_object = WebUI.modifyObjectProperty(findTestObject('DOCUMENT/object'), 'text', 'equals', GlobalVariable.NameObjectPurchase, 
    true)

'Ожидание доступности документа'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)
