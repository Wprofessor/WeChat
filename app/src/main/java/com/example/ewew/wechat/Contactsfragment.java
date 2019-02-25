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
    private List<contacts_recyle>contacts_recyles = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contacts_fragment,container,false);
        recyclerView = view.findViewById(R.id.contacts_recycleview);


        contactsAdapter = new ContactsAdapter(initData(contacts_recyles),getContext());
        // 设置recyclerview的布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(contactsAdapter);

        return view;
    }

    public List<contacts_recyle> initData(List<contacts_recyle> contacts_recyles){
        contacts_recyles.add(new contacts_recyle(R.drawable.ic_new_friends,"New Friends"));
        contacts_recyles.add(new contacts_recyle(R.drawable.ic_group_chats,"Group Chats"));
        contacts_recyles.add(new contacts_recyle(R.drawable.ic_tags,"Tags"));
        contacts_recyles.add(new contacts_recyle(R.drawable.ic_official_accounts,"Official Accounts"));
        return contacts_recyles;
    }
}
