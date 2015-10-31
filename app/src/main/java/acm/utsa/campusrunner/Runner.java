package acm.utsa.campusrunner;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


public class Runner extends AppCompatActivity {



    /**
     * This is basically the main method of the app, it starts everything
     * @param savedInstanceState
     *          we'll get to that later, when we want to handle the lifecycle better
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final SharedPreferences settings_map = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        Restaurant_Runner rr = new Restaurant_Runner();
        final ArrayList<MarkerOptions> to_display = new ArrayList<MarkerOptions>();
        setContentView(R.layout.runner);
        //This stub creates the toolbar in the runner(THe main layout)
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.canShowOverflowMenu();
        setSupportActionBar(toolbar);

        rr.add_all();
        to_display.addAll(rr.get_all_marks());


        /*
        This creates the floating action button that toggles the map, when pressed this
        will show the map with hopefully the last map used(Buses, parking, restaurants, etc)
        TODO:used savedInstanceState to keep previous map data
        */
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.map_toggle);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maps_with_marks(Map_Runner.class, to_display);
            }
        });

        /*
            This is a little tricky, This send our tile_runner layout to the grid layout.
            It creates different instances of each tile_runner and populates a 4x4 grid
         */
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new Tile_Adapter(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(Runner.this, "" + position,
                        Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        ;
                        break;
                    case 1:
                        ;
                        break;
                    case 2:
                        ;
                        break;
                    case 3:
                        ;
                        break;
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_runner, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*
        Handle action bar item clicks here. The action bar will
        automatically handle clicks on the Home/Up button, so long
        as you specify a parent activity in AndroidManifest.xml.
        */
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            goto_activity(Settings_Runner.class);
        }

        return super.onOptionsItemSelected(item);
    }

    private void goto_activity(Class next){
        Intent to_go = new Intent(this, next);
        startActivity(to_go);
    }

    private void maps_with_marks(Class next, ArrayList marks){
        Intent to_go = new Intent(this, next);
        to_go.putExtra("rr", marks);
        startActivity(to_go);
    }
}
