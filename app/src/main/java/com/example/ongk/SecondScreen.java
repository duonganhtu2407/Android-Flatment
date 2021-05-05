package com.example.ongk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity implements View.OnClickListener {
    private Button btnadd;
    private TextView txtname;
    private TextView txtprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        String nameh=getIntent().getStringExtra("nameS2");
        String priceh=getIntent().getStringExtra("priceS2");

        txtname=findViewById(R.id.tvNameS2);
        txtprice=findViewById(R.id.tvPriceS2);


        txtname.setText(nameh);
        txtprice.setText("$"+priceh);

        btnadd=findViewById(R.id.btnAdd);
        btnadd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(this,ThirdScreen.class);

        intent.putExtra("nameS2",txtname.getText());
        intent.putExtra("priceS2",txtprice.getText());

        startActivity(intent);
    }
}