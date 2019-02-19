package com.example.marlonsodre.bolsa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import static com.example.marlonsodre.bolsa.MainActivity.mlista;
import static com.example.marlonsodre.bolsa.MainActivity.mLvwAcoes;

public class CadastroActivity extends AppCompatActivity {
    public static EditText mtxtNome, mtxtValor, mtxtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        mtxtNome = (EditText) findViewById(R.id.txtNome);
        mtxtValor = (EditText) findViewById(R.id.txtValor);
        mtxtData = (EditText) findViewById(R.id.txtData);
    }


    public void salvar (View view){
            String nome = mtxtNome.getText() .toString().trim();
            String data = mtxtData.getText() .toString().trim();
            String valor = mtxtValor.getText() .toString().trim();

            Acao acao = new Acao();
            acao.setNome(nome);
            acao.setData(data);
            acao.setValor(valor);

            mlista.add(acao);

            mLvwAcoes.setAdapter(new AcaoAdaptaer(getApplicationContext(), mlista));

            finish();
        }


}
