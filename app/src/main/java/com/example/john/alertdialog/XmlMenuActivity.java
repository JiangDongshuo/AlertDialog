package com.example.john.alertdialog;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class XmlMenuActivity extends AppCompatActivity {
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_menu);
        txt=(TextView) findViewById(R.id.txt);
        //registerForContextMenu(txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=new MenuInflater(this);
        inflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //System.out.println(item.getItemId());
        switch (item.getItemId()){
            case R.id.font_10:
                txt.setTextSize(10 * 2);
                break;
            case R.id.font_16:
                txt.setTextSize(16 * 2);
                break;
            case R.id.font_20:
                txt.setTextSize(20 * 2);
                break;
            case R.id.red:
                txt.setTextColor(Color.RED);
                Toast toast1=Toast.makeText(XmlMenuActivity.this,"选中了红色",Toast.LENGTH_LONG);
                toast1.show();
                break;
            case R.id.black:
                txt.setTextColor(Color.BLACK);
                Toast toast2=Toast.makeText(XmlMenuActivity.this,"选中了黑色",Toast.LENGTH_LONG);
                toast2.show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
