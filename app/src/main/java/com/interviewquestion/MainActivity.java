package com.interviewquestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView swap_two_varriavle=findViewById(R.id.swap_two_varriavle);
        TextView disarium_number=findViewById(R.id.disarium_number);
        TextView happy_number=findViewById(R.id.happy_number);
        TextView abundant_number=findViewById(R.id.abundant_number);
        TextView prime_numberupto100=findViewById(R.id.prime_numberupto100);
        TextView twisted_prime_number=findViewById(R.id.twisted_prime_number);
        TextView  new_question=findViewById(R.id.new_question);
        twisted_prime_number.setOnClickListener(this);
        prime_numberupto100.setOnClickListener(this);
        abundant_number.setOnClickListener(this);
        happy_number.setOnClickListener(this);
        swap_two_varriavle.setOnClickListener(this);
        disarium_number.setOnClickListener(this);
        new_question.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.swap_two_varriavle:
                Intent intent=new Intent(MainActivity.this,SwapTwoVarriableWIthoutUsingThird.class);
                startActivity(intent);
                break;
            case R.id.disarium_number:
                Intent disarium_number=new Intent(MainActivity.this,Disarium_number.class);
                startActivity(disarium_number);
                break;
            case R.id.happy_number:
                Intent happy_number=new Intent(MainActivity.this,Happy_number.class);
                startActivity(happy_number);
                break;
            case R.id.abundant_number:
                Intent abundant_number=new Intent(MainActivity.this,Abundant_number.class);
                startActivity(abundant_number);
                break;
            case R.id.prime_numberupto100:
                Intent prime_numberupto100=new Intent(MainActivity.this,PrimeNumberUpto100.class);
                startActivity(prime_numberupto100);
                break;
            case R.id.twisted_prime_number:
                Intent twisted_prime_number=new Intent(MainActivity.this,TwistedPrimeNumber.class);
                startActivity(twisted_prime_number);
                break;
            case R.id.new_question:
//                Intent twisted_prime_number=new Intent(MainActivity.this,TwistedPrimeNumber.class);
//                startActivity(twisted_prime_number);
                break;

        }
    }
}