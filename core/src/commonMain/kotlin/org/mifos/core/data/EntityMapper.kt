/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.core.data

/**
 * The generic interface for mapping data from api to specific domain,
 * create concrete class for specific models implementing this mapper
 * and use it while making the api request
 * @author Danish Jamal - http://github.com/danishjamal104/
 * @param Entity the generic class which belongs outside of this app
 * @param DomainModel the generic class which holds data for this specific app/domain
 */
interface EntityMapper<Entity, DomainModel> {
    fun mapFromEntity(entity: Entity): DomainModel
    fun mapToEntity(domainModel: DomainModel): Entity
    fun mapFromEntityList(entities: List<Entity>): List<DomainModel>
    fun mapToEntityList(domainModels: List<DomainModel>): List<Entity>
}
