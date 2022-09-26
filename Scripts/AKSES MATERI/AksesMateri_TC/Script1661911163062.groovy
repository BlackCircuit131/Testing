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

WebUI.callTestCase(findTestCase('A. Register/ValidRegister_Perempuan'), [('nama_Lengkap') : 'Daftar Aja Dulu', ('tanggal_Lahir') : '10102001'
        , ('jenis_Kelamin') : 'Perempuan', ('no_Hp') : '1234567890', ('email') : 'daftarajadulu@sharklasers.com', ('password') : 'Daftarajadulu@'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('G. Daftar Hybrid Learning/Daftar_HybridLearning-TC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CourseDesc-PeX/Button_MulaiPelatihan'))

WebUI.delay(8)

WebUI.click(findTestObject('Page_MATERI/Play_Video'))

