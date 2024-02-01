package common
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then

class Common {

    @Given("The Calculator page is loaded successfully")
    def load_calculator_page() {
        WebUI.callTestCase(findTestCase("Test Cases/common/The Calculator page is loaded successfully"), [:], FailureHandling.STOP_ON_FAILURE)
    }

    @Then("/I get the result (.*)/")
    def check_result(String result) {
        WebUI.callTestCase(findTestCase('Test Cases/common/Check result'), [ ('result') : result ], FailureHandling.STOP_ON_FAILURE)
    }
}