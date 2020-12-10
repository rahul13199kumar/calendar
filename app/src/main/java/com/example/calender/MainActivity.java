package com.example.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView yLabel =(TextView)findViewById(R.id.yLabel);
        TextView mLabel =(TextView)findViewById(R.id.mLabel);
        TextView dLabel =(TextView)findViewById(R.id.dLabel);
        TextView eLabel =(TextView)findViewById(R.id.eLabel);


        Calendar cal =Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMMM/d/E", Locale.US);
        String strDate = sdf.format(cal.getTime());


        String[] values = strDate.split("/",0);


       // for (int i = 0; i< values.length; i++){



           // Log.v("CHECK DATE" ,  values[i]);

      //  }

           yLabel.setText(values[0]);
     mLabel.setText(values[1]);
     dLabel.setText(values[2]);
     eLabel.setText(values[3]);


    }
}
