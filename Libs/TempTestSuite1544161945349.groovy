import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Suites/Contract execution/223/223 Create contract execution')

suiteProperties.put('name', '223 Create contract execution')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("T:\\Katalon Studio\\E1\\Reports\\Suites\\Contract execution\\223\\223 Create contract execution\\20181207_085225\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Suites/Contract execution/223/223 Create contract execution', suiteProperties, [new TestCaseBinding('Test Cases/BASE/Authorization', 'Test Cases/BASE/Authorization',  null), new TestCaseBinding('Test Cases/BASE/Open menu', 'Test Cases/BASE/Open menu',  [ 'MenuMain' : findTestData("Test data.xlsx/Tab_Menu").getValue("Main", 4) , 'MenuLeft' : findTestData("Test data.xlsx/Tab_Menu").getValue("Left", 11) ,  ]), new TestCaseBinding('Test Cases/BASE/Open object', 'Test Cases/BASE/Open object',  [ 'Any' : true ,  ]), new TestCaseBinding('Test Cases/BASE/Buttons/223 Create contract execution', 'Test Cases/BASE/Buttons/223 Create contract execution',  null), new TestCaseBinding('Test Cases/Contract execution/223/223 Edit contract execution', 'Test Cases/Contract execution/223/223 Edit contract execution',  null)])
