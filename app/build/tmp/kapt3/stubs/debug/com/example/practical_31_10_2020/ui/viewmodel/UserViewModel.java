package com.example.practical_31_10_2020.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/example/practical_31_10_2020/ui/viewmodel/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/practical_31_10_2020/data/repositories/UserRepositories;", "(Lcom/example/practical_31_10_2020/data/repositories/UserRepositories;)V", "_offset", "Landroidx/lifecycle/MutableLiveData;", "", "userData", "Landroidx/lifecycle/LiveData;", "Lcom/example/practical_31_10_2020/utils/Resource;", "Ljava/util/ArrayList;", "Lcom/example/practical_31_10_2020/data/model/UserModel;", "getUserData", "()Landroidx/lifecycle/LiveData;", "getUsers", "offset", "limit", "", "setOffset", "", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _offset;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.practical_31_10_2020.utils.Resource<java.util.ArrayList<com.example.practical_31_10_2020.data.model.UserModel>>> userData = null;
    private final com.example.practical_31_10_2020.data.repositories.UserRepositories repo = null;
    
    public final void setOffset(int offset) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.practical_31_10_2020.utils.Resource<java.util.ArrayList<com.example.practical_31_10_2020.data.model.UserModel>>> getUserData() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<com.example.practical_31_10_2020.utils.Resource<java.util.ArrayList<com.example.practical_31_10_2020.data.model.UserModel>>> getUsers(int offset, java.lang.String limit) {
        return null;
    }
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.example.practical_31_10_2020.data.repositories.UserRepositories repo) {
        super();
    }
}