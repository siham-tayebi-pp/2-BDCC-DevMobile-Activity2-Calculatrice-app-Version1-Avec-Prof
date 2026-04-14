package com.example.a2_bdcc_devmobile_activity2_calculatrice_app_version1_avec_prof;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText txtNumber=findViewById(R.id.idTxtNumber);
        TextView txtRes=findViewById(R.id.idTxtRes);
        Button btnCompute=findViewById(R.id.idBtnCompute);
        ListView lst=findViewById(R.id.idListRes);
        List<String> data=new ArrayList<>();
        //val par defaut du list View
        String[] valuesDef=getResources().getStringArray(R.array.calculs_default);

//        ArrayAdapter<String > AA= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        ArrayAdapter<String > AA= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,valuesDef);
        lst.setAdapter(AA);
        int i=0;//compteur de ligne

        // Faire le calcul une fois le boutton clique
        btnCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialiser un nouveau adaptateur
                ArrayAdapter<String > AA2= new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1 , data);

                Double n=Double.parseDouble(txtNumber.getText().toString());
                Double res= n*10;
                txtRes.setText(String.valueOf(res));
                data.add("amount"+ i+1 +" "+ n +" ===> "+res);
                txtNumber.setText("");
                lst.setAdapter(AA2);


            }
        });
        // DM : faite par moi
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String amount_clicked=parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Amount clicque c: "+amount_clicked,Toast.LENGTH_SHORT).show();
            }
        });



    }
}