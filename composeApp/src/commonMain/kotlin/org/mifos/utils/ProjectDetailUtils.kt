/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.utils

import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.field_officer_desc
import fineract_sdk_cmp.composeapp.generated.resources.field_officer_name
import fineract_sdk_cmp.composeapp.generated.resources.mifos_mobile_desc
import fineract_sdk_cmp.composeapp.generated.resources.mifos_mobile_name
import fineract_sdk_cmp.composeapp.generated.resources.mifos_pay_desc
import fineract_sdk_cmp.composeapp.generated.resources.mifos_pay_name
import org.mifos.model.ProjectDetails

internal fun projectDetailUtils(): List<ProjectDetails> {
    return listOf(
        ProjectDetails(Res.string.field_officer_name, Res.string.field_officer_desc),
        ProjectDetails(Res.string.mifos_mobile_name, Res.string.mifos_mobile_desc),
        ProjectDetails(Res.string.mifos_pay_name, Res.string.mifos_pay_desc),
    )
}
