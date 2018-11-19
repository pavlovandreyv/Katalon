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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Выбор: утверждение или согласование'
switch (Appruval) {
    case 'U':
        'Перейти на вкладку Утверждения'
        WebUI.navigateToUrl(GlobalVariable.Server + '/Performer/Confirmations')

        break
    case 'S':
        'Перейти на вкладку Согласования'
        WebUI.navigateToUrl(GlobalVariable.Server + '/Performer/Approvals')

        break
}

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/wait myTask_menu'), 60)

'Развернуть меню действий'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/action_myTask'))

WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/block menu_myTask'), 60)

'Нажать "Утвердить"'
WebUiBuiltInKeywords.click(findTestObject('my_tasks/action_approval'))

'Выбрать сертификат'
WebUI.callTestCase(findTestCase('BASE/Certificate selection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementNotPresent(findTestObject('my_tasks/action_myTask'), 60)

'Закрыть браузер'
WebUI.closeBrowser()

