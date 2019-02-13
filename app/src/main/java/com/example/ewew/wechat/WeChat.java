package com.example.ewew.wechat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class WeChat extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private Fragment chatsFragment;
    private Fragment contactsFragment;
    private Fragment discoverFragment;
    private Fragment meFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.chats_name:
                    fragmentManager.beginTransaction().replace(R.id.fragment_container,chatsFragment).commit();
                    return true;
                case R.id.Contacts_name:
                    fragmentManager.beginTransaction().replace(R.id.fragment_container,contactsFragment).commit();
                    return true;
                case R.id.Discover_name:
                    fragmentManager.beginTransaction().replace(R.id.fragment_container,discoverFragment).commit();
                    return true;
                case R.id.me_name:
                    fragmentManager.beginTransaction().replace(R.id.fragment_container,meFragment).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we_chat);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        /**
         * 初始化
         */
        fragmentManager = getSupportFragmentManager();
        // 多态之向上转型
        chatsFragment = new Chatsfragment();
        contactsFragment = new Contactsfragment();
        discoverFragment = new Discoverfragment();
        meFragment = new Mefragment();

        //将碎片添加到fragmentmanger中
        fragmentManager.beginTransaction().add(R.id.fragment_container,chatsFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container,contactsFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container,discoverFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container,meFragment).commit();
    }

}
