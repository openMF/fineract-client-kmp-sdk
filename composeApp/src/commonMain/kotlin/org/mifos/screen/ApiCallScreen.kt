package org.mifos.screen

import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel
import org.mifos.theme.indigoViolet
import org.mifos.theme.lightGray
import org.mifos.theme.mistGray
import org.mifos.viewmodel.ApiCallViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun apiCallScreen(
    apiCallViewModel: ApiCallViewModel = koinViewModel()
) {

    val apiParameters by apiCallViewModel.apiParameters.collectAsState()
    val listState = rememberLazyListState()


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Mifos Android Architecture",
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(indigoViolet)
            )
        },
        containerColor = Color.White
    ) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier.fillMaxSize()
                .padding(top = 125.dp)
        ) {
            LazyColumn(
                state = listState,
                flingBehavior = ScrollableDefaults.flingBehavior()
            ) {
                items(apiParameters) { item ->
                    ColumnDesign(
                        item.apiName,
                        item.apiDescription,
                        item.apiIdentifier,
                        apiCallViewModel
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun ColumnDesign(
    apiName: String,
    apiDescription: String,
    apiIdentifier: String,
    apiCallViewModel: ApiCallViewModel,
) {
    var showMessage by rememberSaveable(apiIdentifier) { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(9.8f)
            .padding(3.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RectangleShape,
        colors = CardDefaults.cardColors(Color.White)

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top,

                ) {
                Column(
                    modifier = Modifier.fillMaxWidth(.7f)
                        .padding(10.dp),
                ) {
                    Text(
                        modifier = Modifier.padding(start = 5.dp),
                        text = apiName,
                        fontWeight = FontWeight(700),
                        fontSize = 22.sp
                    )

                    Text(
                        modifier = Modifier.padding(start = 5.dp, top = 5.dp),
                        text = apiDescription,
                        color = Color(0xFFbdbfbe),
                        fontSize = 18.sp,
                        fontWeight = FontWeight(400),
                    )
                }
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.TopEnd
                ) {
                    Button(
                        modifier = Modifier.padding(end = 10.dp, top = 10.dp)
                            .size(width = 78.dp, height = 35.dp),

                        onClick = {
                            showMessage = true
                        },
                        colors = ButtonDefaults.buttonColors(mistGray),
                        shape = RectangleShape,
                        contentPadding = PaddingValues(start = 5.dp, end = 5.dp)
                    ) {
                        Text(
                            text = "TEST API",
                            fontWeight = FontWeight(700),
                            color = Color.Black,
                            fontSize = 15.sp
                        )
                    }
                }
            }
            Box(
                modifier = Modifier.fillMaxSize(.9f)
                    .padding(top = 5.dp, bottom = 5.dp),
                contentAlignment = Alignment.Center
            ) {
                if (showMessage) {
                   val responseData = when (apiIdentifier) {
                        "authApi" -> apiCallViewModel.getAuthResponse().collectAsState().value
                        "clientApi" -> apiCallViewModel.getClientResponse().collectAsState().value
                        "savingApi" -> apiCallViewModel.getSavingResponse().collectAsState().value
                        "centerApi" -> apiCallViewModel.getCenterResponse().collectAsState().value
                        "loanApi" -> apiCallViewModel.getLoanResponse().collectAsState().value
                        "surveyApi" -> apiCallViewModel.getSurveyResponse().collectAsState().value
                        "noteApi" -> apiCallViewModel.getNoteResponse().collectAsState().value
                        else -> "Invalid API Request"
                    }
                    responseBody(responseData)
                }
            }
        }
    }
}

@Composable
fun responseBody(responseData: String) {


    if (responseData == "Loading") {
        Box(
            modifier = Modifier.padding(bottom = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    } else {
        Text(
            modifier = Modifier.padding(top = 5.dp, bottom = 10.dp),
            text = responseData,
            color = lightGray,
            fontSize = 18.sp,
            fontWeight = FontWeight(400),
        )
    }
}

