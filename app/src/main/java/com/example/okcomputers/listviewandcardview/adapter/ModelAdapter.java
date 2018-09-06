package com.example.okcomputers.listviewandcardview.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.okcomputers.listviewandcardview.R;
import com.example.okcomputers.listviewandcardview.model.Model;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by OK Computers on 7/18/2018.
 */

public class ModelAdapter extends BaseAdapter {

   private Context context;
   private ArrayList<Model>models;

    public ModelAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int i) {
        return models.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
      if(convertView == null)
      {
          convertView = View.inflate(context, R.layout.list_items,null);
      }


        ImageView images = (ImageView)convertView.findViewById(R.id.movieImageView);
        TextView title =(TextView) convertView.findViewById(R.id.movienameTV);
        Model model = models.get(i);
        images.setImageResource(model.getMovieImage());
        title.setText(model.getMovieTitle());
        return convertView;
    }
}
