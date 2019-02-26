package com.example.ewew.wechat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Chatsfragment extends Fragment {
    private RecyclerView recyclerView;
    private ChatsAdapter chatsAdapter;
    private List<Chats_Recycle> chats_recycles;

    private ImageView imageView;
    private TextView textView_sign;
    private TextView textView_content;
    private TextView textView_time;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chats_fragment, container, false);
        recyclerView = view.findViewById(R.id.chats_recycleview);
        initData();
        chatsAdapter = new ChatsAdapter(chats_recycles, getContext());
        //设置recycleview的布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(chatsAdapter);

        //始化控件
        imageView = (ImageView)view.findViewById(R.id.chats_item_image);
        textView_sign = (TextView)view.findViewById(R.id.chats_item_sign);
        textView_content = (TextView)view.findViewById(R.id.chats_item_content);
        textView_time = (TextView)view.findViewById(R.id.chats_item_time);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Chatsfragment.this,"敬请期待",Toast.LENGTH_SHORT).show();
            }
        });
        textView_sign.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView_content.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        textView_time.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    public void initData() {
        chats_recycles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                chats_recycles.add(new Chats_Recycle(R.drawable.head_photo,
                        "王教授", "你是谁？", "8:30AM"));
            else
                chats_recycles.add(new Chats_Recycle(R.drawable.gay,
                        "gay", "我是你儿子", "3:10PM"));
        }
    }
}
