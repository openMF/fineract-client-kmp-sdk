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
import org.mifos.fineract.client.models.GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse
import org.mifos.fineract.client.models.GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse
import org.mifos.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest
import org.mifos.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse
import org.mifos.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse

interface RecurringDepositAccountTransactionsApi {
    /**
     * Adjust Transaction | Undo transaction
     * Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#39;Adjust Transaction&#39;
     * Responses:
     *  - 200: OK
     *
     * @param recurringDepositAccountId recurringDepositAccountId
     * @param transactionId transactionId
     * @param postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest
     * @param command command (optional)
     * @return [PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse]
     */
    @POST("v1/recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId}")
    suspend fun handleTransactionCommands(
        @Path("recurringDepositAccountId") recurringDepositAccountId: Long,
        @Path("transactionId") transactionId: Long,
        @Body postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest: PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest,
        @Query("command") command: String? = null,
    ): PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse

    /**
     * Retrieve Recurring Deposit Account Transaction
     * Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1
     * Responses:
     *  - 200: OK
     *
     * @param recurringDepositAccountId recurringDepositAccountId
     * @param transactionId transactionId
     * @return [GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse]
     */
    @GET("v1/recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId}")
    suspend fun retrieveOne21(
        @Path("recurringDepositAccountId") recurringDepositAccountId: Long,
        @Path("transactionId") transactionId: Long,
    ): GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse

    /**
     * Retrieve Recurring Deposit Account Transaction Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal
     * Responses:
     *  - 200: OK
     *
     * @param recurringDepositAccountId recurringDepositAccountId
     * @param command command (optional)
     * @return [GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse]
     */
    @GET("v1/recurringdepositaccounts/{recurringDepositAccountId}/transactions/template")
    suspend fun retrieveTemplate16(
        @Path("recurringDepositAccountId") recurringDepositAccountId: Long,
        @Query("command") command: String? = null,
    ): GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse

    /**
     * Deposit Transaction | Withdrawal Transaction
     * Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction
     * Responses:
     *  - 200: OK
     *
     * @param recurringDepositAccountId recurringDepositAccountId
     * @param postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest
     * @param command command (optional)
     * @return [PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse]
     */
    @POST("v1/recurringdepositaccounts/{recurringDepositAccountId}/transactions")
    suspend fun transaction1(
        @Path("recurringDepositAccountId") recurringDepositAccountId: Long,
        @Body postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest: PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest,
        @Query("command") command: String? = null,
    ): PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse
}
