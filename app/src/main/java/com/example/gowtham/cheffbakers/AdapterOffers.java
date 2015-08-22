package com.example.gowtham.cheffbakers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by gowtham on 22-08-2015.
 */
public class AdapterOffers extends BaseAdapter {

    int image[];
    Context context;
    private LayoutInflater mLayoutInflater = null;

    public AdapterOffers(Context offers, int[] prgmImages) {

        context = offers;
        image = prgmImages;
        mLayoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        CompleteListViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater li = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = li.inflate(R.layout.row_img, null);
            viewHolder = new CompleteListViewHolder(v);
            v.setTag(viewHolder);
        } else {
            viewHolder = (CompleteListViewHolder) v.getTag();
        }
        viewHolder.imageView.setImageResource(image[position]);
        return v;
    }

    class CompleteListViewHolder {
        public ImageView imageView;

        public CompleteListViewHolder(View base) {
            imageView = (ImageView) base.findViewById(R.id.imoffer);
        }
    }
}
