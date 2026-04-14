package com.ubermensch.ruangamanv10

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

sealed class LoginResult {
    object Success : LoginResult()
    data class Error(val message: String) : LoginResult()
}

class AuthViewModel : ViewModel() {

    private val _loginResult = MutableLiveData<LoginResult>()
    val loginResult: LiveData<LoginResult> = _loginResult

    fun login(email: String, pass: String) {
        // Simple logic for development/demo
        if (email.isNotEmpty() && pass.length >= 6) {
            _loginResult.value = LoginResult.Success
        } else {
            _loginResult.value = LoginResult.Error("Email atau Password salah!")
        }
    }
}
