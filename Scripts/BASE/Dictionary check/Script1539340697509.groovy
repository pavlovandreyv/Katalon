import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Ожидание искомого значения'
WebUI.waitForElementPresent(findTestObject('BASE/Dictionary_check/check_item'), 180)

'Установить чек напротив найденного значения'
WebUI.click(findTestObject('BASE/Dictionary_check/check_item'))

'Завершить выбор контрагента'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_select'))

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('BASE/Dictionary_check/btn_select'), 0)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 0)

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 0)

