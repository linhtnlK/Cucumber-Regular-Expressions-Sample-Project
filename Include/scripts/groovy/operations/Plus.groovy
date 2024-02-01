package operations
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import io.cucumber.java.en.When

class Plus {

    @When("/(\\d+) plus (\\d+)/")
    def multiply(long firstOperand, long secondOperand) {
        WebUI.callTestCase(findTestCase("Test Cases/common/Plus number"), [ ('firstOperand') : firstOperand, ('secondOperand') : secondOperand ], FailureHandling.STOP_ON_FAILURE)
    }
}