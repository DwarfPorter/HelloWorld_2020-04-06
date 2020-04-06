package ru.geekbrains;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.text1);
        String txt = text.getText().toString();
        text.setText(txt + "!!");

        Button btn = findViewById(R.id.button);
    }
}
