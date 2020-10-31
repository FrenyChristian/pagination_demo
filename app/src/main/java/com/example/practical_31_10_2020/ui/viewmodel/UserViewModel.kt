package com.example.practical_31_10_2020.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import com.example.practical_31_10_2020.data.repositories.UserRepositories
import com.example.practical_31_10_2020.utils.Resource
import kotlinx.coroutines.Dispatchers

class UserViewModel(private val repo: UserRepositories) : ViewModel() {

    private var _offset: MutableLiveData<Int> = MutableLiveData(0)

    fun setOffset(offset: Int){
        _offset.value = offset
    }
    val userData = _offset.switchMap {
        getUsers(_offset.value!!, "10")
    }

   private fun getUsers(offset: Int, limit: String) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit( repo.getUser(offset, limit))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}