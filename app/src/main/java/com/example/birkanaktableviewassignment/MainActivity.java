package com.example.birkanaktableviewassignment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

    private TableLayout table_layout;
    private ArrayList<TableRow> tableRowList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableRowList=new ArrayList<>();
        table_layout = (TableLayout)findViewById(R.id.table_layout);
    }

    public void add_melkor(View view) {
        if (tableRowList.size()>=2){
            AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();
            dialog1.setTitle("This is a Duo Team!!!");
            dialog1.setMessage("You cannot have more than 2 gods in your team. Please remove and then add again if you want that god in your team!");
            dialog1.setButton(AlertDialog.BUTTON_NEUTRAL, "Yes I'll remove a god.",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            dialog1.show();
        }
        else {
            TableRow tableRow;
            tableRow = new TableRow(this);
            ImageView im = new ImageView(this);
            im.setImageDrawable(getResources().getDrawable(R.drawable.melkor));
            tableRow.addView(im,233,233);
            TextView text = new TextView(this);
            text.setText("You have picked Melkor, the God of Corruption!");
            tableRow.addView(text,1);
            table_layout.addView(tableRow);
            tableRowList.add(tableRow);
        }

    }

    public void add_mandos(View view) {
        if (tableRowList.size()>=2){
            AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();
            dialog1.setTitle("This is a Duo Team!!!");
            dialog1.setMessage("You cannot have more than 2 gods in your team. Please remove and then add again if you want that god in your team!");
            dialog1.setButton(AlertDialog.BUTTON_NEUTRAL, "Yes I'll remove a god.",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            dialog1.show();
        }
        else {
            TableRow tableRow;
            tableRow = new TableRow(this);
            ImageView im = new ImageView(this);
            im.setImageDrawable(getResources().getDrawable(R.drawable.mandos));
            tableRow.addView(im,233,233);
            TextView text = new TextView(this);
            text.setText("You have picked Mandos, the God of the Dead!");
            tableRow.addView(text,1);
            table_layout.addView(tableRow);
            tableRowList.add(tableRow);
        }

    }

    public void add_ulmo(View view) {
        if (tableRowList.size()>=2){
            AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();
            dialog1.setTitle("This is a Duo Team!!!");
            dialog1.setMessage("You cannot have more than 2 gods in your team. Please remove and then add again if you want that god in your team!");
            dialog1.setButton(AlertDialog.BUTTON_NEUTRAL, "Yes I'll remove a god.",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            dialog1.show();
        }
        else {
            TableRow tableRow;
            tableRow = new TableRow(this);
            ImageView im = new ImageView(this);
            im.setImageDrawable(getResources().getDrawable(R.drawable.ulmo));
            tableRow.addView(im,233,233);
            TextView text = new TextView(this);
            text.setText("You have picked Ulmo, the God of Seas!");
            tableRow.addView(text,1);
            table_layout.addView(tableRow);
            tableRowList.add(tableRow);
        }

    }

    public void add_tulkas(View view) {
        if (tableRowList.size()>=2){
            AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();
            dialog1.setTitle("This is a Duo Team!!!");
            dialog1.setMessage("You cannot have more than 2 gods in your team. Please remove and then add again if you want that god in your team!");
            dialog1.setButton(AlertDialog.BUTTON_NEUTRAL, "Yes I'll remove a god.",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            dialog1.show();
        }
        else {
            TableRow tableRow;
            tableRow = new TableRow(this);
            ImageView im = new ImageView(this);
            im.setImageDrawable(getResources().getDrawable(R.drawable.tulkas));
            tableRow.addView(im,233,233);
            TextView text = new TextView(this);
            text.setText("You have picked Tulkas, the God of Strength!");
            tableRow.addView(text,1);
            table_layout.addView(tableRow);
            tableRowList.add(tableRow);
        }

    }

    public void remove_button(View view) {
        if(tableRowList.size()==0){
            AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();
            dialog1.setTitle("You can't remove a god from your team if you didn't add any!");
            dialog1.setMessage("I know what you're doing. You're trying to break my program! I won't let you!");
            dialog1.setButton(AlertDialog.BUTTON_NEUTRAL, "Haha you got me...",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            dialog1.show();
        }
        else{
            TableRow row = tableRowList.remove(tableRowList.size()-1);
            table_layout.removeView(row);
        }

    }
}