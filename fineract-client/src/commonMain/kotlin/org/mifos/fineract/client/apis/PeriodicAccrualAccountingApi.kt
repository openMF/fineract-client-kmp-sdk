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
import org.mifos.fineract.client.models.PostRunaccrualsRequest

interface PeriodicAccrualAccountingApi {
    /**
     * Executes Periodic Accrual Accounting
     * Mandatory Fields  tillDate
     * Responses:
     *  - 200: OK
     *
     * @param postRunaccrualsRequest
     * @return [Unit]
     */
    @POST("v1/runaccruals")
    suspend fun executePeriodicAccrualAccounting(@Body postRunaccrualsRequest: PostRunaccrualsRequest)
}
