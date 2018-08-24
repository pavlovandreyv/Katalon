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
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('page_home/span_planning'), 60)

'Перейти по меню Планирование\r\n'
WebUI.click(findTestObject('page_home/span_planning'))

'Ожидание меню "Планы закупок"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('menu_planning/a_schedulePlan'), 60)

'Перейти по меню План график'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/a_schedulePlan'))

'Ожидание меню Актуальные'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('menu_planning/a_actual'), 60)

'Перейти по меню Актуальные'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/a_actual'))

'Изменить год плана графика на определенный'
new_budgetYear = WebUI.modifyObjectProperty(findTestObject('document_purchasePlan/link_purchaseplan'), 'text', 'equals', 
    GlobalVariable.BudgetYear, true)

'Скопировать url план графика, для перехода внутри одной вкладки'
url_purchase = WebUiBuiltInKeywords.getAttribute(new_budgetYear, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_purchase)

