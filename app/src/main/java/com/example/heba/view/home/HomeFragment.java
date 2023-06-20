package com.example.heba.view.home;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.heba.R;
import com.example.heba.controller.AppController;
import com.example.heba.databinding.FragmentHomeBinding;
import com.example.heba.model.pojo.DateRoot;
import com.example.heba.model.pojo.Datum;
import com.example.heba.model.pojo.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class HomeFragment extends Fragment implements PrayerTimeCallBack {
    FragmentHomeBinding binding;
    String currentDate;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View homeFragment = inflater.inflate(R.layout.fragment_home, container, false);
        binding = FragmentHomeBinding.bind(homeFragment);
        return binding.getRoot();

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Datum datum=new Datum();
        if (datum.getMeta()!=null) {
            int lat = (int) datum.getMeta().getLatitude();

            int longitude1 = (int) datum.getMeta().getLongitude();


            AppController appController = new AppController(HomeFragment.this);
            appController.getPrayerTime(lat, longitude1);
            //getCurrentDateAndTime
            DateFormat currentTime = new SimpleDateFormat("hh:mm aa");
            String formattedTime = currentTime.format(new Date()).toString();
            currentDate = new SimpleDateFormat("dd-MM-YYYY", Locale.getDefault()).format(new Date());
            //getCurrentLocattion
            Geocoder geocoder = new Geocoder(getActivity(), Locale.getDefault());

            try {
                List<Address> addresses = geocoder.getFromLocation(lat, longitude1, 1);
                if (addresses != null && addresses.size() > 0) {
                    Address address = addresses.get(0);
                    String location = address.getAddressLine(0);

                    binding.location.setText(location);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        binding.directionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_homeFragment_to_directionFragment);
            }
        });
    }

    @Override
    public void getTime(DateRoot dateRoot) {
        binding.dateResponse.setText(currentDate);
        Datum myData = new Datum();
        for (Datum item : dateRoot.getData()) {
            if (item.getDate().getGregorian().getDate().equalsIgnoreCase(currentDate)) {
                myData = item;
                break;
            }
        }
        System.out.println("dataaaaa" + myData.getDate().getGregorian().getDate());
        binding.fajrTime.setText(myData.getTimings().getFajr());
        binding.sunriseTime.setText(myData.getTimings().getSunrise());
        binding.duhrTime.setText(myData.getTimings().getDhuhr());
        binding.asrTime.setText(myData.getTimings().getAsr());
        binding.maghribTime.setText(myData.getTimings().getMaghrib());
        binding.ishaTime.setText(myData.getTimings().getIsha());
    }
}