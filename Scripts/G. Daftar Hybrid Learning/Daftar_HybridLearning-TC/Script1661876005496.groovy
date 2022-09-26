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

WebUI.callTestCase(findTestCase('Login_TC'), [('email') : 'daftarajadulu@sharklasers.com', ('password') : 'Daftarajadulu@'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PageDashboard_PeX/Menu_Kategori'))

WebUI.check(findTestObject('Page_Kategori/Course_HybridLearning/Centang_HybridLearning'))

WebUI.click(findTestObject('Page_Kategori/Course_HybridLearning/Card_HybridLearning'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Kategori/Course_ClassLearning/Button_pilihJadwal'))

WebUI.click(findTestObject('Page_Kategori/Course_ClassLearning/radioButton_PilihJadwal'))

WebUI.click(findTestObject('Page_Kategori/Course_ClassLearning/Button_LanjutkanDaftar'))

WebUI.verifyElementText(findTestObject('Page_Kategori/Course_ClassLearning/Verify_berhasilDaftar'), 'Yeey, kamu berhasil mendaftar pelatihan!')

