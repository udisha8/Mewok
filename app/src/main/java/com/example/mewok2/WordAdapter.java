package com.example.mewok2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> wo) {
        super(context, 0, wo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }
        Word word = getItem(position);

        TextView mewokText = listItemView.findViewById(R.id.mewok_word);
        mewokText.setText(word.getMewokWord());

        TextView englishText = listItemView.findViewById(R.id.english_word);
        englishText.setText(word.getEngWord());

        ImageView imageView = listItemView.findViewById(R.id.icon_image);
        if (word.hasImage()) {
            imageView.setImageResource(word.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else
            imageView.setVisibility(View.GONE);


        return listItemView;


    }
}
