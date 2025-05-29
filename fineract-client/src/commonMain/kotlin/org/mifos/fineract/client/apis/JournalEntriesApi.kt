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
import de.jensklingenberg.ktorfit.http.Multipart
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Part
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import io.ktor.client.request.forms.MultiPartFormDataContent
import org.mifos.fineract.client.models.GetJournalEntriesTransactionIdResponse
import org.mifos.fineract.client.models.JournalEntryCommand
import org.mifos.fineract.client.models.JournalEntryTransactionItem
import org.mifos.fineract.client.models.PostJournalEntriesResponse
import org.mifos.fineract.client.models.PostJournalEntriesTransactionIdRequest
import org.mifos.fineract.client.models.PostJournalEntriesTransactionIdResponse

interface JournalEntriesApi {
    /**
     * Create \&quot;Balanced\&quot; Journal Entries
     * Note: A Balanced (simple) Journal entry would have atleast one \&quot;Debit\&quot; and one \&quot;Credit\&quot; entry whose amounts are equal  Compound Journal entries may have \&quot;n\&quot; debits and \&quot;m\&quot; credits where both \&quot;m\&quot; and \&quot;n\&quot; are greater than 0 and the net sum or all debits and credits are equal    Mandatory Fields officeId, transactionDate   credits- glAccountId, amount, comments    debits-  glAccountId, amount, comments    Optional Fields paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber
     * Responses:
     *  - 200: OK
     *
     * @param command command (optional)
     * @param journalEntryCommand  (optional)
     * @return [PostJournalEntriesResponse]
     */
    @POST("v1/journalentries")
    suspend fun createGLJournalEntry(
        @Query("command") command: String? = null,
        @Body journalEntryCommand: JournalEntryCommand? = null,
    ): PostJournalEntriesResponse

    /**
     * Update Running balances for Journal Entries
     * This API calculates the running balances for office. If office ID not provided this API calculates running balances for all offices.  Mandatory Fields officeId
     * Responses:
     *  - 200: OK
     *
     * @param transactionId transactionId
     * @param command command (optional)
     * @param postJournalEntriesTransactionIdRequest  (optional)
     * @return [PostJournalEntriesTransactionIdResponse]
     */
    @POST("v1/journalentries/{transactionId}")
    suspend fun createReversalJournalEntry(
        @Path("transactionId") transactionId: String,
        @Query("command") command: String? = null,
        @Body postJournalEntriesTransactionIdRequest: PostJournalEntriesTransactionIdRequest? = null,
    ): PostJournalEntriesTransactionIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param dateFormat  (optional)
     * @return [Unit]
     */
    @GET("v1/journalentries/downloadtemplate")
    suspend fun getJournalEntriesTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("dateFormat") dateFormat: String? = null,
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/journalentries/uploadtemplate")
    suspend fun postJournalEntriesTemplate(
        @Part("dateFormat") dateFormat: String,
        @Part("locale") locale: String,
        @Part uploadedInputStream: MultiPartFormDataContent,
    ): String

    /**
     * List Journal Entries
     * The list capability of journal entries can support pagination and sorting.  Example Requests:  journalentries  journalentries?transactionId&#x3D;PB37X8Y21EQUY4S  journalentries?officeId&#x3D;1&amp;manualEntriesOnly&#x3D;true&amp;fromDate&#x3D;1 July 2013&amp;toDate&#x3D;15 July 2013&amp;dateFormat&#x3D;dd MMMM yyyy&amp;locale&#x3D;en  journalentries?fields&#x3D;officeName,glAccountName,transactionDate  journalentries?offset&#x3D;10&amp;limit&#x3D;50  journalentries?orderBy&#x3D;transactionId&amp;sortOrder&#x3D;DESC  journalentries?runningBalance&#x3D;true  journalentries?transactionDetails&#x3D;true  journalentries?loanId&#x3D;12  journalentries?savingsId&#x3D;24
     * Responses:
     *  - 200: OK
     *
     * @param officeId officeId (optional)
     * @param glAccountId glAccountId (optional)
     * @param manualEntriesOnly manualEntriesOnly (optional)
     * @param fromDate fromDate (optional)
     * @param toDate toDate (optional)
     * @param submittedOnDateFrom submittedOnDateFrom (optional)
     * @param submittedOnDateTo submittedOnDateTo (optional)
     * @param transactionId transactionId (optional)
     * @param entityType entityType (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param locale locale (optional)
     * @param dateFormat dateFormat (optional)
     * @param loanId loanId (optional)
     * @param savingsId savingsId (optional)
     * @param runningBalance runningBalance (optional)
     * @param transactionDetails transactionDetails (optional)
     * @return [GetJournalEntriesTransactionIdResponse]
     */
    @GET("v1/journalentries")
    suspend fun retrieveAll1(
        @Query("officeId") officeId: Long? = null,
        @Query("glAccountId") glAccountId: Long? = null,
        @Query("manualEntriesOnly") manualEntriesOnly: Boolean? = null,
        @Query("fromDate") fromDate: String? = null,
        @Query("toDate") toDate: String? = null,
        @Query("submittedOnDateFrom") submittedOnDateFrom: String? = null,
        @Query("submittedOnDateTo") submittedOnDateTo: String? = null,
        @Query("transactionId") transactionId: String? = null,
        @Query("entityType") entityType: Int? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null,
        @Query("loanId") loanId: Long? = null,
        @Query("savingsId") savingsId: Long? = null,
        @Query("runningBalance") runningBalance: Boolean? = null,
        @Query("transactionDetails") transactionDetails: Boolean? = null,
    ): GetJournalEntriesTransactionIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param offset  (optional)
     * @param limit  (optional)
     * @param entryId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/journalentries/provisioning")
    suspend fun retrieveJournalEntries(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("entryId") entryId: Long? = null,
    ): String

    /**
     * Retrieve a single Entry
     * Example Requests:  journalentries/1    journalentries/1?fields&#x3D;officeName,glAccountId,entryType,amount  journalentries/1?runningBalance&#x3D;true  journalentries/1?transactionDetails&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param journalEntryId journalEntryId
     * @param runningBalance runningBalance (optional)
     * @param transactionDetails transactionDetails (optional)
     * @return [JournalEntryTransactionItem]
     */
    @GET("v1/journalentries/{journalEntryId}")
    suspend fun retrieveJournalEntryById(
        @Path("journalEntryId") journalEntryId: Long,
        @Query("runningBalance") runningBalance: Boolean? = null,
        @Query("transactionDetails") transactionDetails: Boolean? = null,
    ): JournalEntryTransactionItem

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param currencyCode  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/journalentries/openingbalance")
    suspend fun retrieveOpeningBalance(
        @Query("officeId") officeId: Long? = null,
        @Query("currencyCode") currencyCode: String? = null,
    ): String
}
