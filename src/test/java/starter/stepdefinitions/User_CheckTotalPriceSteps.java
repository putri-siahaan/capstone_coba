package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.User_CheckTotalPrice;

public class User_CheckTotalPriceSteps {
    @Steps
    User_CheckTotalPrice checkTotalPrice;


    //TC_AA_User_58 - Check Total Price [Positive 1]

    @Given("User input valid endpoint to check price")
    public void userInputValidEndpointToCheckPrice() {
        checkTotalPrice.userInputValidEndpointToCheckPrice();
    }

    @When("User request with HTTP method POST with valid request body to check price and click Send Button")
    public void userRequestWithHTTPMethodPOSTWithValidRequestBodyToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithHTTPMethodPOSTAndInputValidRequestBodyToCheckPrice();
    }

    @Then("Validate success to check price and display total price after calculate discount in the response body")
    public void validateSuccessToCheckPriceAndDisplayTotalPriceAfterCalculateDiscountInTheResponseBody() {
        checkTotalPrice.successToCheckPriceWithValidRequestBody();
    }

    
    
    
    


    //TC_AA_User_59 - Check Total Price [Negative 1]

    @When("User request with POST HTTP method with invalid wisata ID to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidWisataIDToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndInputInvalidWisataIDToCheckPrice();
    }

    @Then("Validate failed to check price because invalid wisata ID and display error message {string} in the response body")
    public void validateFailedToCheckPriceBecauseInvalidWisataIDAndDisplayErrorMessageInTheResponseBody(String failedCheckPriceBecauseInvalidWisataID) {
        checkTotalPrice.failedToCheckPriceBecauseInvalidWisataID("Wisata not found");
    }







    //TC_AA_User_60 - Check Total Price [Negative 2]

    @When("User request with POST HTTP method with invalid use all points to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidUseAllPointsToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndInputInvalidUseAllPointsToCheckPrice();
    }

    @Then("Validate failed to check price because invalid use all points and display error message {string} in the response body")
    public void validateFailedToCheckPriceBecauseInvalidUseAllPointsAndDisplayErrorMessageAndErrorMessageInTheResponseBody(String failedCheckPriceBecauseInvalidUseAllPoints) {
        checkTotalPrice.failedToCheckPriceBecauseInvalidUseAllPoints("cannot unmarshal number into Go struct field .use_all_points of type bool");
    }






    //TC_AA_User_61 - Check Total Price [Negative 3]

    @When("User request with POST HTTP method with invalid kode voucher to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidKodeVoucherToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndInputInvalidKodeVoucherToCheckPrice();
    }

    @Then("Validate failed to check price because invalid kode voucher and display error message {string} in the response body")
    public void validateFailedToCheckPriceBecauseInvalidKodeVoucherAndDisplayErrorMessageInTheResponseBody(String failedCheckPriceBecauseInvalidKodeVoucher) {
        checkTotalPrice.failedToCheckPriceBecauseInvalidKodeVoucher("Invalid kode voucher");
    }







    //TC_AA_User_62 - Check Total Price [Negative 4]

    @When("User request with POST HTTP method with invalid quantity to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidQuantityToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndInputInvalidQuantityToCheckPrice();
    }

    @Then("Validate failed to check price because invalid quantity and display error message {string} in the response body")
    public void validateFailedToCheckPriceBecauseInvalidQuantityAndDisplayErrorMessageInTheResponseBody(String failedCheckPriceBecauseInvalidQuantity) {
        checkTotalPrice.failedToCheckPriceBecauseInvalidQuantity("Quantity must be greater than 0");
    }






    //TC_AA_User_63 - Check Total Price [Negative 5]

    @When("User request with POST HTTP method with invalid checking booking to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodWithInvalidCheckingBookingToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndInputInvalidCheckingBookingToCheckPrice();
    }

    @Then("Validate failed to check price because input invalid checking booking and display error message {string} in the response body")
    public void validateSuccessToCheckPriceEvenThoughInputInvalidCheckingBookingAndDisplayTotalPriceAfterCalculateDiscountInTheResponseBody(String failedCheckPriceBecauseInvalidCheckingBooking) {
        checkTotalPrice.failedToCheckPriceBecauseInvalidCheckingBooking("Checkin date must be today or later");
    }







    //TC_AA_User_64 - Check Total Price [Negative 6]

    @When("User request with POST HTTP method but in the request body did not input wisata ID to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputWisataIDToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndDidNotInputWisataIDToCheckPrice();
    }

    @Then("Validate failed to check price because did not input wisata ID and display error message {string} in the response body")
    public void validateFailedToCheckPriceBecauseDidNotInputWisataIDAndDisplayErrorMessageInTheResponseBody(String failedCheckPriceBecauseDidNotInputWisataID) {
        checkTotalPrice.failedToCheckPriceBecauseDidNotInputWisataID("Wisata not found");
    }






    //TC_AA_User_65 - Check Total Price [Positive 2]

    @When("User request with POST HTTP method but in the request body did not input use all points to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputUseAllPointsToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndDidNotInputUseAllPointsToCheckPrice();
    }

    @Then("Validate success to check price even though did not input use all points and display total price after calculate discount in the response body")
    public void validateSuccessToCheckPriceEvenThoughDidNotInputUseAllPointsAndDisplayTotalPriceAfterCalculateDiscountInTheResponseBody() {
        checkTotalPrice.successToCheckPriceEvenThoughDidNotInputUseAllPoints();
    }







    //TC_AA_User_66 - Check Total Price [Positive 3]

    @When("User request with POST HTTP method but in the request body did not input kode voucher to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputKodeVoucherToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndDidNotInputKodeVoucherToCheckPrice();
    }

    @Then("Validate success to check price even though did not input kode voucher and display total price after calculate discount in the response body")
    public void validateSuccessToCheckPriceEvenThoughDidNotInputKodeVoucherAndDisplayTotalPriceAfterCalculateDiscountInTheResponseBody() {
        checkTotalPrice.successToCheckPriceEvenThoughDidNotInputKodeVoucher();
    }







    //TC_AA_User_67 - Check Total Price [Negative 7]

    @When("User request with POST HTTP method but in the request body did not input quantity to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputQuantityToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndDidNotInputQuantityToCheckPrice();
    }

    @Then("Validate failed to check price because did not input quantity and display error message {string} in the response body")
    public void validateFailedToCheckPriceBecauseDidNotInputQuantityAndDisplayErrorMessageInTheResponseBody(String failedCheckPriceBecauseDidNotInputQuantity) {
        checkTotalPrice.failedToCheckPriceBecauseDidNotInputQuantity("Quantity must be greater than 0");
    }






    //TC_AA_User_68 - Check Total Price [Negative 8]

    @When("User request with POST HTTP method but in the request body did not input checking booking to check price and click Send Button")
    public void userRequestWithPOSTHTTPMethodButInTheRequestBodyDidNotInputCheckingBookingToCheckPriceAndClickSendButton() {
        checkTotalPrice.userRequestWithPOSTHTTPMethodAndDidNotInputCheckingBookingToCheckPrice();
    }

    @Then("Validate failed to check price because did not input checking booking and display error message {string} in the response body")
    public void validateSuccessToCheckPriceBecauseDidNotInputCheckingBookingAndDisplayTotalPriceAfterCalculateDiscountInTheResponseBody(String failedCheckPriceBecauseDidNotInputCheckingBooking) {
        checkTotalPrice.failedToCheckPriceBecauseDidNotInputCheckingBooking("Invalid checkin_booking date format");

    }
}
