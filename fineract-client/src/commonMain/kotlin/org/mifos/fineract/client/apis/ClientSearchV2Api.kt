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
import org.mifos.fineract.client.models.PageClientSearchData
import org.mifos.fineract.client.models.PagedRequestClientTextSearch

interface ClientSearchV2Api {
    /**
     * Search Clients by text
     *
     * Responses:
     *  - 0: default response
     *
     * @param pagedRequestClientTextSearch  (optional)
     * @return [PageClientSearchData]
     */
    @POST("v2/clients/search")
    suspend fun searchByText(@Body pagedRequestClientTextSearch: PagedRequestClientTextSearch? = null): PageClientSearchData
}
