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
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.mifos.fineract.client.models.PagedLocalRequestAdvancedQueryRequest
import org.mifos.fineract.client.models.PostSavingsAccountBulkReversalTransactionsRequest
import org.mifos.fineract.client.models.PostSavingsAccountTransactionsRequest
import org.mifos.fineract.client.models.PostSavingsAccountTransactionsResponse
import org.mifos.fineract.client.models.SavingsAccountTransactionsSearchResponse

interface SavingsAccountTransactionsApi {
    /**
     * Undo/Reverse/Modify/Release Amount transaction API
     * Undo/Reverse/Modify/Release Amount transaction API  Example Requests:   savingsaccounts/{savingsId}/transactions/{transactionId}?command&#x3D;reverse  Accepted command &#x3D; undo, reverse, modify, releaseAmount
     * Responses:
     *  - 200: OK
     *
     * @param savingsId
     * @param transactionId
     * @param postSavingsAccountBulkReversalTransactionsRequest
     * @param command  (optional)
     * @return [kotlin.collections.List<PostSavingsAccountBulkReversalTransactionsRequest]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions/{transactionId}")
    suspend fun adjustTransaction1(
        @Path("savingsId") savingsId: Long,
        @Path("transactionId") transactionId: Long,
        @Body postSavingsAccountBulkReversalTransactionsRequest: PostSavingsAccountBulkReversalTransactionsRequest,
        @Query("command") command: String? = null,
    ): List<PostSavingsAccountBulkReversalTransactionsRequest>

    /**
     * Advanced search Savings Account Transactions
     *
     * Responses:
     *  - 200: OK
     *
     * @param savingsId savingsId
     * @param pagedLocalRequestAdvancedQueryRequest  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions/query")
    suspend fun advancedQuery1(
        @Path("savingsId") savingsId: Long,
        @Body pagedLocalRequestAdvancedQueryRequest: PagedLocalRequestAdvancedQueryRequest? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param savingsId
     * @param transactionId
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/{transactionId}")
    suspend fun retrieveOne24(
        @Path("savingsId") savingsId: Long,
        @Path("transactionId") transactionId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param savingsId
     * @return [kotlin.String]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/template")
    suspend fun retrieveTemplate19(@Path("savingsId") savingsId: Long): String

    /**
     * enum for parameter sortOrder
     */
    @Serializable
    enum class SortOrderSearchTransactions(val value: String) {
        @SerialName("ASC")
        ASC("ASC"),

        @SerialName("DESC")
        DESC("DESC"),
    }

    /**
     * Search Savings Account Transactions
     *
     * Responses:
     *  - 200: OK
     *
     * @param savingsId savings account id
     * @param fromDate minimum value date (inclusive) (optional)
     * @param toDate maximum value date (inclusive) (optional)
     * @param fromSubmittedDate minimum booking date (inclusive) (optional)
     * @param toSubmittedDate maximum booking date (inclusive) (optional)
     * @param fromAmount minimum transaction amount (inclusive) (optional)
     * @param toAmount maximum transaction amount (inclusive) (optional)
     * @param types transaction types (optional)
     * @param credit credit (optional)
     * @param debit debit (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy sort properties (optional)
     * @param sortOrder sort direction (optional)
     * @param locale locale (optional)
     * @param dateFormat date format (optional)
     * @return [SavingsAccountTransactionsSearchResponse]
     */
    @GET("v1/savingsaccounts/{savingsId}/transactions/search")
    suspend fun searchTransactions(
        @Path("savingsId") savingsId: Long,
        @Query("fromDate") fromDate: String? = null,
        @Query("toDate") toDate: String? = null,
        @Query("fromSubmittedDate") fromSubmittedDate: String? = null,
        @Query("toSubmittedDate") toSubmittedDate: String? = null,
        @Query("fromAmount") fromAmount: Double? = null,
        @Query("toAmount") toAmount: Double? = null,
        @Query("types") types: String? = null,
        @Query("credit") credit: Boolean? = null,
        @Query("debit") debit: Boolean? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: SortOrderSearchTransactions? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null,
    ): SavingsAccountTransactionsSearchResponse

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param savingsId
     * @param postSavingsAccountTransactionsRequest
     * @param command  (optional)
     * @return [PostSavingsAccountTransactionsResponse]
     */
    @POST("v1/savingsaccounts/{savingsId}/transactions")
    suspend fun transaction2(
        @Path("savingsId") savingsId: Long,
        @Body postSavingsAccountTransactionsRequest: PostSavingsAccountTransactionsRequest,
        @Query("command") command: String? = null,
    ): PostSavingsAccountTransactionsResponse
}
