package com.example.amitrawat.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.*;
import android.os.*;
import android.content.*;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.*;
import android.widget.Spinner.*;



public class SubActivity extends Activity implements OnItemSelectedListener
{
    Spinner sp;
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        String[] sites=new String[]{"Alt News","IndiaToday","NDTV India","APB News","FirstPost","TimesOfIndia"};
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,sites);
        sp=(Spinner)findViewById(R.id.simpleSpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);
    }

    public void LogOut(View v)
    {
        it=new Intent(this,MainActivity.class);
        startActivity(it);
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id)
    {
        if(position==0)
        {
            it=new Intent(SubActivity.this,AltnewsActivity.class);
            startActivity(it);
        }
        if(position==1)
        {
            it=new Intent(SubActivity.this,IndiatodayActivity.class);
            startActivity(it);
        }
        if(position==2)
        {
            it=new Intent(SubActivity.this,NdtvActivity.class);
            startActivity(it);
        }
        if(position==3)
        {
            it=new Intent(SubActivity.this,AbpActivity.class);
            startActivity(it);
        }
        if(position==4)
        {
            it=new Intent(SubActivity.this,FirstpostActivity.class);
            startActivity(it);
        }
        if(position==5)
        {
            it=new Intent(SubActivity.this,ToiActivity.class);
            startActivity(it);
        }

    }

    public void onNothingSelected(AdapterView<?> parent){

    }


}
