package com.Jihen_Nawres.bonjournom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView textV;
    EditText Etext;
     Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textV = findViewById(R.id.txt);
        Etext= findViewById(R.id.E_nom);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=getResources().getString(R.string.bnj)+" "+Etext.getText()+ "!";
                textV.setText(msg);
            }
        });

    }
}
