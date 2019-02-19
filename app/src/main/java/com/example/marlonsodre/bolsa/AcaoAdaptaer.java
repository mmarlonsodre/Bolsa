package com.example.marlonsodre.bolsa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AcaoAdaptaer extends ArrayAdapter<Acao> {

    private Context contexto;

    public AcaoAdaptaer(@NonNull Context context, List<Acao> acoes) {
        super(context, R.layout.list_view_item, acoes);
        this.contexto = context;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        Acao acao = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(contexto).inflate(R.layout.list_view_item, parent, false);
        }

        TextView txtItemNome = convertView.findViewById(R.id.txtItemNome);
        TextView txtItemData = convertView.findViewById(R.id.txtItemData);
        TextView txtItemValor = convertView.findViewById(R.id.txtItemValor);

        txtItemNome.setText(acao.getNome());
        txtItemData.setText(acao.getData());
        txtItemValor.setText(acao.getValor());

        return convertView;
    }
}
