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
import org.mifos.fineract.client.models.DeleteRecurringDepositProductsProductIdResponse
import org.mifos.fineract.client.models.GetRecurringDepositProductsProductIdResponse
import org.mifos.fineract.client.models.GetRecurringDepositProductsResponse
import org.mifos.fineract.client.models.PostRecurringDepositProductsRequest
import org.mifos.fineract.client.models.PostRecurringDepositProductsResponse
import org.mifos.fineract.client.models.PutRecurringDepositProductsRequest
import org.mifos.fineract.client.models.PutRecurringDepositProductsResponse

interface RecurringDepositProductApi {
    /**
     * Create a Recurring Deposit Product
     * Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId
     * Responses:
     *  - 200: OK
     *
     * @param postRecurringDepositProductsRequest
     * @return [PostRecurringDepositProductsResponse]
     */
    @POST("v1/recurringdepositproducts")
    suspend fun create12(@Body postRecurringDepositProductsRequest: PostRecurringDepositProductsRequest): PostRecurringDepositProductsResponse

    /**
     * Delete a Recurring Deposit Product
     * Deletes a Recurring Deposit Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [DeleteRecurringDepositProductsProductIdResponse]
     */
    @DELETE("v1/recurringdepositproducts/{productId}")
    suspend fun delete18(@Path("productId") productId: Long): DeleteRecurringDepositProductsProductIdResponse

    /**
     * List Recuring Deposit Products
     * Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetRecurringDepositProductsResponse]
     */
    @GET("v1/recurringdepositproducts")
    suspend fun retrieveAll32(): List<GetRecurringDepositProductsResponse>

    /**
     * Retrieve a Recurring Deposit Product
     * Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [GetRecurringDepositProductsProductIdResponse]
     */
    @GET("v1/recurringdepositproducts/{productId}")
    suspend fun retrieveOne23(@Path("productId") productId: Long): GetRecurringDepositProductsProductIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/recurringdepositproducts/template")
    suspend fun retrieveTemplate17(): String

    /**
     * Update a Recurring Deposit Product
     * Updates a Recurring Deposit Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @param putRecurringDepositProductsRequest
     * @return [PutRecurringDepositProductsResponse]
     */
    @PUT("v1/recurringdepositproducts/{productId}")
    suspend fun update19(
        @Path("productId") productId: Long,
        @Body putRecurringDepositProductsRequest: PutRecurringDepositProductsRequest,
    ): PutRecurringDepositProductsResponse
}
