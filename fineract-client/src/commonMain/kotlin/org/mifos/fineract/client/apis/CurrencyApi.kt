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
import de.jensklingenberg.ktorfit.http.PUT
import org.mifos.fineract.client.models.GetCurrenciesResponse
import org.mifos.fineract.client.models.PutCurrenciesRequest
import org.mifos.fineract.client.models.PutCurrenciesResponse

interface CurrencyApi {
    /**
     * Retrieve Currency Configuration
     * Returns the list of currencies permitted for use AND the list of currencies not selected (but available for selection).  Example Requests:  currencies   currencies?fields&#x3D;selectedCurrencyOptions
     * Responses:
     *  - 200: OK
     *
     * @return [GetCurrenciesResponse]
     */
    @GET("v1/currencies")
    suspend fun retrieveCurrencies(): GetCurrenciesResponse

    /**
     * Update Currency Configuration
     * Updates the list of currencies permitted for use.
     * Responses:
     *  - 200: OK
     *
     * @param putCurrenciesRequest
     * @return [PutCurrenciesResponse]
     */
    @PUT("v1/currencies")
    suspend fun updateCurrencies(@Body putCurrenciesRequest: PutCurrenciesRequest): PutCurrenciesResponse
}
