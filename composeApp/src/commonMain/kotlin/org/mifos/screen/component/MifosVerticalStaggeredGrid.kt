/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.screen.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * It it adaptive grid layout which is show good UI on large screen tablet, desktop and etc.
 * @param maxColumns Columns displayed in large screen tablet, desktop and etc.
 * @param minColumns Columns displayed in small screen phone and etc.
 */
@Composable
fun MifosVerticalStaggeredGrid(
    modifier: Modifier = Modifier,
    maxColumns: Int? = null,
    minColumns: Int = 2,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(5.dp),
    verticalItemSpacing: Dp = 0.dp,
    maxHeight: Dp = 2000.dp,
    content: LazyStaggeredGridScope.() -> Unit,
) {
    var changeableColumn by remember { mutableStateOf(minColumns) }

    BoxWithConstraints(
        modifier = modifier.fillMaxSize().heightIn(max = maxHeight),
        contentAlignment = Alignment.TopCenter,
    ) {
        if (maxColumns != null) {
            changeableColumn = if (maxWidth > 600.dp) {
                maxColumns
            } else {
                minColumns
            }
        }

        LazyVerticalStaggeredGrid(
            horizontalArrangement = horizontalArrangement,
            verticalItemSpacing = verticalItemSpacing,
            columns = StaggeredGridCells.Fixed(changeableColumn),
            content = content,
        )
    }
}
