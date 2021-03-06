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

'Перейти в режим Планирования'
WebUI.click(findTestObject('Pages/page_home/span_planning'))

'Перейти на вкладку Планы графики'
WebUiBuiltInKeywords.click(findTestObject('Menu/menu_planning/a_schedulePlan'))

'Нажать Создать план-график'
WebUiBuiltInKeywords.click(findTestObject('Menu/menu_planning/btn_newPurchasePlan'))

'Изменить год на текущий'
new_budgetYear = WebUiBuiltInKeywords.modifyObjectProperty(findTestObject('Menu/menu_planning/page_year/radio_budgetYear'), 'value', 
    'equals', BudgetYear, true)

'Указать год финансирования'
WebUiBuiltInKeywords.check(new_budgetYear)

'Завершить выбор года'
WebUiBuiltInKeywords.click(findTestObject('Menu/menu_planning/page_year/button_OK'))

'Развернуть список ответственного'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_purchasePlan/button_otv'))

'В поисковое поле ввести текущего пользователя'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_purchasePlan/input_otv'), Login)

'Установить чек напротив найденного сотрудника'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_purchasePlan/check_otv'))

'Завершить выбор'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_purchasePlan/btn_select'))

'Развернуть список Утверждающих'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_purchasePlan/button_utv'))

'В поле поиска ввести текущего сотрудника'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_purchasePlan/input_utv'), Login)

'Установить чек на найденном'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_purchasePlan/check_otv'))

'Завершить выбор'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_purchasePlan/btn_select'))

'Сохранить документ'
WebUiBuiltInKeywords.click(findTestObject('BASE/btn_save'))

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/btn_edit'), 60)

'Закрыть браузер'
WebUI.closeBrowser()

