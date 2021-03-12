package com.example.birkanaktableviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView tulkas;
    ImageView ulmo;
    ImageView mandos;
    ImageView melkor;

    private TableLayout table_layout;
    private ArrayList<TableRow> tableRowList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableRowList=new ArrayList<>();
        table_layout = (TableLayout)findViewById(R.id.table_layout);

        tulkas=(ImageView)findViewById(R.id.imageView1);
        ulmo=(ImageView)findViewById(R.id.imageView2);
        mandos=(ImageView)findViewById(R.id.imageView3);
        melkor=(ImageView)findViewById(R.id.imageView4);
    }

    public void add_melkor(View view) {
        TableRow tableRow;
        tableRow = new TableRow(this);
        ImageView im = new ImageView(this);
        im.setImageDrawable(getResources().getDrawable(R.drawable.melkor));
        tableRow.addView(im,127,136);
        TextView text = new TextView(this);
        text.setText("You have picked Melkor, the God of Corruption!");
        tableRow.addView(text,1);
        table_layout.addView(tableRow);
        tableRowList.add(tableRow);
    }

    public void add_mandos(View view) {
        TableRow tableRow;
        tableRow = new TableRow(this);
        ImageView im = new ImageView(this);
        im.setImageDrawable(getResources().getDrawable(R.drawable.mandos));
        tableRow.addView(im,127,136);
        TextView text = new TextView(this);
        text.setText("You have picked Mandos, the God of the Dead!");
        tableRow.addView(text,1);
        table_layout.addView(tableRow);
        tableRowList.add(tableRow);
    }

    public void add_ulmo(View view) {
        TableRow tableRow;
        tableRow = new TableRow(this);
        ImageView im = new ImageView(this);
        im.setImageDrawable(getResources().getDrawable(R.drawable.ulmo));
        tableRow.addView(im,127,136);
        TextView text = new TextView(this);
        text.setText("You have picked Ulmo, the God of Seas!");
        tableRow.addView(text,1);
        table_layout.addView(tableRow);
        tableRowList.add(tableRow);
    }

    public void add_tulkas(View view) {
        TableRow tableRow;
        tableRow = new TableRow(this);
        ImageView im = new ImageView(this);
        im.setImageDrawable(getResources().getDrawable(R.drawable.tulkas));
        tableRow.addView(im,127,136);
        TextView text = new TextView(this);
        text.setText("You have picked Tulkas, the God of Strength!");
        tableRow.addView(text,1);
        table_layout.addView(tableRow);
        tableRowList.add(tableRow);
    }

    public void remove_button(View view) {
    }
}