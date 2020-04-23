package com.example.pizziepizza;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fDB = (Button)findViewById(R.id.flashDeal);
        Button cSB = (Button)findViewById(R.id.comboSet);
        Button pMB = (Button)findViewById(R.id.pizzaMenu);
        Button oB = (Button)findViewById(R.id.others);

        fDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Home.this,FlashDeal.class);
                startActivity(int1);
            }
        });

        cSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Home.this,FlashDeal.class);
                startActivity(int2);
            }
        });

        pMB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Home.this,FlashDeal.class);
                startActivity(int3);
            }
        });

        oB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Home.this,FlashDeal.class);
                startActivity(int4);
            }
        });
    }

}
