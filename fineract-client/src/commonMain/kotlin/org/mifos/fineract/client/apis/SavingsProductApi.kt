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
import org.mifos.fineract.client.models.DeleteSavingsProductsProductIdResponse
import org.mifos.fineract.client.models.GetSavingsProductsProductIdResponse
import org.mifos.fineract.client.models.GetSavingsProductsResponse
import org.mifos.fineract.client.models.GetSavingsProductsTemplateResponse
import org.mifos.fineract.client.models.PostSavingsProductsRequest
import org.mifos.fineract.client.models.PostSavingsProductsResponse
import org.mifos.fineract.client.models.PutSavingsProductsProductIdRequest
import org.mifos.fineract.client.models.PutSavingsProductsProductIdResponse

interface SavingsProductApi {
    /**
     * Create a Savings Product
     * Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId,accountMapping, lienAllowed, maxAllowedLienLimit
     * Responses:
     *  - 200: OK
     *
     * @param postSavingsProductsRequest
     * @return [PostSavingsProductsResponse]
     */
    @POST("v1/savingsproducts")
    suspend fun create13(@Body postSavingsProductsRequest: PostSavingsProductsRequest): PostSavingsProductsResponse

    /**
     * Delete a Savings Product
     * Deletes a Savings Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [DeleteSavingsProductsProductIdResponse]
     */
    @DELETE("v1/savingsproducts/{productId}")
    suspend fun delete21(@Path("productId") productId: Long): DeleteSavingsProductsProductIdResponse

    /**
     * List Savings Products
     * Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetSavingsProductsResponse]
     */
    @GET("v1/savingsproducts")
    suspend fun retrieveAll34(): List<GetSavingsProductsResponse>

    /**
     * Retrieve a Savings Product
     * Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [GetSavingsProductsProductIdResponse]
     */
    @GET("v1/savingsproducts/{productId}")
    suspend fun retrieveOne27(@Path("productId") productId: Long): GetSavingsProductsProductIdResponse

    /**
     * Retrieve Savings Product Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request: Account Mapping:  savingsproducts/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetSavingsProductsTemplateResponse]
     */
    @GET("v1/savingsproducts/template")
    suspend fun retrieveTemplate20(): GetSavingsProductsTemplateResponse

    /**
     * Update a Savings Product
     * Updates a Savings Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @param putSavingsProductsProductIdRequest
     * @return [PutSavingsProductsProductIdResponse]
     */
    @PUT("v1/savingsproducts/{productId}")
    suspend fun update22(
        @Path("productId") productId: Long,
        @Body putSavingsProductsProductIdRequest: PutSavingsProductsProductIdRequest,
    ): PutSavingsProductsProductIdResponse
}
