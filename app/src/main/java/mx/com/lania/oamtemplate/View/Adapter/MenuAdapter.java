package mx.com.lania.oamtemplate.View.Adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import mx.com.lania.oamtemplate.R;

/**
 * Created by macbook on 12/02/18.
 */


public class MenuAdapter extends BaseAdapter {

    private Context context;
    private String[] titleItemMenu;
    private int[] iconItemMenu,cardColor;

    public MenuAdapter(Context context, String[] titleItemMenu, int[] iconItemMenu, int[] cardColor) {
        this.context = context;
        this.titleItemMenu = titleItemMenu;
        this.iconItemMenu = iconItemMenu;
        this.cardColor = cardColor;
    }

    @Override
    public int getCount() {
        return titleItemMenu.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null) {
            gridView = new View(context);

            gridView = inflater.inflate(R.layout.menu_item, null);
            CardView cardView = gridView.findViewById(R.id.menu_item);
            cardView.setCardBackgroundColor(ContextCompat.getColor(context,cardColor[position]));
            ImageView imageView = gridView.findViewById(R.id.menu_item_icon);
            TextView textView = gridView.findViewById(R.id.menu_item_title);
            imageView.setImageResource(iconItemMenu[position]);
            textView.setText(titleItemMenu[position]);
        } else
            gridView = convertView;

        return gridView;
    }
}