/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
package org.mifos.fineract.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import org.mifos.fineract.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse
import org.mifos.fineract.client.models.GetLoansLoanIdCollateralsResponse
import org.mifos.fineract.client.models.GetLoansLoanIdCollateralsTemplateResponse
import org.mifos.fineract.client.models.PostLoansLoanIdCollateralsRequest
import org.mifos.fineract.client.models.PostLoansLoanIdCollateralsResponse
import org.mifos.fineract.client.models.PutLoansLoanIdCollateralsCollateralIdResponse
import org.mifos.fineract.client.models.PutLoansLoandIdCollateralsCollateralIdRequest

interface LoanCollateralApi {
    /**
     * Create a Collateral
     * Note: Currently, Collaterals may be added only before a Loan is approved
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param postLoansLoanIdCollateralsRequest
     * @return [PostLoansLoanIdCollateralsResponse]
     */
    @POST("v1/loans/{loanId}/collaterals")
    suspend fun createCollateral(
        @Path("loanId") loanId: Long,
        @Body postLoansLoanIdCollateralsRequest: PostLoansLoanIdCollateralsRequest,
    ): PostLoansLoanIdCollateralsResponse

    /**
     * Remove a Collateral
     * Note: A collateral can only be removed from Loans that are not yet approved.
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param collateralId collateralId
     * @return [DeleteLoansLoanIdCollateralsCollateralIdResponse]
     */
    @DELETE("v1/loans/{loanId}/collaterals/{collateralId}")
    suspend fun deleteCollateral(
        @Path("loanId") loanId: Long,
        @Path("collateralId") collateralId: Long,
    ): DeleteLoansLoanIdCollateralsCollateralIdResponse

    /**
     * Retrieve Collateral Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [GetLoansLoanIdCollateralsTemplateResponse]
     */
    @GET("v1/loans/{loanId}/collaterals/template")
    suspend fun newCollateralTemplate(@Path("loanId") loanId: Long): GetLoansLoanIdCollateralsTemplateResponse

    /**
     * List Loan Collaterals
     * Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @return [kotlin.collections.List<GetLoansLoanIdCollateralsResponse]
     */
    @GET("v1/loans/{loanId}/collaterals")
    suspend fun retrieveCollateralDetails(@Path("loanId") loanId: Long): List<GetLoansLoanIdCollateralsResponse>

    /**
     * Retrieve a Collateral
     * Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;description,description
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param collateralId collateralId
     * @return [GetLoansLoanIdCollateralsResponse]
     */
    @GET("v1/loans/{loanId}/collaterals/{collateralId}")
    suspend fun retrieveCollateralDetails1(
        @Path("loanId") loanId: Long,
        @Path("collateralId") collateralId: Long,
    ): GetLoansLoanIdCollateralsResponse

    /**
     * Update a Collateral
     *
     * Responses:
     *  - 200: OK
     *
     * @param loanId loanId
     * @param collateralId collateralId
     * @param putLoansLoandIdCollateralsCollateralIdRequest
     * @return [PutLoansLoanIdCollateralsCollateralIdResponse]
     */
    @PUT("v1/loans/{loanId}/collaterals/{collateralId}")
    suspend fun updateCollateral(
        @Path("loanId") loanId: Long,
        @Path("collateralId") collateralId: Long,
        @Body putLoansLoandIdCollateralsCollateralIdRequest: PutLoansLoandIdCollateralsCollateralIdRequest,
    ): PutLoansLoanIdCollateralsCollateralIdResponse
}
