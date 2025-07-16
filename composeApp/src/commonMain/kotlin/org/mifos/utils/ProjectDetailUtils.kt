package org.mifos.utils

import fineract_sdk_cmp.composeapp.generated.resources.Res
import fineract_sdk_cmp.composeapp.generated.resources.field_officer_desc
import fineract_sdk_cmp.composeapp.generated.resources.field_officer_name
import fineract_sdk_cmp.composeapp.generated.resources.mifos_mobile_name
import fineract_sdk_cmp.composeapp.generated.resources.mifos_pay_desc
import fineract_sdk_cmp.composeapp.generated.resources.mifos_pay_name
import org.mifos.model.ProjectDetails


internal fun projectDetailUtils() : List<ProjectDetails> {

    return listOf(
        ProjectDetails(Res.string.field_officer_name, Res.string.field_officer_desc),
        ProjectDetails(Res.string.mifos_mobile_name, Res.string.mifos_mobile_name),
        ProjectDetails(Res.string.mifos_pay_name, Res.string.mifos_pay_desc)
    )
}