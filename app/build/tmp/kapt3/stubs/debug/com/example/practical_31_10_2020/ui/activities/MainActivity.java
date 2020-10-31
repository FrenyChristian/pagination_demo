package com.example.practical_31_10_2020.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J \u0010 \u001a\u00020\u001d2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$H\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001dH\u0002J\b\u0010\u001a\u001a\u00020\u001dH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\'"}, d2 = {"Lcom/example/practical_31_10_2020/ui/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "isLastPage", "", "()Z", "setLastPage", "(Z)V", "isLoading", "setLoading", "offset", "", "getOffset", "()I", "setOffset", "(I)V", "userAdapter", "Lcom/example/practical_31_10_2020/ui/adapter/UserAdapter;", "getUserAdapter", "()Lcom/example/practical_31_10_2020/ui/adapter/UserAdapter;", "setUserAdapter", "(Lcom/example/practical_31_10_2020/ui/adapter/UserAdapter;)V", "viewModel", "Lcom/example/practical_31_10_2020/ui/viewmodel/UserViewModel;", "getViewModel", "()Lcom/example/practical_31_10_2020/ui/viewmodel/UserViewModel;", "setViewModel", "(Lcom/example/practical_31_10_2020/ui/viewmodel/UserViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setData", "userList", "Ljava/util/ArrayList;", "Lcom/example/practical_31_10_2020/data/model/UserModel;", "Lkotlin/collections/ArrayList;", "setObserver", "setUI", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private int offset = 0;
    @org.jetbrains.annotations.Nullable()
    private com.example.practical_31_10_2020.ui.viewmodel.UserViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.example.practical_31_10_2020.ui.adapter.UserAdapter userAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final boolean isLastPage() {
        return false;
    }
    
    public final void setLastPage(boolean p0) {
    }
    
    public final int getOffset() {
        return 0;
    }
    
    public final void setOffset(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.practical_31_10_2020.ui.viewmodel.UserViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.example.practical_31_10_2020.ui.viewmodel.UserViewModel p0) {
    }
    
    private final void setViewModel() {
    }
    
    private final void setObserver() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.practical_31_10_2020.ui.adapter.UserAdapter getUserAdapter() {
        return null;
    }
    
    public final void setUserAdapter(@org.jetbrains.annotations.Nullable()
    com.example.practical_31_10_2020.ui.adapter.UserAdapter p0) {
    }
    
    private final void setUI() {
    }
    
    private final void setData(java.util.ArrayList<com.example.practical_31_10_2020.data.model.UserModel> userList) {
    }
    
    public MainActivity() {
        super();
    }
}