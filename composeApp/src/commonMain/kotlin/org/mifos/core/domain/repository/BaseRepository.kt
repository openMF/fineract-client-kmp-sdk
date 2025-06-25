/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.core.domain.repository

import org.mifos.core.common.Result

/**
 * Base repository interface that follows the Repository pattern.
 * This interface is kept minimal to follow ISP (Interface Segregation Principle).
 *
 * @param T The type of entity this repository handles
 * @param ID The type of the entity's identifier
 */
interface BaseRepository<T, ID> {
    /**
     * Retrieves an entity by its identifier
     */
    suspend fun getById(id: ID): Result<T>
}

/**
 * Extended repository interface for repositories that support listing operations
 */
interface ListableRepository<T, ID> : BaseRepository<T, ID> {
    /**
     * Retrieves all entities
     */
    suspend fun getAll(): Result<List<T>>
}

/**
 * Extended repository interface for repositories that support creation operations
 */
interface CreatableRepository<T, CreateRequest> {
    /**
     * Creates a new entity
     */
    suspend fun create(request: CreateRequest): Result<T>
}

/**
 * Extended repository interface for repositories that support update operations
 */
interface UpdatableRepository<T, ID, UpdateRequest> {
    /**
     * Updates an existing entity
     */
    suspend fun update(id: ID, request: UpdateRequest): Result<T>
}

/**
 * Extended repository interface for repositories that support delete operations
 */
interface DeletableRepository<ID> {
    /**
     * Deletes an entity by its identifier
     */
    suspend fun delete(id: ID): Result<Unit>
}

/**
 * Full CRUD repository interface that combines all operations
 * Use this only when you need all operations to follow ISP principle
 */
interface CrudRepository<T, ID, CreateRequest, UpdateRequest> :
    BaseRepository<T, ID>,
    ListableRepository<T, ID>,
    CreatableRepository<T, CreateRequest>,
    UpdatableRepository<T, ID, UpdateRequest>,
    DeletableRepository<ID>
