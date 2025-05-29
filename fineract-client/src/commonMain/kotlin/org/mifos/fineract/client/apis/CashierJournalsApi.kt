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

interface CashierJournalsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param tellerId  (optional)
     * @param cashierId  (optional)
     * @param dateRange  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/cashiersjournal")
    suspend fun getJournalData1(
        @Query("officeId") officeId: Long? = null,
        @Query("tellerId") tellerId: Long? = null,
        @Query("cashierId") cashierId: Long? = null,
        @Query("dateRange") dateRange: String? = null,
    ): String
}
