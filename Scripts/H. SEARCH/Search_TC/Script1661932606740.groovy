import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for (def row = 1; row <= findTestData('data_Search/Search').getRowNumbers(); row++) {
    WebUI.callTestCase(findTestCase('Login_TC'), [('email') : 'Dimas@sharklasers.com', ('password') : 'Dimashot1@'], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('PageDashboard_PeX/Field_Search'), findTestData('data_Search/Search').getValue('data_Search', 
            row))

    WebUI.delay(5)

    WebUI.click(findTestObject('PageDashboard_PeX/icon_Search'))

    WebUI.click(findTestObject('PageDashboard_PeX/ListSearchTeratas'))

    WebUI.delay(10)

    WebUI.closeBrowser()
}

