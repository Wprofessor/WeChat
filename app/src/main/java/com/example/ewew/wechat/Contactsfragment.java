package com.example.ewew.wechat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Contactsfragment extends Fragment {
    private RecyclerView recyclerView;
    private ContactsAdapter contactsAdapter;
    private List<contacts_recyle>contacts_recyles ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contacts_fragment,container,false);
        recyclerView = view.findViewById(R.id.contacts_recycleview);

        initData();
        contactsAdapter = new ContactsAdapter(contacts_recyles,getContext());
        // 设置recyclerview的布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(contactsAdapter);

        return view;
    }

    public void initData(){
        contacts_recyles = new ArrayList<>();
        contacts_recyles.add(new contacts_recyle(R.drawable.ic_new_friends,"New Friends"));
        contacts_recyles.add(new contacts_recyle(R.drawable.ic_group_chats,"Group Chats"));
        contacts_recyles.add(new contacts_recyle(R.drawable.ic_tags,"Tags"));
        contacts_recyles.add(new contacts_recyle(R.drawable.ic_official_accounts,"Official Accounts"));
        for (int i = 0; i < 10; i++) {
            contacts_recyles.add(new contacts_recyle(R.drawable.head_photo,"王教授"));
        }
    }
}
