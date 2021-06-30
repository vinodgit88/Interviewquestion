package com.interviewquestion;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SwapTwoVarriableWIthoutUsingThird extends AppCompatActivity {
    TextView showprogram,output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showprogram);
        showprogram = findViewById(R.id.showprogram);
        output = findViewById(R.id.output);
        String program=" private void swaptwovarriablewithoutusingTthird() {\n" +
                "        /*Define variables*/\n" +
                "        int x = 8;\n" +
                "        int y =7;\n" +
                "        System.out.println(\"before swapping numbers: \"+x +\" \"+ y);\n" +
                "        /*Swapping*/\n" +
                "        x = x + y;\n" +
                "        y = x - y;\n" +
                "        x = x - y;\n" +
                "        System.out.println(\"After swapping: \"+x +\"  \" + y);\n" +
                "\n" +
                "        output.setText(\"OutPut Is: \"+x+\"and\"+y);\n" +
                "    };";
        showprogram.setText(program);
       swaptwovarriablewithoutusingTthird();
    }

    private void swaptwovarriablewithoutusingTthird() {
        /*Define variables*/
        int x = 8;
        int y =7;
        System.out.println("before swapping numbers: "+x +" "+ y);
        /*Swapping*/
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: "+x +"  " + y);

        output.setText("OutPut Is: "+x+"and"+y);
    }
}
