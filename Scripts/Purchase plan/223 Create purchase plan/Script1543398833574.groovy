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

WebUI.callTestCase(findTestCase('BASE/Open menu'), [('MenuMain') : 'Планирование', ('MenuLeft') : 'Планы закупок', ('MenuHorizontal') : 'Актуальные'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_purchasePlan/btn_newPurchasePlan'))

'Указать год бюджета плана закупок'
object_budgetYear = WebUiBuiltInKeywords.modifyObjectProperty(findTestObject('Menu/menu_planning/page_year/radio_budgetYear'), 
    'value', 'equals', BudgetYear, true)

'Указать год бюджета плана закупок'
WebUiBuiltInKeywords.check(object_budgetYear)

WebUI.click(findTestObject('BASE/Alert/btn_OK'))

WebUI.waitForElementPresent(findTestObject('Documents/document_purchasePlan/223/base info/input_organization'), 0)

WebUI.click(findTestObject('Documents/document_purchasePlan/223/base info/btn_approval'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_purchasePlan/223/tab_infoMSP'))

WebUI.waitForElementAttributeValue(findTestObject('Documents/document_purchasePlan/223/tab_infoMSP'), 'class', 'active', 
    0)

WebUI.click(findTestObject('Documents/document_purchasePlan/223/info MSP/check_auto'))

WebUI.click(findTestObject('BASE/btn_save'))

WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

