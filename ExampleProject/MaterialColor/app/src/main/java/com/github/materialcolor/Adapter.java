package com.github.materialcolor;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;

public class Adapter extends BaseAdapter{

    Context context;
    int[] colors;

    public Adapter(Context context, int[] colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        View view;

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            view = new View(context);
            //view.setLayoutParams(new GridView.LayoutParams(85, 85));
            view.setLayoutParams(new GridView.LayoutParams(350, 280));
            //view.setPadding(8, 8, 8, 8);
        } else {
            view = convertView;
        }



        int color = (int) getItem(i);

        view.setBackgroundColor(color);

        return view;
    }



}
