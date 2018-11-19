package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : &#1040;&#1076;&#1088;&#1077;&#1089; &#1090;&#1077;&#1089;&#1090;&#1086;&#1074;&#1086;&#1075;&#1086; &#1089;&#1077;&#1088;&#1074;&#1077;&#1088;&#1072;</p>
     */
    public static Object Server
     
    /**
     * <p>Profile default : &#1051;&#1086;&#1075;&#1080;&#1085; &#1086;&#1090; &#1071;&#1085;&#1076;&#1077;&#1082;&#1089; &#1087;&#1086;&#1095;&#1090;&#1099;</p>
     */
    public static Object LoginYandex
     
    /**
     * <p>Profile default : &#1055;&#1072;&#1088;&#1086;&#1083;&#1100; &#1086;&#1090; &#1071;&#1085;&#1076;&#1077;&#1082;&#1089; &#1087;&#1086;&#1095;&#1090;&#1099;</p>
     */
    public static Object PasswordYandex
     
    /**
     * <p>Profile default : &#1051;&#1086;&#1075;&#1080;&#1085; &#1086;&#1090; mail.cognitive.ru</p>
     */
    public static Object LoginMail
     
    /**
     * <p>Profile default : &#1055;&#1072;&#1088;&#1086;&#1083;&#1100; &#1086;&#1090; mail.cognitive.ru</p>
     */
    public static Object PasswordMail
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['Server' : findTestData('Test data.xlsx/Tab_Global').getValue('Server', 1), 'LoginYandex' : findTestData('Test data.xlsx/Tab_Global').getValue('LoginYandex', 1), 'PasswordYandex' : findTestData('Test data.xlsx/Tab_Global').getValue('PasswordYandex', 1), 'LoginMail' : 'test.cognitive', 'PasswordMail' : 'nV9AO6gPlM7k8wn'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        Server = selectedVariables['Server']
        LoginYandex = selectedVariables['LoginYandex']
        PasswordYandex = selectedVariables['PasswordYandex']
        LoginMail = selectedVariables['LoginMail']
        PasswordMail = selectedVariables['PasswordMail']
        
    }
}
