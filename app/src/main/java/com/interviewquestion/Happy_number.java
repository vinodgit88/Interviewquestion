package com.interviewquestion;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Happy_number extends AppCompatActivity {
    TextView showprogram,output,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showprogram);
        showprogram = findViewById(R.id.showprogram);
        description = findViewById(R.id.description);
        output = findViewById(R.id.output);

        String programDescription="The happy number can be defined as a number which will yield 1 when it is replaced by the sum of the square of its digits repeatedly. \n" +
                "        If this process results in an endless cycle of numbers containing 4, then the number is called an unhappy number.\n" +
                "         For example, 32 is a happy number as the process yields 1 as follows\n"+
                "3^2 + 2^2 = 13\n" +
                "1^2 + 3^2 = 10\n" +
                "1^2 + 0^2 = 1\n\n\n";
        String program= "\n" +
                "    private void mHappy_number() {\n" +
                "        int num = 82;\n" +
                "        int result = num;\n" +
                "\n" +
                "        while(result != 1 && result != 4){\n" +
                "            result = isHappyNumber(result);\n" +
                "        }\n" +
                "\n" +
                "        //Happy number always ends with 1  \n" +
                "        if(result == 1){\n" +
                "            //Unhappy number ends in a cycle of repeating numbers which contains 4  \n" +
                "            System.out.println(num + \" is a happy number\");\n" +
                "            output.setText(\"OutPut Is: \"+num + \" is a happy number\");  \n" +
                "        } else if(result == 4){\n" +
                "            //isHappyNumber() will determine whether a number is happy or not\n" +
                "            System.out.println(num + \" is a happy number\");\n" +
                "            output.setText(\"OutPut Is: \"+num + \" is not a happy number\");  \n" +
                "        }\n" +
                "    }\n" +
                "   \n" +
                "    \n" +
                "    public static int isHappyNumber(int num){\n" +
                "        int rem = 0, sum = 0;\n" +
                "        //Calculates the sum of squares of digits\n" +
                "        while(num > 0){\n" +
                "            rem = num%10;\n" +
                "            sum = sum + (rem*rem);\n" +
                "            num = num/10;\n" +
                "        }\n" +
                "        return sum;\n" +
                "    }";
        description.setText(programDescription);
        showprogram.setText(program);
        mHappy_number();
    }

    private void mHappy_number() {
        int num = 82;
        int result = num;

        while(result != 1 && result != 4){
            result = isHappyNumber(result);
        }

        //Happy number always ends with 1
        if(result == 1){
            //Unhappy number ends in a cycle of repeating numbers which contains 4
            System.out.println(num + " is a happy number");
            output.setText("OutPut Is: "+num + " is a happy number");
        } else if(result == 4){
            //isHappyNumber() will determine whether a number is happy or not
            System.out.println(num + " is a happy number");
            output.setText("OutPut Is: "+num + " is not a happy number");
        }
    }


    public static int isHappyNumber(int num){
        int rem = 0, sum = 0;
        //Calculates the sum of squares of digits
        while(num > 0){
            rem = num%10;
            sum = sum + (rem*rem);
            num = num/10;
        }
        return sum;
    }
}
