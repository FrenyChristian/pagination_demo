package com.example.practical_31_10_2020.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/practical_31_10_2020/ui/adapter/UserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/practical_31_10_2020/ui/adapter/UserAdapter$MyViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/example/practical_31_10_2020/data/model/UserModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getList", "()Ljava/util/ArrayList;", "setList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class UserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.practical_31_10_2020.ui.adapter.UserAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.practical_31_10_2020.data.model.UserModel> list;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.practical_31_10_2020.ui.adapter.UserAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.practical_31_10_2020.ui.adapter.UserAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.practical_31_10_2020.data.model.UserModel> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.practical_31_10_2020.data.model.UserModel> p0) {
    }
    
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.practical_31_10_2020.data.model.UserModel> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/practical_31_10_2020/ui/adapter/UserAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/practical_31_10_2020/ui/adapter/UserAdapter;Landroid/view/View;)V", "imgUser", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImgUser", "()Landroid/widget/ImageView;", "rvImages", "Landroidx/recyclerview/widget/RecyclerView;", "getRvImages", "()Landroidx/recyclerview/widget/RecyclerView;", "txtUserName", "Landroid/widget/TextView;", "getTxtUserName", "()Landroid/widget/TextView;", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imgUser = null;
        private final android.widget.TextView txtUserName = null;
        private final androidx.recyclerview.widget.RecyclerView rvImages = null;
        
        public final android.widget.ImageView getImgUser() {
            return null;
        }
        
        public final android.widget.TextView getTxtUserName() {
            return null;
        }
        
        public final androidx.recyclerview.widget.RecyclerView getRvImages() {
            return null;
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}