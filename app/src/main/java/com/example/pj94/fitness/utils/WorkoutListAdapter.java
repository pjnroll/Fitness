package com.example.pj94.fitness.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pj94.fitness.R;
import com.example.pj94.fitness.model.Scheda;

import java.util.ArrayList;

/**
 * Created by Pj94 on 20/12/2017.
 */

public class WorkoutListAdapter extends BaseAdapter {
    private final static String LOG_TAG = "WorkoutListAdapter";

    private TextView mTxtTitle;
    private TextView mTxtDesc;
    private Context mCtx;
    private ArrayList<Scheda> data;

    public WorkoutListAdapter(Context mCtx, ArrayList<Scheda> data) {
        this.mCtx = mCtx;
        this.data = new ArrayList<>(data);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 1;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        view = inflater.inflate(R.layout.item_layout, null);

        mTxtTitle = view.findViewById(R.id.txtTitle);
        mTxtDesc = view.findViewById(R.id.txtDesc);

        i++;

        mTxtTitle.setText(data.get(i).titolo);
        mTxtTitle.setText(data.get(i).desc);
        return view;
    }
}
