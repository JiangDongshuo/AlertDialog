package com.example.john.alertdialog;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void simple(View source){
        LinearLayout loginForm=(LinearLayout)getLayoutInflater().inflate(R.layout.login,null) ;
        AlertDialog.Builder builder=new AlertDialog.Builder(this).setTitle("android app");
        builder.setView(loginForm).setPositiveButton("登陆",null).setNegativeButton("取消",null).create().show();
    }
    public void goXml_menu(View source){
        Intent intent=new Intent(MainActivity.this,XmlMenuActivity.class);
        startActivity(intent);
    }
    public void goAction_mode(View source){
        Intent intent=new Intent(MainActivity.this,ActionModeActivity.class);
        startActivity(intent);
    }
}
