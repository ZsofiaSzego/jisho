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

WebUI.click(findTestObject('jisho_dashboard/radicals'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('jisho_multiple_radicals/Page_Jisho.org Japanese Dictionary/rad_gate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('jisho_multiple_radicals/Page_Jisho.org Japanese Dictionary/rad_sun'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('jisho_multiple_radicals/Page_Jisho.org Japanese Dictionary/a_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('jisho_multiple_radicals/radicals/Page_Jisho.org Japanese Dictionary/search-icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('jisho_multiple_radicals/Page_ - Jisho.org/res_word'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('jisho_multiple_radicals/Page_ - Jisho.org/meaning'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('jisho_multiple_radicals/Page_ - Jisho.org/result_kanji'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

