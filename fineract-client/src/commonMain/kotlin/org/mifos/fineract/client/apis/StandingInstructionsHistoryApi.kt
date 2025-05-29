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

import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.GetStandingInstructionRunHistoryResponse

interface StandingInstructionsHistoryApi {
    /**
     * Standing Instructions Logged History
     * The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param transferType transferType (optional)
     * @param clientName clientName (optional)
     * @param clientId clientId (optional)
     * @param fromAccountId fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @param locale locale (optional)
     * @param dateFormat dateFormat (optional)
     * @param fromDate fromDate (optional)
     * @param toDate toDate (optional)
     * @return [GetStandingInstructionRunHistoryResponse]
     */
    @GET("v1/standinginstructionrunhistory")
    suspend fun retrieveAll20(
        @Query("externalId") externalId: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("transferType") transferType: Int? = null,
        @Query("clientName") clientName: String? = null,
        @Query("clientId") clientId: Long? = null,
        @Query("fromAccountId") fromAccountId: Long? = null,
        @Query("fromAccountType") fromAccountType: Int? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null,
        @Query("fromDate") fromDate: String? = null,
        @Query("toDate") toDate: String? = null,
    ): GetStandingInstructionRunHistoryResponse
}
