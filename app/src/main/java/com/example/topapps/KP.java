package com.example.topapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KP extends ListActivity {
    protected void onCreate (Bundle icicle) {

        super.onCreate(icicle);
        String[] listKP = new String[] {"Polresta Pekanbaru","Polsek Sukajadi","Polsek Payung Sekaki","Polsek Tampan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listKP));
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Polresta Pekanbaru"))
                a = new Intent(this,PolresPekanbaru.class);
                {

                }if (pilihan.equals("Polsek Sukajadi"))
                    a = new Intent(this, KPSukajadi.class);
                {

            }if (pilihan.equals("Polsek Payung Sekaki"))
                a = new Intent(this, PolsekPayungSekaki.class);
            {

            }if (pilihan.equals("Polsek Tampan"))
                a = new Intent(this, PolsekTampan.class);



            {

            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
