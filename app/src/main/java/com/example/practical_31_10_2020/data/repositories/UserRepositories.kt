package com.example.practical_31_10_2020.data.repositories

import android.util.Log
import com.example.practical_31_10_2020.data.api.ApiHelper
import com.example.practical_31_10_2020.data.model.UserModel
import com.example.practical_31_10_2020.utils.Resource
import org.json.JSONObject

class UserRepositories(var apiHelper: ApiHelper) {
    suspend fun getUser(offset: Int, limit: String): Resource<ArrayList<UserModel>> {

        val response = apiHelper.getUsers(offset, limit)
        if (!response.isSuccessful) {
            Log.e("test", "${response.code()}")

        }
        val jsonObject = JSONObject(response.body()!!.string())
        if (jsonObject.getBoolean("status")) {
            val data = jsonObject.getJSONObject("data")
            val isLastData = !data.getBoolean("has_more")
            val users = data.getJSONArray("users")
            val userList = arrayListOf<UserModel>()
            for (i in 0 until users.length()) {
                val userObject = users.getJSONObject(i)
                val items = userObject.getJSONArray("items")
                val imageList = arrayListOf<String>()
                for (i in 0 until items.length()) {
                    imageList.add(items[i] as String)
                }
                userList.add(
                    UserModel(
                        userObject.getString("image"),
                        userObject.getString("name"),
                        imageList,
                        isLastData
                    )
                )
            }
            return Resource.success(userList)
        } else {
            return Resource.error(message = jsonObject.get("error_msg").toString(), data = null)
        }
    }
}




