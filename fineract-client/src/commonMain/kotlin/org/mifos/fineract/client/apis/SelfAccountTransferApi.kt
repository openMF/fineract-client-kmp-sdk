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
import org.mifos.fineract.client.models.GetAccountTransferTemplateResponse
import org.mifos.fineract.client.models.PostNewTransferResponse

interface SelfAccountTransferApi {
    /**
     * Create new Transfer
     * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/
     * Responses:
     *  - 200: OK
     *
     * @param type  (optional, default to "")
     * @param body  (optional)
     * @return [kotlin.collections.List<PostNewTransferResponse]
     */
    @POST("v1/self/accounttransfers")
    suspend fun create14(
        @Query("type") type: String? = "",
        @Body body: String? = null,
    ): List<PostNewTransferResponse>

    /**
     * Retrieve Account Transfer Template
     * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template
     * Responses:
     *  - 200: OK
     *
     * @param type  (optional, default to "")
     * @return [kotlin.collections.List<GetAccountTransferTemplateResponse]
     */
    @GET("v1/self/accounttransfers/template")
    suspend fun template15(@Query("type") type: String? = ""): List<GetAccountTransferTemplateResponse>
}
