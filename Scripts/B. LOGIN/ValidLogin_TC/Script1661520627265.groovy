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

for (def row = 1; row <= findTestData('Login/Valid/ValidLogin').getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://pex-dev.youarestellar.co.id/')

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('LandingPage_PeX/button_Login'))

    WebUI.setText(findTestObject('PageLogin_PeX/input__email'), findTestData('Login/Valid/ValidLogin').getValue('email', 
            row))

    WebUI.setText(findTestObject('PageLogin_PeX/input__password'), findTestData('Login/Valid/ValidLogin').getValue('password', 
            row))

    WebUI.click(findTestObject('PageLogin_PeX/button_Masuk'))

    WebUI.verifyElementText(findTestObject('PageDashboard_PeX/Verify_ValidLogin'), 'Selamat datang di PeX Learning Platform! Jangan lupa lanjutin belajarmu ya')
}

