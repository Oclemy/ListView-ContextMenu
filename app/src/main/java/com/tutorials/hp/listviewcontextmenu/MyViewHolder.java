package com.tutorials.hp.listviewcontextmenu;

import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Oclemmy on 3/29/2016 for ProgrammingWizards Channel.
 */
public class MyViewHolder implements View.OnLongClickListener,View.OnCreateContextMenuListener {

    ImageView img;
    TextView nameTxt;
    LongClickListener longClickListener;

    public MyViewHolder(View v) {
        img= (ImageView) v.findViewById(R.id.movieImage);
        nameTxt= (TextView) v.findViewById(R.id.nameTxt);

        v.setOnLongClickListener(this);
        v.setOnCreateContextMenuListener(this);
    }

    public void setLongClickListener(LongClickListener lc)
    {
        this.longClickListener=lc;
    }

    @Override
    public boolean onLongClick(View v) {
        this.longClickListener.onItemLongClick();
        return false;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,0,0,"Share");
        menu.add(0,1,0,"Rate");
        menu.add(0,2,0,"Watch");
    }
}
