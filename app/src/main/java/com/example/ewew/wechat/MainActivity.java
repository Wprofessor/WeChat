package com.example.ewew.wechat;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button landing;
    private EditText enter_password;
    private TextView user_zhanghao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        landing = findViewById(R.id.landing);
        enter_password = findViewById(R.id.enter_password);
        user_zhanghao = findViewById(R.id.user_zhanghao);
        landing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d(user_zhanghao.getText()+"----".toString(),enter_password.getText().toString());
                if (judge()) {
                    Intent intent = new Intent(MainActivity.this, WeChat.class);
                    startActivity(intent);
                } else {
                    //toast控件用做提示效果
                    //context:环境
                    Toast.makeText(MainActivity.this, "密码输入错误，请重新输入", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean judge() {
        String str = "";
        str = enter_password.getText().toString();
        // == 比较的是两个字符串的地址
        if (str.equals(user_zhanghao.getText().toString())) {

            return true;
        } else
            return false;
    }
}
