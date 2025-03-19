package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    //edittext eText;
    //password ePassword;
    //phone ePhone;
    //button eButton;
    //textveiw eTextView;

    private EditText eText;
    private EditText ePassword;
    private EditText ePhone;
    private Button eButton;
    private TextView eTextView;
    private TextView ePasswordView;
    private TextView ePhoneView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        eText = (EditText) findViewById(R.id.edittext);
        ePassword = (EditText) findViewById(R.id.password);
        ePhone = (EditText) findViewById(R.id.phone);
        eButton = (Button) findViewById(R.id.button);
        eTextView = (TextView) findViewById(R.id.textView);
        ePasswordView = (TextView) findViewById(R.id.passwordView);
        ePhoneView = (TextView) findViewById(R.id.PhoneView);

    }

    public void onClicked(View view) {
        String str = eText.getText().toString();
        eTextView.setText("아이디: "+ str);

        String password = ePassword.getText().toString();
        ePasswordView.setText("패스워드: "+password);

        String phone = ePhone.getText().toString();
        ePhoneView.setText("전화 번호: "+phone);

    }
}
