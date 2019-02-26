package com.example.ewew.wechat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ChatsAdapter extends RecyclerView.Adapter<Chats_Holder> {

    private List<Chats_Recycle> chats_recycles;
    private Context context;

    //构造器
    public ChatsAdapter(List<Chats_Recycle> chats_recycles, Context context) {
        this.chats_recycles = chats_recycles;
        this.context = context;
    }

    @NonNull
    @Override
    public Chats_Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.chats_item,viewGroup,false);
        Chats_Holder chats_holder = new Chats_Holder(view);
        return chats_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Chats_Holder chats_holder, int i) {
        chats_holder.bindView(chats_recycles.get(i));
    }

    @Override
    public int getItemCount() {
        return chats_recycles.size();
    }
}
