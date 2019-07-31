package com.example.activityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText et_secondActivity;
    private Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        et_secondActivity = findViewById(R.id.et_text_send_to_first_activity);
        btn_send = findViewById(R.id.btn_send_to_first_activity);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBackName();
            }
        });
    }
    private void sendBackName(){
        Intent intent = new Intent();
        intent.putExtra("result",et_secondActivity.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
