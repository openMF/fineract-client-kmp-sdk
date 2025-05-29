/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package org.mifos.fineract.client.models

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * GetLoansLoanIdTransactionsTransactionIdResponse
 *
 * @param amount
 * @param currency
 * @param date
 * @param externalId
 * @param feeChargesPortion
 * @param id
 * @param interestPortion
 * @param loanChargePaidByList
 * @param manuallyReversed
 * @param netDisbursalAmount
 * @param outstandingLoanBalance
 * @param overpaymentPortion
 * @param paymentDetailData
 * @param penaltyChargesPortion
 * @param possibleNextRepaymentDate
 * @param principalPortion
 * @param reversalExternalId
 * @param reversedOnDate
 * @param submittedOnDate
 * @param transactionRelations
 * @param type
 * @param unrecognizedIncomePortion
 */

@Serializable
data class GetLoansLoanIdTransactionsTransactionIdResponse(

    val amount: kotlin.Double? = null,

    val currency: GetLoansCurrency? = null,

    @Contextual
    val date: LocalDate? = null,

    val externalId: kotlin.String? = null,

    val feeChargesPortion: kotlin.Double? = null,

    val id: kotlin.Long? = null,

    val interestPortion: kotlin.Double? = null,

    val loanChargePaidByList: kotlin.collections.Set<GetLoansLoanIdLoanChargePaidByData>? = null,

    val manuallyReversed: kotlin.Boolean? = null,

    val netDisbursalAmount: kotlin.Double? = null,

    val outstandingLoanBalance: kotlin.Double? = null,

    val overpaymentPortion: kotlin.Double? = null,

    val paymentDetailData: PaymentDetailData? = null,

    val penaltyChargesPortion: kotlin.Double? = null,

    @Contextual
    val possibleNextRepaymentDate: LocalDate? = null,

    val principalPortion: kotlin.Double? = null,

    val reversalExternalId: kotlin.String? = null,

    @Contextual
    val reversedOnDate: LocalDate? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val transactionRelations: kotlin.collections.Set<GetLoanTransactionRelation>? = null,

    val type: GetLoansType? = null,

    val unrecognizedIncomePortion: kotlin.Double? = null,

)
