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

interface FixedDepositAccountTransactionsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId
     * @param transactionId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
    suspend fun adjustTransaction(
        @Path("fixedDepositAccountId") fixedDepositAccountId: Long,
        @Path("transactionId") transactionId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId
     * @param transactionId
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
    suspend fun retrieveOne18(
        @Path("fixedDepositAccountId") fixedDepositAccountId: Long,
        @Path("transactionId") transactionId: Long,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions/template")
    suspend fun retrieveTemplate14(@Path("fixedDepositAccountId") fixedDepositAccountId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param fixedDepositAccountId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/fixeddepositaccounts/{fixedDepositAccountId}/transactions")
    suspend fun transaction(
        @Path("fixedDepositAccountId") fixedDepositAccountId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null,
    ): String
}
