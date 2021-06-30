package com.interviewquestion;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Abundant_number extends AppCompatActivity {
    TextView showprogram,output,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showprogram);
        showprogram = findViewById(R.id.showprogram);
        output = findViewById(R.id.output);
        description = findViewById(R.id.description);
        String programDescription="The abundant number can be called as an excessive number and defined as the " +
                "number for which the sum of its proper divisors is greater than the number itself.\\n\" +\n" +
                "                \"A first abundant number is the integer 12 having the sum (16) of its proper divisors (1, 2, 3, 4, 6) which is greater than itself (12).\\n\" +\n" +
                "                \"Examples: 12, 18, 20, 24, 30, 36\n ";
        String program= "private void mabundant_number() {\n" +
                "        int n =12;\n" +
                "        Abundant_number  a = new Abundant_number();\n" +
                "        if(a.checkAbundant(n))\n" +
                "        {\n" +
                "            System.out.println(\"The number is Abundant.\");\n" +
                "            output.setText(\"OutPut Is: \"+\"The number is Abundant.\");\n" +
                "        }\n" +
                "        else\n" +
                "        {\n" +
                "            System.out.println(\"The number is not Abundant.\");\n" +
                "            output.setText(\"OutPut Is: \"+\"The number is not Abundant.\");\n" +
                "        }\n" +
                "    }\n" +
                "    public int getSum(int n)\n" +
                "    {\n" +
                "        int sum = 0;\n" +
                "        for (int i=1; i<=Math.sqrt(n); i++)\n" +
                "        {\n" +
                "            if (n%i==0)\n" +
                "            {\n" +
                "                if (n/i == i)\n" +
                "                    sum = sum + i;\n" +
                "                else\n" +
                "                {\n" +
                "                    sum = sum + i;\n" +
                "                    sum = sum + (n / i);\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        sum = sum - n;\n" +
                "        return sum;\n" +
                "    }\n" +
                "    \n" +
                "    public  boolean checkAbundant(int n)\n" +
                "    {\n" +
                "        return (getSum(n) > n);\n" +
                "    }";
        description.setText(programDescription);
        showprogram.setText(program);
        mabundant_number();
    }

    private void mabundant_number() {
        int n =12;
        Abundant_number  a = new Abundant_number();
        if(a.checkAbundant(n))
        {
            System.out.println("The number is Abundant.");
            output.setText("OutPut Is: "+"The number is Abundant.");
        }
        else
        {
            System.out.println("The number is not Abundant.");
            output.setText("OutPut Is: "+"The number is not Abundant.");
        }
    }
    public int getSum(int n)
    {
        int sum = 0;
        double inh=  Math.sqrt(n);
        System.out.println("The number inh."+inh);
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i)
                    sum = sum + i;
                else
                {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }
        sum = sum - n;
        return sum;
    }

    public  boolean checkAbundant(int n)
    {
        return (getSum(n) > n);
    }
}
