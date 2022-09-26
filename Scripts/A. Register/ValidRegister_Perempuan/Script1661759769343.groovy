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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pex-dev.youarestellar.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('LandingPage_PeX/button_Login'))

WebUI.click(findTestObject('PageLogin_PeX/button_daftar akun sekarang'))

WebUI.setText(findTestObject('Object Repository/Page_RegistPeX/input_namaLengkap'), nama_Lengkap)

WebUI.setText(findTestObject('Page_RegistPeX/input_tanggalLahir'), tanggal_Lahir)

WebUI.click(findTestObject('Page_RegistPeX/panah_DropDown'))

WebUI.click(findTestObject('Page_RegistPeX/dropdown _Perempuan'))

WebUI.setText(findTestObject('Object Repository/Page_RegistPeX/input_noHP'), no_Hp)

WebUI.setText(findTestObject('Object Repository/Page_RegistPeX/input_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_RegistPeX/input_password'), password)

WebUI.click(findTestObject('Page_RegistPeX/sayaMenyetujui'))

WebUI.click(findTestObject('Object Repository/Page_RegistPeX/button_Daftar'))

WebUI.verifyElementText(findTestObject('Page_RegistPeX/Verify_ValidRegister'), 'Registrasi Berhasil')

