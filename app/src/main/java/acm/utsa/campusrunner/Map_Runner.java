package acm.utsa.campusrunner;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

public class Map_Runner extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map__runner);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng panda = new LatLng(29.582445, -98.621998);

        ArrayList<MarkerOptions> points = getIntent().getParcelableArrayListExtra("rr");
        for(MarkerOptions mo : points){
            mMap.addMarker(mo);
        }

        mMap.moveCamera(CameraUpdateFactory.zoomTo(15));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(panda));

        // Instantiates a new Polyline object and adds points to define a rectangle
        PolylineOptions rectOptions = new PolylineOptions()
                    .add(new LatLng(29.586910000000003, -98.61937))
                    .add(new LatLng(29.58695, -98.61926000000001))
                    .add(new LatLng(29.587010000000003, -98.6192))
                    .add(new LatLng(29.587080000000004, -98.61918000000001))
                    .add(new LatLng(29.587180000000004, -98.6192))
                    .add(new LatLng(29.58725, -98.61927000000001))
                    .add(new LatLng(29.587290000000003, -98.61939000000001))
                    .add(new LatLng(29.587280000000003, -98.61945000000001))
                    .add(new LatLng(29.58723, -98.61953000000001))
                    .add(new LatLng(29.587180000000004, -98.61957000000001))
                    .add(new LatLng(29.587170000000004, -98.61969))
                    .add(new LatLng(29.587190000000003, -98.61978))
                    .add(new LatLng(29.587360000000004, -98.62024000000001))
                    .add(new LatLng(29.587400000000002, -98.62035))
                    .add(new LatLng(29.587400000000002, -98.62042000000001))
                    .add(new LatLng(29.587460000000004, -98.62064000000001))
                    .add(new LatLng(29.587470000000003, -98.62076))
                    .add(new LatLng(29.587460000000004, -98.62123000000001))
                    .add(new LatLng(29.58743, -98.62144))
                    .add(new LatLng(29.58735, -98.62180000000001))
                    .add(new LatLng(29.58725, -98.62217000000001))
                    .add(new LatLng(29.587180000000004, -98.62236000000001))
                    .add(new LatLng(29.586630000000003, -98.62343000000001))
                    .add(new LatLng(29.586190000000002, -98.62432000000001))
                    .add(new LatLng(29.58611, -98.62459000000001))
                    .add(new LatLng(29.58603, -98.62508000000001))
                    .add(new LatLng(29.585970000000003, -98.62529))
                    .add(new LatLng(29.585810000000002, -98.62568))
                    .add(new LatLng(29.58575, -98.62599))
                    .add(new LatLng(29.585780000000003, -98.62660000000001))
                    .add(new LatLng(29.585820000000002, -98.62678000000001))
                    .add(new LatLng(29.585950000000004, -98.62705000000001))
                    .add(new LatLng(29.586140000000004, -98.62736000000001))
                    .add(new LatLng(29.586280000000002, -98.62766))
                    .add(new LatLng(29.58613, -98.62774))
                    .add(new LatLng(29.58602, -98.62784))
                    .add(new LatLng(29.58592, -98.62796))
                    .add(new LatLng(29.585790000000003, -98.62815))
                    .add(new LatLng(29.585620000000002, -98.62832))
                    .add(new LatLng(29.585430000000002, -98.62844000000001))
                    .add(new LatLng(29.585310000000003, -98.62848000000001))
                    .add(new LatLng(29.585140000000003, -98.6285))
                    .add(new LatLng(29.585030000000003, -98.62849000000001))
                    .add(new LatLng(29.58491, -98.62846))
                    .add(new LatLng(29.584840000000003, -98.62844000000001))
                    .add(new LatLng(29.58425, -98.62812000000001))
                    .add(new LatLng(29.583510000000004, -98.62769))
                    .add(new LatLng(29.583320000000004, -98.62755000000001))
                    .add(new LatLng(29.583050000000004, -98.62728000000001))
                    .add(new LatLng(29.582890000000003, -98.62714000000001))
                    .add(new LatLng(29.582660000000004, -98.62699))
                    .add(new LatLng(29.58247, -98.62691000000001))
                    .add(new LatLng(29.58227, -98.62689))
                    .add(new LatLng(29.582160000000002, -98.62691000000001))
                    .add(new LatLng(29.582040000000003, -98.62699))
                    .add(new LatLng(29.581920000000004, -98.62709000000001))
                    .add(new LatLng(29.581770000000002, -98.6272))
                    .add(new LatLng(29.581630000000004, -98.62726))
                    .add(new LatLng(29.58151, -98.62727000000001))
                    .add(new LatLng(29.58141, -98.62727000000001))
                    .add(new LatLng(29.581290000000003, -98.62724000000001))
                    .add(new LatLng(29.58029, -98.62657000000002))
                    .add(new LatLng(29.579860000000004, -98.62626))
                    .add(new LatLng(29.579710000000002, -98.62608))
                    .add(new LatLng(29.57963, -98.62592000000001))
                    .add(new LatLng(29.579570000000004, -98.62573))
                    .add(new LatLng(29.579520000000002, -98.62548000000001))
                    .add(new LatLng(29.579420000000002, -98.62526000000001))
                    .add(new LatLng(29.579340000000002, -98.62516000000001))
                    .add(new LatLng(29.57928, -98.62511))
                    .add(new LatLng(29.579210000000003, -98.62507000000001))
                    .add(new LatLng(29.57918, -98.62508000000001))
                    .add(new LatLng(29.57889, -98.62511))
                    .add(new LatLng(29.578870000000002, -98.62515))
                    .add(new LatLng(29.578830000000004, -98.62517000000001))
                    .add(new LatLng(29.578760000000003, -98.62545000000001))
                    .add(new LatLng(29.578750000000003, -98.62629000000001))
                    .add(new LatLng(29.578760000000003, -98.62752))
                    .add(new LatLng(29.578830000000004, -98.62798000000001))
                    .add(new LatLng(29.578830000000004, -98.6282))
                    .add(new LatLng(29.578840000000003, -98.62833))
                    .add(new LatLng(29.578740000000003, -98.6286));

                     Polyline polyline = mMap.addPolyline(rectOptions);

    }
}
