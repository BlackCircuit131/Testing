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

WebUI.callTestCase(findTestCase('Login_TC'), [('email') : 'Dimas@sharklasers.com', ('password') : 'DimashotAsi1@'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PageDashboard_PeX/IconAvatar'))

WebUI.click(findTestObject('PageDashboard_PeX/avatar_pengaturanAkun'))

WebUI.click(findTestObject('PageProfile_PeX/menu_UbahKataSandi'))

WebUI.setText(findTestObject('PageProfile_PeX/Kata_Sandi/Password_Sekarang'), 'DimashotAsi1@')

WebUI.setText(findTestObject('PageProfile_PeX/Kata_Sandi/Password_Baru'), 'Dimashot1@')

WebUI.setText(findTestObject('PageProfile_PeX/Kata_Sandi/Ulangi_PassBaru'), 'Dimashot1@')

WebUI.delay(3)

WebUI.click(findTestObject('PageProfile_PeX/Kata_Sandi/Button_Simpan'))

WebUI.verifyElementText(findTestObject('PageProfile_PeX/Kata_Sandi/Verify_BerhasilUbahPass'), 'Berhasil mengubah password')

