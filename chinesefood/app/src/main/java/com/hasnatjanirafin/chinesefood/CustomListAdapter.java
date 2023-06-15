package com.hasnatjanirafin.chinesefood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;
    private final int[] imageId;

    public CustomListAdapter(Context context, String[] values, int[] imageId) {
        super(context, R.layout.list_item, values);
        this.context = context;
        this.values = values;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        TextView textView = rowView.findViewById(R.id.textView);
        ImageView imageView = rowView.findViewById(R.id.imageView);

        textView.setText(values[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;
    }
}
