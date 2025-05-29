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
 * Set of GetLoansLoanIdTransactions
 *
 * @param accountId
 * @param accountNumber
 * @param amount
 * @param bankNumber
 * @param checkNumber
 * @param currency
 * @param date
 * @param dateFormat
 * @param externalId
 * @param feeChargesPortion
 * @param fixedEmiAmount
 * @param id
 * @param interestPortion
 * @param loanChargePaidByList List of GetLoansLoanIdLoanChargePaidByData
 * @param loanRepaymentScheduleInstallments List of GetLoansLoanIdLoanRepaymentScheduleInstallmentData
 * @param locale
 * @param manuallyReversed
 * @param netDisbursalAmount
 * @param numberOfRepayments
 * @param officeId
 * @param officeName
 * @param outstandingLoanBalance
 * @param overpaymentPortion
 * @param paymentDetailData
 * @param paymentTypeId
 * @param paymentTypeOptions List of GetLoansLoanIdPaymentType
 * @param penaltyChargesPortion
 * @param possibleNextRepaymentDate
 * @param principalPortion
 * @param receiptNumber
 * @param reversalExternalId
 * @param reversedOnDate
 * @param routingCode
 * @param submittedOnDate
 * @param transactionAmount
 * @param transactionDate
 * @param transactionRelations List of GetLoansLoanIdLoanTransactionRelationData
 * @param transactionType
 * @param type
 * @param unrecognizedIncomePortion
 * @param writeOffReasonOptions List of GetLoansLoanIdCodeValueData
 */

@Serializable
data class GetLoansLoanIdTransactions(

    val accountId: kotlin.Long? = null,

    val accountNumber: kotlin.String? = null,

    val amount: kotlin.Double? = null,

    val bankNumber: kotlin.Int? = null,

    val checkNumber: kotlin.Int? = null,

    val currency: GetLoansLoanIdCurrency? = null,

    @Contextual
    val date: LocalDate? = null,

    val dateFormat: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val feeChargesPortion: kotlin.Double? = null,

    val fixedEmiAmount: kotlin.Double? = null,

    val id: kotlin.Long? = null,

    val interestPortion: kotlin.Double? = null,

    val loanChargePaidByList: kotlin.collections.List<GetLoansLoanIdLoanChargePaidByData>? = null,

    val loanRepaymentScheduleInstallments: kotlin.collections.List<GetLoansLoanIdLoanRepaymentScheduleInstallmentData>? = null,

    val locale: kotlin.String? = null,

    val manuallyReversed: kotlin.Boolean? = null,

    val netDisbursalAmount: kotlin.Double? = null,

    val numberOfRepayments: kotlin.Int? = null,

    val officeId: kotlin.Long? = null,

    val officeName: kotlin.String? = null,

    val outstandingLoanBalance: kotlin.Double? = null,

    val overpaymentPortion: kotlin.Double? = null,

    val paymentDetailData: GetLoansLoanIdPaymentDetailData? = null,

    val paymentTypeId: kotlin.Int? = null,

    val paymentTypeOptions: kotlin.collections.List<GetLoansLoanIdPaymentType>? = null,

    val penaltyChargesPortion: kotlin.Double? = null,

    @Contextual
    val possibleNextRepaymentDate: LocalDate? = null,

    val principalPortion: kotlin.Double? = null,

    val receiptNumber: kotlin.Int? = null,

    val reversalExternalId: kotlin.String? = null,

    @Contextual
    val reversedOnDate: LocalDate? = null,

    val routingCode: kotlin.Int? = null,

    @Contextual
    val submittedOnDate: LocalDate? = null,

    val transactionAmount: kotlin.Double? = null,

    @Contextual
    val transactionDate: LocalDate? = null,

    val transactionRelations: kotlin.collections.Set<GetLoansLoanIdLoanTransactionRelation>? = null,

    val transactionType: kotlin.String? = null,

    val type: GetLoansLoanIdLoanTransactionEnumData? = null,

    val unrecognizedIncomePortion: kotlin.Double? = null,

    val writeOffReasonOptions: kotlin.collections.List<GetLoansLoanIdCodeValueData>? = null,

)
