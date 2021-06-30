package com.interviewquestion;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TwistedPrimeNumber extends AppCompatActivity {
    TextView showprogram,output,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showprogram);
        showprogram = findViewById(R.id.showprogram);
        output = findViewById(R.id.output);
        description = findViewById(R.id.description);
        String programDescription="A number is called a twisted prime number if it is a prime number and reverse of this number is also a prime number.\\n\" +\n" +

                "                \"Examples: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79.\n ";
        String program= " private void twisted_prime_Numbers() {\n" +
                "        int n, reverse,sum=0 , flag;\n" +
                "        n = 43;\n" +
                "\n" +
                "        while(n!=0)\n" +
                "        {\n" +
                "            reverse = n%10;\n" +
                "            sum = sum*10 + reverse;\n" +
                "            n= n/10;\n" +
                "        }\n" +
                "\n" +
                "        flag = 0;\n" +
                "        for (int j = 2; j <= sum / 2; j++)\n" +
                "        {\n" +
                "            if ((sum % j) == 0)\n" +
                "            {\n" +
                "                flag = 1;\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "        if (flag == 0) {\n" +
                "            System.out.println(\"Twisted Prime\");\n" +
                "            output.setText(\"OutPut Is: \"+\"Twisted Prim.\");\n" +
                "        }else {\n" +
                "            System.out.println(\"Twisted Prime\");\n" +
                "            output.setText(\"OutPut Is: \"+\"Not Twisted Prime\");\n" +
                "        }\n" +
                "    }";
        description.setText(programDescription);
        showprogram.setText(program);
        twisted_prime_Numbers();
    }

    private void twisted_prime_Numbers() {
        int n, reverse,sum=0 , flag;
        n = 43;

        while(n!=0)
        {
            reverse = n%10;
            sum = sum*10 + reverse;
            n= n/10;
        }

        flag = 0;
        for (int j = 2; j <= sum / 2; j++)
        {
            if ((sum % j) == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Twisted Prime");
            output.setText("OutPut Is: "+"Twisted Prim.");
        }else {
            System.out.println("Twisted Prime");
            output.setText("OutPut Is: "+"Not Twisted Prime");
        }
    }
}
