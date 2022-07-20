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

WebUI.click(findTestObject('Object Repository/dnm2/Page_Kitapyurdu, Kitapla bulumann en kolay yolu/img'))

WebUI.click(findTestObject('Object Repository/dnm2/Page_Edebiyat Kitaplar - En Yeni ve En ok S_95ccaa/img'))

WebUI.click(findTestObject('Object Repository/dnm2/Page_eker Portakal (Ciltsiz) - Jose Mauro D_0dd454/path'))

WebUI.click(findTestObject('Object Repository/dnm2/Page_eker Portakal (Ciltsiz) - Jose Mauro D_0dd454/span_Sepete Ekle'))

WebUI.click(findTestObject('Object Repository/dnm2/Page_eker Portakal (Ciltsiz) - Jose Mauro D_0dd454/a_Teklifi Sepete Ekle'))

WebUI.click(findTestObject('Object Repository/dnm2/Page_eker Portakal (Ciltsiz) - Jose Mauro D_0dd454/a_Pardayanlar 1  Pardayanlar'))

WebUI.click(findTestObject('Object Repository/dnm2/Page_Pardayanlar 1  Pardayanlar - Michel Ze_9afcee/span_Sepete Ekle'))

WebUI.closeBrowser()

