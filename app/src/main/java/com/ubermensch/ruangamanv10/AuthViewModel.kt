package com.ubermensch.ruangamanv10

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

sealed class Result {
    object Success : Result()
    data class Error(val message: String) : Result()
}

class AuthViewModel : ViewModel() {

    private val _loginResult = MutableLiveData<Result>()
    val loginResult: LiveData<Result> = _loginResult

    fun login(email: String, pass: String) {
        if (email.isNotEmpty() && pass.length >= 6) {
            _loginResult.value = Result.Success
        } else {
            _loginResult.value = Result.Error("Email atau Password salah!")
        }
    }
}