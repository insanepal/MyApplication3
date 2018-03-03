package com.example.pushpendrapal.myapplication;

import android.content.Intent;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
      Button but1;
      int qty=0;
      int qtyp=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butclick();

    }

    public void add(View view) {
        int nofopizza=qty;
        display(qty);
        displayPrice(nofopizza*5);

    }
    public void increment(View view) {
        qty++;
        display(qty);

    }
    public void decrement(View view) {
        display(qty);
        if (qty <= 0) {
            qty = 0;
        } else {
            qty--;
        }
    }
    public void addd(View view){
        int nofopepsi=qtyp;
        displaytwo(qtyp);
        displayPricetwo(nofopepsi*10);
    }
    public void incrementk(View view) {
        qtyp++;
        displaytwo(qtyp);
    }
    public void decrementk(View view) {
        displaytwo(qtyp);
        if (qtyp <= 0) {
            qtyp = 0;
        } else {
            qtyp--;
        }
    }
    public void addcart(View view){
        int z=0;
        z=qty*5+qtyp*10;
        dispalycart(z);

    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView4);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.textView8);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displaytwo(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.textView7);
        quantityTextView.setText("" + number);
    }
    private void displayPricetwo(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.textView11);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void dispalycart(int number){
        TextView cartTextView=(TextView)findViewById(R.id.textView13);
        cartTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void butclick(){
        but1=(Button)findViewById(R.id.button8);
        but1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent poop =new Intent(MainActivity.this,Endingpage.class);

                        startActivity(poop);
                    }

                });
    }
}
