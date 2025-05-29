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

interface BulkImportApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param importDocumentId  (optional)
     * @return [Unit]
     */
    @GET("v1/imports/downloadOutputTemplate")
    suspend fun getOutputTemplate(@Query("importDocumentId") importDocumentId: String? = null): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/imports")
    suspend fun retrieveImportDocuments(@Query("entityType") entityType: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param importDocumentId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/imports/getOutputTemplateLocation")
    suspend fun retriveOutputTemplateLocation(@Query("importDocumentId") importDocumentId: String? = null): String
}
