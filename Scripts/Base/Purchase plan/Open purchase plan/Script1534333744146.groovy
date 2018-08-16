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

'Перейти по меню Планирование\r\n'
WebUI.click(findTestObject('page_home/span_planning'))

'Перейти по меню План закупок'
WebUiBuiltInKeywords.click(findTestObject('page_planning/a_purchasePlan'))

'Перейти по меню Актуальные'
WebUiBuiltInKeywords.click(findTestObject('document_purchasePlan/menu_actual'))

'Изменить год плана закупок на определенный'
new_budgetYear = WebUI.modifyObjectProperty(findTestObject('document_purchasePlan/link_purchaseplan'), 'text', 'equals', 
    GlobalVariable.BudgetYear, true)

'Скопировать url плана закупок, для перехода внутри одной вкладки'
url_purchase = WebUiBuiltInKeywords.getAttribute(new_budgetYear, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_purchase)
