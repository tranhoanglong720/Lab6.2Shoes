package com.example.lab62shoes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ApdapterShoes extends BaseAdapter {
    private int Layout;
    private Context context;
    private List<Shoes> listshoes;

    public ApdapterShoes(int layout, Context context, List<Shoes> listshoes) {
        Layout = layout;
        this.context = context;
        this.listshoes = listshoes;
    }



    @Override
    public int getCount() {
        if(listshoes.size()!=0 && !listshoes.isEmpty())
        {
            return  listshoes.size();
        }
        return  0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if(listshoes.size() !=0&& !listshoes.isEmpty())
        {
            view= LayoutInflater.from(parent.getContext()).inflate(Layout,parent,false);
        }
        TextView txtten=(TextView)view.findViewById(R.id.txtten);
        TextView txtgia=(TextView) view.findViewById(R.id.txtgia);
        ImageView imglogo=(ImageView) view.findViewById(R.id.imglogo);

        final Shoes s=listshoes.get(i);
        txtten.setText(s.getTen());
        txtgia.setText(s.getGia());
        imglogo.setImageResource(s.getId());

        return view;
    }
}
