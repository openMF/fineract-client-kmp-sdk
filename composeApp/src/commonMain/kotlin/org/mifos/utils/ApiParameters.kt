package org.mifos.utils

data class ApiParameters(
    val apiName: String, val apiDescription: String, val apiIdentifier: ApiIdentifier
)

fun apiParametersValues(): MutableList<ApiParameters> {

    val apiParameters = mutableListOf(
        ApiParameters(
            "Authentication API",
            "Authenticate user who is not connected to any service",
            ApiIdentifier.AuthApi
        ),
        ApiParameters(
            "Center API",
            "Get All centers, Supports Pagination",
            ApiIdentifier.CenterApi
        ),
        ApiParameters(
            "Loan Account API",
            "Retrieve Load account of a user",
            ApiIdentifier.LoanApi
        ),
        ApiParameters(
            "Savings Account API",
            "Retrieve Saving account of a user",
            ApiIdentifier.SavingApi
        ),
        ApiParameters(
            "Client API",
            "Client Details Response",
            ApiIdentifier.ClientApi
        ),
        ApiParameters(
            "Survey API",
            "Survey Details Response",
            ApiIdentifier.SurveyApi
        ),
        ApiParameters(
            "Note API",
            "Note Details Response",
            ApiIdentifier.NoteApi
        ),
    )

    return apiParameters
}

