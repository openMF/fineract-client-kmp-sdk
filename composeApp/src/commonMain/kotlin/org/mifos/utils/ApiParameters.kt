package org.mifos.utils

data class ApiParameters(
    val apiName: String,
    val apiDescription : String,
    val apiIdentifier : String
)

fun apiParametersValues(): MutableList<ApiParameters> {

    val apiParameters = mutableListOf<ApiParameters>(
        ApiParameters("Authentication API", "Authenticate user who is not connected to any service", "authApi"),
        ApiParameters("Center API", "Get All centers, Supports Pagination", "centerApi"),
        ApiParameters("Loan Account API", "Retrieve Load account of a user", "loanApi"),
        ApiParameters("Savings Account API", "Retrieve Saving account of a user", "savingApi"),
        ApiParameters("Client API", "Client Details Response", "clientApi"),
    )

    return apiParameters
}


