package com.example.challenge01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void regBtn(View view) {
        TextView fnameTxt = findViewById(R.id.fnameTxt);
        TextView lnameTxt = findViewById(R.id.lnameTxt);
        TextView emailTxt = findViewById(R.id.emailTxt);

        EditText edtTxtFname = findViewById(R.id.edtTxtFname);
        EditText edtTxtLname = findViewById(R.id.edtTxtLname);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        fnameTxt.setText(String.format("FirstName: %s", edtTxtFname.getText().toString()));
        lnameTxt.setText(String.format("LastName: %s", edtTxtLname.getText().toString()));
        emailTxt.setText(String.format("Email: %s", edtTxtEmail.getText().toString()));
    }
}