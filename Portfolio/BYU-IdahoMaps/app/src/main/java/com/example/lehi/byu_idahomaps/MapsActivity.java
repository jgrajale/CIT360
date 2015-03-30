package com.example.lehi.byu_idahomaps;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.PopupMenu;
import android.view.MenuInflater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import android.app.Activity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends ActionBarActivity {

    // Locations for all buildings on campus.
    private final LatLng LOCATION_CAMPUS = new LatLng(43.815489, -111.783012);
    private final LatLng LOCATION_SMITH = new LatLng(43.819230, -111.781481);
    private final LatLng LOCATION_HART = new LatLng(43.819780, -111.785261);
    private final LatLng LOCATION_RICKS = new LatLng(43.815120, -111.781303);
    private final LatLng LOCATION_AUSTIN = new LatLng(43.816018, -111.784543);
    private final LatLng LOCATION_ICENTER = new LatLng(43.818782, -111.785176);
    private final LatLng LOCATION_BENSON = new LatLng(43.815569, -111.783255);
    private final LatLng LOCATION_CLARKE = new LatLng(43.820492, -111.781796);
    private final LatLng LOCATION_HEALTH = new LatLng(43.817017, -111.779275);
    private final LatLng LOCATION_HINCKLEY = new LatLng(43.816080, -111.779876);
    private final LatLng LOCATION_KIMBALL = new LatLng(43.817249, -111.781506);
    private final LatLng LOCATION_KIRKHAM = new LatLng(43.821336, -111.781657);
    private final LatLng LOCATION_MC = new LatLng(43.818619, -111.782611);
    private final LatLng LOCATION_MCKAY = new LatLng(43.819587, -111.783159);
    private final LatLng LOCATION_ROMNEY = new LatLng(43.820423, -111.783148);
    private final LatLng LOCATION_SNOW = new LatLng(43.821414, -111.783652);
    private final LatLng LOCATION_SPORI = new LatLng(43.821019, -111.782300);
    private final LatLng LOCATION_TAYLOR = new LatLng(43.817171, -111.782408);

    // Our map
    private GoogleMap map; // Might be null if Google Play services APK is not available.
    // Our marker object
    Marker marker;

    DrawerLayout mDrawerLayout;
    ExpandableListView mDrawerList;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    LinkedHashMap<String, List<String>> expandableListDetail;
    ActionBarDrawerToggle mDrawerToggle;
    String[] mDrawerListItems;

    //Creates the map, sets it to the campus location, and turns on your location
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        CameraUpdate start = CameraUpdateFactory.newLatLngZoom(LOCATION_CAMPUS, 15);
        map.moveCamera(start);
        map.setMyLocationEnabled(true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mDrawerListItems = getResources().getStringArray(R.array.drawer_list);
        mDrawerList = (ExpandableListView)findViewById(R.id.mainMenu);
        expandableListDetail = ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new ExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        mDrawerList.setAdapter(expandableListAdapter);

        mDrawerList.setOnGroupExpandListener(new OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mDrawerList.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();

            }
        });

        mDrawerList.setOnChildClickListener(new OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                CameraUpdate update;
                switch (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition)) {
                    case "Austin":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_AUSTIN, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_AUSTIN)
                                .title("Mark Austin")
                                .snippet("College of Physical Sciences & Engineering"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);

                        return true;
                    case "BYU-I Center":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_ICENTER, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_ICENTER)
                                .title("BYU-I Center"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Benson":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_BENSON, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_BENSON)
                                .title("Ezra Taft Benson")
                                .snippet("College of Agriculture and Life Sciences"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Clarke":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_CLARKE, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_CLARKE)
                                .title("John L. Clarke"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Hart":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_HART, 19);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_HART)
                                .title("John W. Hart"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Health Center":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_HEALTH, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_HEALTH)
                                .title("Student Health Center"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Hinckley":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_HINCKLEY, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_HINCKLEY)
                                .title("Gordan B. Hinckley")
                                .snippet("College of Education & Human Development"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Kimball":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_KIMBALL, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_KIMBALL)
                                .title("Spencer W. Kimball"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Kirkham":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_KIRKHAM, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_KIRKHAM)
                                .title("Oscar A. Kirkham"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Manwaring":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_MC, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_MC)
                                .title("Hyrum Manwaring"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "McKay":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_MCKAY, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_MCKAY)
                                .title("David O. McKay Library"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Ricks":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_RICKS, 19);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_RICKS)
                                .title("Thomas E. Ricks"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Romney":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_ROMNEY, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_ROMNEY)
                                .title("George S. Romney"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Smith":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_SMITH, 19);
                        map.animateCamera(update);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_SMITH)
                                .title("Joseph Fielding Smith")
                                .snippet("College of Business and Communication\n" +
                                        "College of Language & Letters"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        return true;

                    case "Snow":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_SNOW, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_SNOW)
                                .title("Eliza R. Snow"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Spori":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_SPORI, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_SPORI)
                                .title("Jacob Spori")
                                .snippet("College of Performing & Visual Arts"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;

                    case "Taylor":
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_TAYLOR, 18);
                        marker = map.addMarker(new MarkerOptions()
                                .position(LOCATION_TAYLOR)
                                .title("Taylor"));
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;


                    default:
                        if (marker != null) {
                            marker.remove();
                        }
                        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        update = CameraUpdateFactory.newLatLngZoom(LOCATION_CAMPUS, 15);
                        mDrawerLayout.closeDrawer(mDrawerList);
                        map.animateCamera(update);
                        return true;
                }

            }
        });


        mDrawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout,
                toolbar,
                R.string.drawer_open,
                R.string.drawer_close) {
            public void onDrawerClosed(View v) {
                super.onDrawerClosed(v);
                invalidateOptionsMenu();
                syncState();
            }

            public void onDrawerOpened(View v) {
                super.onDrawerOpened(v);
                invalidateOptionsMenu();
                syncState();
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("BYU-I Maps");
        mDrawerToggle.syncState();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
                    mDrawerLayout.closeDrawer(mDrawerList);
                } else {
                    mDrawerLayout.openDrawer(mDrawerList);
                }
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
    }
}




