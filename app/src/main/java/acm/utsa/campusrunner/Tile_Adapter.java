package acm.utsa.campusrunner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by John on 10/27/2015.
 */
public class Tile_Adapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater inflater;

    private Integer[] thumb_arr = {
            R.drawable.buildings, R.drawable.restaurant, R.drawable.buses, R.drawable.parking,
    };

    private String[] title_arr = {
            "Buildings", "Restaurants", "Buses", "Parking",
    };

    public Tile_Adapter(Context c) {
        mContext = c;
        inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return thumb_arr.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View vi;

        if (convertView == null) {

            vi = inflater.inflate(R.layout.tile_runner, null);

            ImageView thumb = (ImageView)vi.findViewById(R.id.tile_picture);
            TextView  title = (TextView)vi.findViewById(R.id.tile_title);

            thumb.setAdjustViewBounds(false);
            thumb.setScaleType(ImageView.ScaleType.FIT_XY);
            thumb.setPadding(8, 8, 8, 8);
            thumb.setImageResource(thumb_arr[position]);

            title.setText(title_arr[position]);

        } else {
            vi = convertView;
        }

        return vi;
    }


}