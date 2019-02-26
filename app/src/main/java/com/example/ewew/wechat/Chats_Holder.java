package com.example.ewew.wechat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Chats_Holder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView_sign;
    private TextView textView_content;
    private TextView textView_time;

    public Chats_Holder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.chats_item_image);
        textView_sign = itemView.findViewById(R.id.chats_item_sign);
        textView_content = itemView.findViewById(R.id.chats_item_content);
        textView_time = itemView.findViewById(R.id.chats_item_time);
    }

    //在Adapter中实现的方法
    public void bindView(Chats_Recycle chats_recycle){
        imageView.setImageResource(chats_recycle.getImage());
        textView_sign.setText(chats_recycle.getSign_text());
        textView_content.setText(chats_recycle.getContent_text());
        textView_time.setText(chats_recycle.getTime_text());
    }
}
