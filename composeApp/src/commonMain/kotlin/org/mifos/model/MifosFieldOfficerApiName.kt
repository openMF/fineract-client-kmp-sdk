/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.model

import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.authentication_api_name
import fineract_sdk_cmp.composeapp.generated.resources.center_api_name
import fineract_sdk_cmp.composeapp.generated.resources.charge_api_name
import org.jetbrains.compose.resources.StringResource

enum class MifosFieldOfficerApiName(
    val apiName: StringResource,
) {
    AUTHENTICATION(Res.string.authentication_api_name),
    CENTER(Res.string.center_api_name),
    CHARGE(Res.string.charge_api_name),
}
