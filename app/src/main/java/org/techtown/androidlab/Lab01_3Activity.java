package org.techtown.androidlab;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lab01_3Activity extends AppCompatActivity implements View.OnClickListener {

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab01_3);
        // View 객체 획득

        trueBtn = (Button)findViewById(R.id.btn_visible_true);
        targetTextView = (TextView)findViewById(R.id.text_visible_target);
        falseBtn = (Button)findViewById(R.id.btn_visible_false);
        // Button 이벤트 등록
        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }

    // 버튼 이벤트 콜백함수
    @Override
    public void onClick(View view){
        if(view == trueBtn) {
            targetTextView.setVisibility(View.VISIBLE);
        } else if(view == falseBtn) {
            targetTextView.setVisibility(View.INVISIBLE);
        }
    }
}
