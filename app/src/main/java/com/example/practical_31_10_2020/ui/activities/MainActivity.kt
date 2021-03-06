package com.example.practical_31_10_2020.ui.activities

import android.nfc.tech.MifareUltralight.PAGE_SIZE
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practical_31_10_2020.R
import com.example.practical_31_10_2020.data.api.ApiHelper
import com.example.practical_31_10_2020.data.api.ApiService
import com.example.practical_31_10_2020.data.api.RetrofitBuilder
import com.example.practical_31_10_2020.data.model.UserModel
import com.example.practical_31_10_2020.ui.adapter.UserAdapter
import com.example.practical_31_10_2020.ui.viewmodel.UserViewModel
import com.example.practical_31_10_2020.ui.viewmodel.ViewModelFactory
import com.example.practical_31_10_2020.utils.Status
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var isLoading: Boolean = false
    var isLastPage: Boolean = false
    var offset: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUI()
        setViewModel()
        setObserver()
    }

    var viewModel: UserViewModel? = null

    private fun setViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(
                ApiHelper(
                    RetrofitBuilder.getRetrofitInstance().create(ApiService::class.java)
                )
            )
        ).get(UserViewModel::class.java)
    }

    private fun setObserver() {

        viewModel?.setOffset(offset)
        viewModel?.userData?.observe(this, {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {
                        isLoading = false
                        rvUsers.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                            setData(it.data!!)

                    }
                    Status.ERROR -> {
                        isLoading = false
                        rvUsers.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    }
                    Status.LOADING -> {
                        isLoading = true
                        progressBar.visibility = View.VISIBLE
                    }
                }
            }
        })
    }

    var userAdapter: UserAdapter? = null
    private fun setUI() {
        userAdapter = UserAdapter(arrayListOf())
        rvUsers.adapter = userAdapter

        val recyclerViewOnScrollListener: RecyclerView.OnScrollListener =
            object : RecyclerView.OnScrollListener() {
                override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                    super.onScrollStateChanged(recyclerView, newState)
                }

                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    val visibleItemCount: Int = rvUsers.layoutManager!!.childCount
                    val totalItemCount: Int = rvUsers.layoutManager!!.itemCount
                    val firstVisibleItemPosition: Int =
                        (rvUsers.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()
                    if (!isLoading && !isLastPage) {
                        if (visibleItemCount + firstVisibleItemPosition >= totalItemCount && firstVisibleItemPosition >= 0 && totalItemCount >= PAGE_SIZE) {
                            offset += 5
                            viewModel?.setOffset(offset)
                        }
                    }
                }
            }

        rvUsers.addOnScrollListener(recyclerViewOnScrollListener)
    }

    private fun setData(userList: ArrayList<UserModel>) {
        userAdapter?.apply {
            list.addAll(userList)
            notifyDataSetChanged()
        }
    }
}