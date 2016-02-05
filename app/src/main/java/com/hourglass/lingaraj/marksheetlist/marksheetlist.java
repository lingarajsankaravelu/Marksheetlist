package com.hourglass.lingaraj.marksheetlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class marksheetlist extends AppCompatActivity {

    Spinner className,section,overAllOrSubject;
    ArrayAdapter<String> classSpinnerAdapter,sectionSpinnerAdapter,overAllOrSubjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marksheetlist);
        className = (Spinner) findViewById(R.id.class_spinner);
        section = (Spinner) findViewById(R.id.section_spinner);
        overAllOrSubject = (Spinner) findViewById(R.id.type_repor_spinner);
        setSpinnerData();

    }

    private void setSpinnerData()
    {
        try
        {
            classSpinnerAdapter = new ArrayAdapter<String>(marksheetlist.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.classname));
            classSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            className.setAdapter(classSpinnerAdapter);
        }
        catch (Exception e)
        {
            Log.e("classSpinnerreportsheet", e.toString());
            e.printStackTrace();
        }

        try {
            sectionSpinnerAdapter = new ArrayAdapter<String>(marksheetlist.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.section));
            sectionSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            section.setAdapter(sectionSpinnerAdapter);
        }
        catch (Exception e)
        {
            Log.e("classSpinnerMsheet", e.toString());
            e.printStackTrace();
        }
        try
        {
             overAllOrSubjectAdapter= new ArrayAdapter<String>(marksheetlist.this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.reporttype));
            overAllOrSubjectAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            overAllOrSubject.setAdapter(overAllOrSubjectAdapter);
          }
        catch (Exception e)
        {
            Log.e("classSpinnerMsheet", e.toString());
            e.printStackTrace();
        }







    }
}
