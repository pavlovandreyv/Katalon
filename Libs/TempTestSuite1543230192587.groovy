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


suiteProperties.put('id', 'Test Suites/Suites/Purchase regulation/Purchase regulation to EIS')

suiteProperties.put('name', 'Purchase regulation to EIS')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("T:\\Katalon Studio\\E1\\Reports\\Suites\\Purchase regulation\\Purchase regulation to EIS\\20181126_140312\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Suites/Purchase regulation/Purchase regulation to EIS', suiteProperties, [new TestCaseBinding('Test Cases/BASE/Authorization', 'Test Cases/BASE/Authorization',  null), new TestCaseBinding('Test Cases/BASE/Open/Open purchase regulation', 'Test Cases/BASE/Open/Open purchase regulation',  null), new TestCaseBinding('Test Cases/BASE/EIS/Send to EIS', 'Test Cases/BASE/EIS/Send to EIS',  null), new TestCaseBinding('Test Cases/BASE/EIS/Update from EIS', 'Test Cases/BASE/EIS/Update from EIS',  null)])
