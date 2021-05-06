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

WebUI.navigateToUrl('https://jisho.org/')

WebUI.click(findTestObject('jisho_dashboard/all_advanced_search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('jisho_dashboard/names_filter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('jisho_dashboard/input'), 'masaki tetsuma #names', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('jisho_dashboard/submit_button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('jisho_name/result_name/Page_masaki tetsuma names - Jisho.org/name_result'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

