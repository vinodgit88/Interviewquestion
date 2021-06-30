package com.interviewquestion;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Disarium_number extends AppCompatActivity {
    TextView showprogram,output,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showprogram);
        showprogram = findViewById(R.id.showprogram);
        output = findViewById(R.id.output);
        description = findViewById(R.id.description);
        String programDescription="A number is said to be the Disarium number when the sum of its digit raised to \" +\n" +
                "                \"the power of their respective positions is equal to the number itself.\\n\" +\n" +
                "                \"For example, 175 is a Disarium number as follows\\n\" +\n" +
                "                \"1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175";
        String program= "\n\n\n    private void disarium_number() {\n" +
                "            int num = 175, sum = 0, rem = 0, n;\n" +
                "            int len = calculateLength(num);\n" +
                "            //Makes a copy of the original number num\n" +
                "            n = num;\n" +
                "            //Calculates the sum of digits powered with their respective position\n" +
                "            while(num > 0){\n" +
                "                rem = num%10;\n" +
                "                sum = sum + (int)Math.pow(rem,len);\n" +
                "                num = num/10;\n" +
                "                len--;\n" +
                "            }\n" +
                "            //Checks whether the sum is equal to the number itself\n" +
                "            if(sum == n){\n" +
                "                System.out.println(n + \" is a disarium number\");\n" +
                "                output.setText(\"OutPut Is: \"+n + \" is a disarium number\");\n" +
                "            }else{\n" +
                "                System.out.println(n + \" is not a disarium number\");\n" +
                "                output.setText(\"OutPut Is: \"+n + \" is not a disarium number\");\n" +
                "            }\n" +
                "    }\n" +
                "    //calculateLength() will count the digits present in a number\n" +
                "    public static int calculateLength(int n){\n" +
                "        int length = 0;\n" +
                "        while(n != 0){\n" +
                "            length = length + 1;\n" +
                "            n = n/10;\n" +
                "        }\n" +
                "        return length;\n" +
                "    }";
        description.setText(programDescription);
        showprogram.setText(program);
        disarium_number();
    }

    private void disarium_number() {
            int num = 175, sum = 0, rem = 0, n;
            int len = calculateLength(num);
            //Makes a copy of the original number num
            n = num;
            //Calculates the sum of digits powered with their respective position
            while(num > 0){
                rem = num%10;
                sum = sum + (int)Math.pow(rem,len);
                num = num/10;
                len--;
            }
            //Checks whether the sum is equal to the number itself
            if(sum == n){
                System.out.println(n + " is a disarium number");
                output.setText("OutPut Is: "+n + " is a disarium number");
            }else{
                System.out.println(n + " is not a disarium number");
                output.setText("OutPut Is: "+n + " is not a disarium number");
            }
    }
    //calculateLength() will count the digits present in a number
    public static int calculateLength(int n){
        int length = 0;
        while(n != 0){
            length = length + 1;
            n = n/10;
        }
        return length;
    }
}
