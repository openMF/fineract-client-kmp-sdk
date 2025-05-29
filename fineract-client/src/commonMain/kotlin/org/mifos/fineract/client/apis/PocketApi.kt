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
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.GetAccountsLinkedToPocketResponse
import org.mifos.fineract.client.models.PostLinkDelinkAccountsToFromPocketResponse

interface PocketApi {
    /**
     * Link/delink accounts to/from pocket
     * Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts
     * Responses:
     *  - 200: OK
     *
     * @param command command (optional)
     * @param body  (optional)
     * @return [PostLinkDelinkAccountsToFromPocketResponse]
     */
    @POST("v1/self/pockets")
    suspend fun handleCommands8(
        @Query("command") command: String? = null,
        @Body body: String? = null,
    ): PostLinkDelinkAccountsToFromPocketResponse

    /**
     * Retrieve accounts linked to pocket
     * All linked loan  Example Requests:   self/pockets
     * Responses:
     *  - 200: OK
     *
     * @return [GetAccountsLinkedToPocketResponse]
     */
    @GET("v1/self/pockets")
    suspend fun retrieveAll37(): GetAccountsLinkedToPocketResponse
}
