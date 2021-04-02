package com.example.topapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SP extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRSM = new String[] {"Hypermart","Giant",
                "Lotte Mart","Indo Grosir"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRSM));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Hypermart"))
                a = new Intent(this,Hypermart.class);
            {

            }if (pilihan.equals("Giant"))
                a = new Intent(this, Giant.class);
            {

            } if (pilihan.equals("Lotte Mart"))
                a = new Intent(this, LotteMart.class);
            {

            }if (pilihan.equals("Indo Grosir"))
                a = new Intent(this, IndoGrosir.class);
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
