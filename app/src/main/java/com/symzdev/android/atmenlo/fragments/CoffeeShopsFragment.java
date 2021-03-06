package com.symzdev.android.atmenlo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.symzdev.android.atmenlo.R;
import com.symzdev.android.atmenlo.adapters.PlaceAdapter;
import com.symzdev.android.atmenlo.models.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoffeeShopsFragment extends Fragment {
    public static ArrayList<Place> coffeeShops;
    public CoffeeShopsFragment() {
        // Create the ArrayList for the coffee shops
        coffeeShops = new ArrayList<>();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the list
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create the ArrayList for the coffee shops
        ArrayList<Place> coffeeShops = new ArrayList<>();

        // Add the coffee shops to the ArrayList
        coffeeShops.add(new Place(getString(R.string.C1_name_CBorrone), getString(R.string.C1_address_CBorrone),
                getString(R.string.C1_desc_CBorrone), R.drawable.c1_borrone_final, getString(R.string.C1_site_CBorrone),
                getString(R.string.C1_location_CBorrone)));
        coffeeShops.add(new Place(getString(R.string.C2_name_Jasons), getString(R.string.C2_address_Jasons),
                getString(R.string.C2_desc_Jasons), R.drawable.c2_jasons_final, getString(R.string.C2_site_Jasons),
                getString(R.string.C2_location_Jasons)));
        coffeeShops.add(new Place(getString(R.string.C3_name_Coupa), getString(R.string.C3_address_Coupa),
                getString(R.string.C3_desc_Coupa), R.drawable.c3_coupa_final, getString(R.string.C3_site_Coupa),
                getString(R.string.C3_location_Coupa)));
        coffeeShops.add(new Place(getString(R.string.C4_name_MColette), getString(R.string.C4_address_MColette),
                getString(R.string.C4_desc_MColette), R.drawable.c4_collete_final, getString(R.string.C4_site_MColette),
                getString(R.string.C4_location_MColette)));
        coffeeShops.add(new Place(getString(R.string.C5_name_AnnsCoffee), getString(R.string.C5_address_AnnsCoffee),
                getString(R.string.C5_desc_AnnsCoffee), R.drawable.c5_anns_final, getString(R.string.C5_site_AnnsCoffee),
                getString(R.string.C5_location_AnnsCoffee)));
        coffeeShops.add(new Place(getString(R.string.C6_name_PBaguette), getString(R.string.C6_address_PBaguette),
                getString(R.string.C6_desc_PBaguette), R.drawable.c6_parisbaguette_final, getString(R.string.C6_site_PBaguette),
                getString(R.string.C6_location_PBaguette)));
        coffeeShops.add(new Place(getString(R.string.C7_name_BlueGarden), getString(R.string.C7_address_BlueGarden),
                getString(R.string.C7_desc_BlueGarden), R.drawable.c7_bluegarden_final, getString(R.string.C7_site_BlueGarden),
                getString(R.string.C7_location_BlueGarden)));
        coffeeShops.add(new Place(getString(R.string.C8_name_BlueBottle), getString(R.string.C8_address_BlueBottle),
                getString(R.string.C8_desc_BlueBottle), R.drawable.c8_bluebottle_final, getString(R.string.C8_site_BlueBottle),
                getString(R.string.C8_location_BlueBottle)));
        coffeeShops.add(new Place(getString(R.string.C9_name_Tootsies), getString(R.string.C9_address_Tootsies),
                getString(R.string.C9_desc_Tootsies), R.drawable.c9_tootsies_final, getString(R.string.C9_site_Tootsies),
                getString(R.string.C9_location_Tootsies)));
        coffeeShops.add(new Place(getString(R.string.C10_name_Joanies), getString(R.string.C10_address_Joanies),
                getString(R.string.C10_desc_Joanies), R.drawable.c10_joanies_final, getString(R.string.C10_site_Joanies),
                getString(R.string.C10_location_Joanies)));


        // Create a new adapter that takes the list of coffee shops as input
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), coffeeShops);

        // Find a reference to the {@link ListView} in the layout
        ListView coffeeShopListView = (ListView) rootView.findViewById(R.id.place_list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        coffeeShopListView.setAdapter(adapter);

        // Return the fragment rootView
        return rootView;
    }

}