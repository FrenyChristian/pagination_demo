package com.example.practical_31_10_2020.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.practical_31_10_2020.data.api.ApiHelper
import com.example.practical_31_10_2020.data.repositories.UserRepositories

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            return UserViewModel(UserRepositories(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}