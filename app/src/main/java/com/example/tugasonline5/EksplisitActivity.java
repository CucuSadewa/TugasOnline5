package com.example.tugasonline5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EksplisitActivity extends AppCompatActivity {
    public static String EXTRA_NIM = "extra_age";
    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_EMAIL = "extra_email";
    private TextView tvDataMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eksplisit);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String nim = getIntent().getStringExtra(EXTRA_NIM);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);
        tvDataMasuk = (TextView)findViewById(R.id.tv_data_masuk);
        String text = " Name : "+name+"\n Nim : "+nim+"\n E-mail : "+email;
        tvDataMasuk.setText(text);
    }
}
