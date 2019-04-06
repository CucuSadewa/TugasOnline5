package com.example.tugasonline5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnImplisit, btnEksplisit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEksplisit = (Button)findViewById(R.id.btn_intent_eksplisit);
        btnImplisit = (Button)findViewById(R.id.btn_intent_implisit);
    }

    public void pindah(View view){
        switch (view.getId()){
            case R.id.btn_intent_implisit:
                Intent intentImplisit = new Intent(MainActivity.this, EksplisitActivity.class);
                intentImplisit.putExtra(EksplisitActivity.EXTRA_NIM, "20160801256");
                intentImplisit.putExtra(EksplisitActivity.EXTRA_NAME, "Cucu Suhendar");
                intentImplisit.putExtra(EksplisitActivity.EXTRA_EMAIL, "Suhendarcucu25@gmail.com");
                startActivity(intentImplisit);
                break;
            case R.id.btn_intent_eksplisit:
                String Alamat="Rancaiyuh";
                Intent mapsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: "+Alamat));
                startActivity(mapsIntent);
                break;
        }
    }
}
