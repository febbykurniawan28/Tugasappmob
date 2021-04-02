package com.example.topapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class school extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRSM = new String[] {"SMP Darma Yudha","SD Muhammadiyah 01",
                "SMA Cendana","SMAN 15"};
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
            if (pilihan.equals("SMP Darma Yudha"))
                a = new Intent(this,SmpDY.class);
            {

            }if (pilihan.equals("SD Muhammadiyah 01"))
                a = new Intent(this, SdMdyh.class);
            {

            } if (pilihan.equals("SMA Cendana"))
                a = new Intent(this, SmaCendana.class);
            {

            }if (pilihan.equals("SMAN 15"))
                a = new Intent(this, Sman15.class);
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
