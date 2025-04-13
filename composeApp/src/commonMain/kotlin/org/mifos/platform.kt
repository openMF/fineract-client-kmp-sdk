package org.mifos


expect class CallApi(){
     suspend fun getAuthApi() : String
     suspend fun getClient(): String
     suspend fun getSavingApi(): String
     suspend fun getCenterApi(): String
     suspend fun getLoanApi(): String
}