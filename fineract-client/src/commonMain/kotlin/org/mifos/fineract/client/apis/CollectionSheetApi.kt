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
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.PostCollectionSheetRequest
import org.mifos.fineract.client.models.PostCollectionSheetResponse

interface CollectionSheetApi {
    /**
     * Generate Individual Collection Sheet | Save Collection Sheet
     * Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.
     * Responses:
     *  - 200: OK
     *
     * @param postCollectionSheetRequest
     * @param command command (optional)
     * @return [PostCollectionSheetResponse]
     */
    @POST("v1/collectionsheet")
    suspend fun generateCollectionSheet(
        @Body postCollectionSheetRequest: PostCollectionSheetRequest,
        @Query("command") command: String? = null,
    ): PostCollectionSheetResponse
}
