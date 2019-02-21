package com.example.ewew.wechat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<contactsHolder> {
    private List<contacts_recyle> contacts_recyles;
    private Context context;

    public ContactsAdapter(List<contacts_recyle> contacts_recyles, Context context) {
        this.contacts_recyles = contacts_recyles;
        this.context = context;
    }

    @NonNull
    @Override
    public contactsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.contacts_item, viewGroup, false);
        contactsHolder contactsHolder = new contactsHolder(view);
        return contactsHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull contactsHolder contactsHolder, int i) {
        contactsHolder.bindview(contacts_recyles.get(i));
    }

    @Override
    public int getItemCount() {
        return contacts_recyles.size();
    }
}
