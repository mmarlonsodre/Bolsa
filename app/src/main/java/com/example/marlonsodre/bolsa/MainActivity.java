package com.example.marlonsodre.bolsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static  ListView mLvwAcoes;
    public static List<Acao> mlista = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLvwAcoes = findViewById(R.id.list);

    }


    public void novaAcao (View view){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
}
