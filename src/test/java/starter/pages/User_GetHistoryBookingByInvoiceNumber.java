package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class User_GetHistoryBookingByInvoiceNumber {

    protected static String url = "https://destimate.uc.r.appspot.com/";


    //TC_AA_User_126 - Get History Booking Wisata by Invoice Number [Positive 1]

    @Step("User input endpoint with valid Invoice number to get history booking wisata case success transaction")
    public String userInputEndpointWithValidInvoiceNumberCaseSuccessTransaction(){
        return url + "user/wisata/1700579240-327";
    }

    @Step("User request with the HTTP method GET to get history booking wisata case success transaction and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCaseSuccessTransaction(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidInvoiceNumberCaseSuccessTransaction()).then().statusCode(200);
    }

    @Step("Validate success to get history booking wisata by valid invoice number case success transaction and display detail transaction in the response body")
    public void successToGeHistoryBookingCaseSuccessTransaction(){
        String ticketData = SerenityRest.lastResponse().jsonPath().getString("ticket_data");

        assertThat(ticketData).isNotEmpty();
    }








    //TC_AA_User_127 - Get History Booking Wisata by Invoice Number [Positive 2]

    @Step("User input endpoint with valid Invoice number to get history booking wisata case pending transaction")
    public String userInputEndpointWithValidInvoiceNumberCasePendingTransaction(){
        return url + "user/wisata/1700579294-882";
    }

    @Step("User request with the HTTP method GET to get history booking wisata case pending transaction and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCasePendingTransaction(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidInvoiceNumberCasePendingTransaction()).then().statusCode(200);
    }

    @Step("Validate success to get history booking wisata by valid invoice number case pending transaction and display detail transaction in the response body")
    public void successToGeHistoryBookingCasePendingTransaction(){
        String ticketData = SerenityRest.lastResponse().jsonPath().getString("ticket_data");

        assertThat(ticketData).isNotEmpty();
    }



















    //TC_AA_User_128 - Get History Booking Wisata by Invoice Number [Positive 3]

    @Step("User input endpoint with valid Invoice number to get history booking wisata case canceled transaction")
    public String userInputEndpointWithValidInvoiceNumberCaseCanceledTransaction(){
        return url + "user/wisata/1700582320-491";
    }

    @Step("User request with the HTTP method GET to get history booking wisata case canceled transaction and click Send Button")
    public void userRequestWithTheHTTPMethodGETToGetHistoryBookingWisataCaseCanceledTransaction(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithValidInvoiceNumberCaseCanceledTransaction()).then().statusCode(200);
    }

    @Step("Validate success to get history booking wisata by valid invoice number case canceled transaction and display detail transaction in the response body")
    public void successToGeHistoryBookingCaseCanceledTransaction(){
        String ticketData = SerenityRest.lastResponse().jsonPath().getString("ticket_data");

        assertThat(ticketData).isNotEmpty();
    }









    //TC_AA_User_129 - Get History Booking Wisata by Invoice Number [Positive 4]

    @Step("User input endpoint with invalid Invoice number to get history booking wisata")
    public String userInputEndpointWithInvalidInvoiceNumberToGetHistoryBooking(){
        return url + "user/wisata/1700318165-841";
    }

    @Step("User request with the HTTP method GET to get history booking wisata and click Send Button")
    public void userRequestWithTheHTTPMethodGETAndInputInvalidInvoiceNumber(){
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InB1dHJpc2huMjciLCJleHAiOjE3MDE1MjI2NTYsImlhdCI6MTcwMDMxMzA1Nn0.LYnOXCXkHqrC5bjMMg-h9SO5MIZSBSJD3PVcRsG58AU")
                .get(userInputEndpointWithInvalidInvoiceNumberToGetHistoryBooking()).then().statusCode(200);
    }

    @Step("Validate success to get history booking wisata by invalid invoice number and display transaction detail is null in the response body")
    public void successToGetHistoryBookingEvenThoughInvalidInvoiceNumber(){
        String ticketData = SerenityRest.lastResponse().jsonPath().getString("ticket_data");

        assertThat(ticketData).isNull();
    }
}
