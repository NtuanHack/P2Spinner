package com.example.jhon.p2spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private Spinner spName,spName2;
    private Button btn2;
    private String[] germanFeminie ={"Karin","Ingridi","Helga","Renate","Elke","Ursula","Erika","Christa","Gisela","Monika"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spName = (Spinner) findViewById(R.id.sp_name);
        btn2 = (Button) findViewById(R.id.btn_check2);
        spName2 = (Spinner) findViewById(R.id.sp_name2);
        findViewById(R.id.bt_check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Selected "+ spName.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, germanFeminie);
        spName2.setAdapter(adapter);
        spName2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected " + adapter.getItem(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Selected "+ spName2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
