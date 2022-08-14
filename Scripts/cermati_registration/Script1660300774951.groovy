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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

int randomNumber

randomNumber = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Email_email'), 
    ('cermatitest' + randomNumber) + '@gmail.com')

WebUI.setText(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_No. Handphone_mobilePhone'), 
    '08230000' + randomNumber)

WebUI.setEncryptedText(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Kata Sandi_password'), 
    'OXpeo0/pgEeVYNf0OdMh6g==')

WebUI.setEncryptedText(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Ulangi Kata Sandi_confirmPassword'), 
    'OXpeo0/pgEeVYNf0OdMh6g==')

WebUI.setText(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Depan_firstName'), 
    'Liza')

WebUI.setText(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Belakang_lastName'), 
    'Pardede')

WebUI.setText(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_KabupatenKota_cityAndProvince'), 
    'Kota Jakarta Selatan')

WebUI.waitForElementVisible(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_KOTA JAKARTA SELATAN'), 
    5)

WebUI.click(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_KOTA JAKARTA SELATAN'))

WebUI.waitForElementClickable(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_Daftar'), 
    5)

WebUI.click(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_Daftar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/h1_Verifikasi No. Handphone'))

WebUI.verifyElementVisible(findTestObject('Object Repository/cermati/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/h2_Kode OTP Terkirim'))

WebUI.closeBrowser()

