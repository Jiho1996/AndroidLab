package org.techtown.androidlab;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.techtown.lab01.R;

public class Lab01_4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab01_4);

        // Custom Font 적용
        TextView textView = (TextView) findViewById(R.id.fontView);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "xmas.ttf");
        textView.setTypeface(typeface);

        // CheckBox 이벤트 프로그램
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) buttonView.setText("is checked");
                else buttonView.setText("is unchecked");
            }
        });
    }
}