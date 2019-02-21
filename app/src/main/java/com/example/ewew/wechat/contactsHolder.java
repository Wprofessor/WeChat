package com.example.ewew.wechat;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class contactsHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;
    public contactsHolder(@NonNull View itemView) {
        super(itemView);
        imageView  = itemView.findViewById(R.id.contacts_item_image);
        textView = itemView.findViewById(R.id.contacts_item_text);
    }

    public void bindview(contacts_recyle contacts_recyle){
        imageView.setImageResource(contacts_recyle.getImage());
        textView.setText(contacts_recyle.getText());
    }
}
