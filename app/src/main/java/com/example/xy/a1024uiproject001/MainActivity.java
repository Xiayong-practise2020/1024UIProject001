package com.example.xy.a1024uiproject001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        final TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setTextSize(20);
        Button button = new Button(this);
        button.setText("刷新内容");
        button.setTextSize(20);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello,Android 炫酷应用实例！\n当前日期: " + new java.util.Date());
            }
        });
        linearLayout.addView(textView);
        linearLayout.addView(button);
    }
}