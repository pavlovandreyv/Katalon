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


suiteProperties.put('id', 'Test Suites/Suites/Registration/Registration testEP_2_user')

suiteProperties.put('name', 'Registration testEP_2_user')

suiteProperties.put('description', '\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044F \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("T:\\Katalon Studio\\E1\\Reports\\Suites\\Registration\\Registration testEP_2_user\\20181122_161040\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Suites/Registration/Registration testEP_2_user', suiteProperties, [new TestCaseBinding('Test Cases/Registration/Registration', 'Test Cases/Registration/Registration',  [ 'CertName' : '//span[contains(text(), \'\u041D\u0438\u043A\u043E\u043B\u0430\u0435\u0432 \u041D\u0438\u043A\u043E\u043B\u0430\u0439 \u041D\u0438\u043A\u043E\u043B\u0430\u0435\u0432\u0438\u0447\')]/../*[@type=\'radio\']' , 'Surname' : '\u041D\u0438\u043A\u043E\u043B\u0430\u0435\u0432' , 'Login' : 'test1EP_2' , 'Email' : 'test.cognitive+test1EP_2@cognitive.ru' , 'RegistrationEP' : true , 'ChangeChief' : true , 'DeleteAllCookies' : true ,  ]), new TestCaseBinding('Test Cases/Registration/Open urlE1_mailCognitive', 'Test Cases/Registration/Open urlE1_mailCognitive',  null), new TestCaseBinding('Test Cases/BASE/Authorization', 'Test Cases/BASE/Authorization',  [ 'Login' : 'CHEBTST2\\\u0410\u0434\u043C\u0438\u043D\u0438\u0441\u0442\u0440\u0430\u0442\u043E\u0440' , 'Password' : 'Gfhjkm1' ,  ]), new TestCaseBinding('Test Cases/Registration/Activation', 'Test Cases/Registration/Activation',  [ 'Surname' : '\u041D\u0438\u043A\u043E\u043B\u0430\u0435\u0432' ,  ])])
