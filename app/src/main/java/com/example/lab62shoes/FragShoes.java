package com.example.lab62shoes;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragShoes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragShoes extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragShoes() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragShoes.
     */
    // TODO: Rename and change types and number of parameters
    public static FragShoes newInstance(String param1, String param2) {
        FragShoes fragment = new FragShoes();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    List<Shoes> listshoes;
    ListView lvwshoes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag_shoes, container, false);
        Context context=view.getContext();
        listshoes=new ArrayList<>();
        lvwshoes=(ListView) view.findViewById(R.id.listshoes);
        listshoes.add(new Shoes(R.drawable.shoes_rm_preview, "Platis Optical", "15"));
        listshoes.add(new Shoes(R.drawable.shoes_rm_preview_a, "Non-Platis", "19"));
        listshoes.add(new Shoes(R.drawable.shoes_rm_preview_b, "Optical fiber", "10"));
        listshoes.add(new Shoes(R.drawable.shoes_rm_purple, "Platis Optical", "15"));
        listshoes.add(new Shoes(R.drawable.shoes_rm_yellow, "Platis Optical", "15"));

        ApdapterShoes adapter=new ApdapterShoes(R.layout.itemshoes,context,listshoes);
        lvwshoes.setAdapter(adapter);
        return view;
    }
}