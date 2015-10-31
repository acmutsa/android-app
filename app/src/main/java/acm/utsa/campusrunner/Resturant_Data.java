package acm.utsa.campusrunner;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by John on 10/30/2015.
 */
public class Resturant_Data {

    private String resturant_name       = "";
    private LatLng resturant_loc        = null;
    private String resturant_building   = "";
    private MarkerOptions mo            = null;

    Resturant_Data(String name, LatLng loc, String building){
        resturant_name = name;
        resturant_loc = loc;
        resturant_building = building;
        mo = new MarkerOptions().position(loc).title(name).snippet(building);
    }

    public MarkerOptions get_marker(){
        return mo;
    }
}
