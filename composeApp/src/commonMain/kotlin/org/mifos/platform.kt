package org.mifos

import androidx.compose.runtime.Composable

@Composable
expect fun callApi(apiIdentifier : String) : String