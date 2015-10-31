package acm.utsa.campusrunner;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

/**
 * Created by John on 10/30/2015.
 */
public class Restaurant_Runner {

    ArrayList<Resturant_Data> points;

    Restaurant_Runner(){
        points = new ArrayList<Resturant_Data>();
    }

    public void add_all(){
        points.add(new Resturant_Data("Chick-Fil-A", new LatLng(29.582662, -98.619910), "JPL Food Court"));
        points.add(new Resturant_Data("Chili's Too", new LatLng(29.583490, -98.620910), "University Center"));
        points.add(new Resturant_Data("Subway", new LatLng(29.583076, -98.620401  ), "University Center"));
        points.add(new Resturant_Data("Subway", new LatLng( 29.584459 , -98.617660 ), "JPL Food Court"));
        points.add(new Resturant_Data("Papa John's", new LatLng(29.584660, -98.617734  ), "JPL Food Court"));
        points.add(new Resturant_Data("MooYah ", new LatLng( 29.583598, -98.620793 ), "University Center"));
        points.add(new Resturant_Data("Panda Express ", new LatLng(29.583650, -98.620682  ), "University Center"));
    }

    public ArrayList<MarkerOptions> get_all_marks(){
        ArrayList<MarkerOptions> opt = new ArrayList<MarkerOptions>();

        for(Resturant_Data res:points){
            opt.add(res.get_marker());
        }

        return opt;
    }

}
