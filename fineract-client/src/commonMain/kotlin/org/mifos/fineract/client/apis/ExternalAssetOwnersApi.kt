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
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.ExternalOwnerJournalEntryData
import org.mifos.fineract.client.models.ExternalOwnerTransferJournalEntryData
import org.mifos.fineract.client.models.ExternalTransferData
import org.mifos.fineract.client.models.PageExternalTransferData
import org.mifos.fineract.client.models.PagedRequestExternalAssetOwnerSearchRequest
import org.mifos.fineract.client.models.PostInitiateTransferRequest
import org.mifos.fineract.client.models.PostInitiateTransferResponse

interface ExternalAssetOwnersApi {
    /**
     * Retrieve Active Asset Owner Transfer
     * Retrieve Active External Asset Owner Transfer by transferExternalId, loanId or loanExternalId
     * Responses:
     *  - 0: default response
     *
     * @param transferExternalId transferExternalId (optional)
     * @param loanId loanId (optional)
     * @param loanExternalId loanExternalId (optional)
     * @return [ExternalTransferData]
     */
    @GET("v1/external-asset-owners/transfers/active-transfer")
    suspend fun getActiveTransfer(
        @Query("transferExternalId") transferExternalId: String? = null,
        @Query("loanId") loanId: Long? = null,
        @Query("loanExternalId") loanExternalId: String? = null,
    ): ExternalTransferData

    /**
     * Retrieve Journal Entries of Owner
     * Retrieve Journal entries of owner by owner externalId
     * Responses:
     *  - 0: default response
     *
     * @param ownerExternalId ownerExternalId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [ExternalOwnerJournalEntryData]
     */
    @GET("v1/external-asset-owners/owners/external-id/{ownerExternalId}/journal-entries")
    suspend fun getJournalEntriesOfOwner(
        @Path("ownerExternalId") ownerExternalId: String,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
    ): ExternalOwnerJournalEntryData

    /**
     * Retrieve Journal Entries of Transfer
     * Retrieve Journal entries of transfer by transferId
     * Responses:
     *  - 0: default response
     *
     * @param transferId transferId
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [ExternalOwnerTransferJournalEntryData]
     */
    @GET("v1/external-asset-owners/transfers/{transferId}/journal-entries")
    suspend fun getJournalEntriesOfTransfer(
        @Path("transferId") transferId: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
    ): ExternalOwnerTransferJournalEntryData

    /**
     * Retrieve External Asset Owner Transfers
     * Retrieve External Asset Owner Transfer items by transferExternalId, loanId or loanExternalId
     * Responses:
     *  - 0: default response
     *
     * @param transferExternalId transferExternalId (optional)
     * @param loanId loanId (optional)
     * @param loanExternalId loanExternalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [PageExternalTransferData]
     */
    @GET("v1/external-asset-owners/transfers")
    suspend fun getTransfers(
        @Query("transferExternalId") transferExternalId: String? = null,
        @Query("loanId") loanId: Long? = null,
        @Query("loanExternalId") loanExternalId: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
    ): PageExternalTransferData

    /**
     * Search External Asset Owner Transfers by text or date ranges to settlement or effective dates
     *
     * Responses:
     *  - 0: default response
     *
     * @param pagedRequestExternalAssetOwnerSearchRequest  (optional)
     * @return [PageExternalTransferData]
     */
    @POST("v1/external-asset-owners/search")
    suspend fun searchInvestorData(@Body pagedRequestExternalAssetOwnerSearchRequest: PagedRequestExternalAssetOwnerSearchRequest? = null): PageExternalTransferData

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *  - 403: Transfer cannot be initiated
     *
     * @param id
     * @param command command (optional)
     * @return [PostInitiateTransferResponse]
     */
    @POST("v1/external-asset-owners/transfers/{id}")
    suspend fun transferRequestWithId(
        @Path("id") id: Long,
        @Query("command") command: String? = null,
    ): PostInitiateTransferResponse

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *  - 403: Transfer cannot be initiated
     *
     * @param externalId
     * @param command command (optional)
     * @return [PostInitiateTransferResponse]
     */
    @POST("v1/external-asset-owners/transfers/external-id/{externalId}")
    suspend fun transferRequestWithId1(
        @Path("externalId") externalId: String,
        @Query("command") command: String? = null,
    ): PostInitiateTransferResponse

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *  - 403: Transfer cannot be initiated
     *
     * @param loanExternalId
     * @param postInitiateTransferRequest
     * @param command command (optional)
     * @return [PostInitiateTransferResponse]
     */
    @POST("v1/external-asset-owners/transfers/loans/external-id/{loanExternalId}")
    suspend fun transferRequestWithLoanExternalId(
        @Path("loanExternalId") loanExternalId: String,
        @Body postInitiateTransferRequest: PostInitiateTransferRequest,
        @Query("command") command: String? = null,
    ): PostInitiateTransferResponse

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *  - 403: Transfer cannot be initiated
     *
     * @param loanId
     * @param postInitiateTransferRequest
     * @param command command (optional)
     * @return [PostInitiateTransferResponse]
     */
    @POST("v1/external-asset-owners/transfers/loans/{loanId}")
    suspend fun transferRequestWithLoanId(
        @Path("loanId") loanId: Long,
        @Body postInitiateTransferRequest: PostInitiateTransferRequest,
        @Query("command") command: String? = null,
    ): PostInitiateTransferResponse
}
