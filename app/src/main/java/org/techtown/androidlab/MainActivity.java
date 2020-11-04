package org.techtown.androidlab;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {    // 화면이 생성되기 전에 이 함수가 호출됨
        super.onCreate(savedInstanceState);

        LinearLayout linear = new LinearLayout(this);   // layout 이라고 붙은 것들은 자기 위에 다른 위젯을 올릴 수 있는 기능이 부가되어 있음

        Button bt = new Button(this);
        bt.setText("Button 1");
        linear.addView(bt);

        Button bt2 = new Button(this);
        bt2.setText("Button 2");
        linear.addView(bt2);

        setContentView(linear);
        // setContentView는 인자로 R.layout.activity_main 같은 정수 형을 받기도 하고
        // 이렇게 어떤 객체를 받을 수도 있음
    }
}
