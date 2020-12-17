package org.techtown.lab06;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_file);
        TextView textView = findViewById(R.id.fileResult);
        File file = new File(getFilesDir(),"myfile.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuffer buffer = new StringBuffer();
            String line;
            while((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            textView.setText(buffer.toString());
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}