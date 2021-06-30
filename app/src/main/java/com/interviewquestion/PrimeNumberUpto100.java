package com.interviewquestion;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PrimeNumberUpto100 extends AppCompatActivity {
    TextView showprogram,output,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showprogram);
        showprogram = findViewById(R.id.showprogram);
        output = findViewById(R.id.output);
        description = findViewById(R.id.description);
        String programDescription="Prime numbers are the natural numbers that can be divided by their self or by 1 without any remainder.\\n\" +\n" +

                "                \"For example: 2, 3, 5, 7, 11, 13, 17 etc.\n ";
        String program= "private void prime_Numbers() {\n" +
                "        int ct=0,n=0,i=1,j=1;\n" +
                "        while(n<25)\n" +
                "        {\n" +
                "            j=1;\n" +
                "            ct=0;\n" +
                "            while(j<=i)\n" +
                "            {\n" +
                "                if(i%j==0)\n" +
                "                    ct++;\n" +
                "                j++;\n" +
                "            }\n" +
                "            if(ct==2)\n" +
                "            {\n" +
                "                System.out.printf(\"%d \",i);\n" +
                "                output.setText(\"OutPut Is: \"+\"%d \"+i);\n" +
                "                n++;\n" +
                "            }\n" +
                "            i++;\n" +
                "        }";
        description.setText(programDescription);
        showprogram.setText(program);
        prime_Numbers();
    }

    private void prime_Numbers() {
        int ct=0,n=0,i=1,j=1;
        StringBuilder stringBuilder=new StringBuilder();
        while(n<25)
        {
            j=1;
            ct=0;
            while(j<=i)
            {
                if(i%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                System.out.printf("%d ",i);
                stringBuilder.append(i+" ,");
                n++;
            }
            i++;
        }
        output.setText("OutPut Is: "+"%d "+stringBuilder);
    }

}
