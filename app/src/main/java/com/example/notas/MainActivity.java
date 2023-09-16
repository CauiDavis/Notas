package com.example.notas;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Aluno> Aluno1 = new ArrayList<>();
    private Button addButton;

    private ArrayAdapter<Aluno> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editName = findViewById(R.id.editNome);
        EditText editN1 =  findViewById(R.id.editN1);
        EditText editN2 =  findViewById(R.id.editN2);
        EditText editN3 =  findViewById(R.id.editN3);
        ListView listView = findViewById(R.id.listView);
        addButton = findViewById(R.id.addButton);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Aluno1);

        listView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editName.getText().toString();
                String n1 = editN1.getText().toString();
                String n2 = editN2.getText().toString();
                String n3 = editN3.getText().toString();


                if (!nome.isEmpty()) {
                    Aluno objeto = new Aluno(nome, n1, n2, n3);
                    Aluno1.add(objeto);
                    adapter.notifyDataSetChanged();
                    editName.setText("");
                    editN1.setText("");
                    editN2.setText("");
                    editN3.setText("");
                }
            }
        });
    }


}