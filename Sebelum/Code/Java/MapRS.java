package com.example.tugasproyek;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.tugasproyek.databinding.ActivityMapRsBinding;

public class MapRS extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapRsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapRsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng rsUAD = new LatLng(-7.746944868905203, 110.42509674221938);
        mMap.addMarker(new MarkerOptions().position(rsUAD).title("Rumah Sakit UAD"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsUAD));

        LatLng rsHardjo = new LatLng(-7.797225952861162, 110.41016878706345);
        mMap.addMarker(new MarkerOptions().position(rsHardjo).title("Rumah Sakit Hardjolukito"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsHardjo));

        LatLng rsud = new LatLng(-7.82532978055654, 110.37811102481166);
        mMap.addMarker(new MarkerOptions().position(rsud).title("RSUD Yogyakarta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsud));

        LatLng rsBethesda = new LatLng(-7.783821416348647, 110.37764752260904);
        mMap.addMarker(new MarkerOptions().position(rsBethesda).title("Bethesda Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsBethesda));

        LatLng rsDrSoetarto = new LatLng(-7.785449758470596, 110.37683855173778);
        mMap.addMarker(new MarkerOptions().position(rsDrSoetarto).title("RSUD Yogyakarta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsDrSoetarto));

        LatLng rsHappyLand = new LatLng(-7.793768547600413, 110.39185986358723);
        mMap.addMarker(new MarkerOptions().position(rsHappyLand).title("Happyland Medical Centre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsHappyLand));

        LatLng rsHidayatullah = new LatLng(-7.815076411494535, 110.38763154298404);
        mMap.addMarker(new MarkerOptions().position(rsHidayatullah).title("RS Hidayatullah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsHidayatullah));

        LatLng rsMataDrYap = new LatLng(-7.780424932044028, 110.37510515550203);
        mMap.addMarker(new MarkerOptions().position(rsMataDrYap).title("RS Mata Dr Yap"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsMataDrYap));

        LatLng rsPantiRapih = new LatLng(-7.777039056084448, 110.37616378229524);
        mMap.addMarker(new MarkerOptions().position(rsPantiRapih).title("RS Panti Rapih"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsPantiRapih));

        LatLng rsDrSardjito = new LatLng(-7.768319926062229, 110.37354851525404);
        mMap.addMarker(new MarkerOptions().position(rsDrSardjito).title("RS Dr Sardjito"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsDrSardjito));

        LatLng rsJIH= new LatLng(-7.757070763862564, 110.40313799314336);
        mMap.addMarker(new MarkerOptions().position(rsJIH).title("Jogjakarta Islamic Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsJIH));

        LatLng rsPKU0 = new LatLng(-7.800496014608085, 110.36231079804088);
        mMap.addMarker(new MarkerOptions().position(rsPKU0).title("RS PKU Muhammadiyah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsPKU0));

        LatLng rsPKUG = new LatLng(-7.800496014608085, 110.36231079804088);
        mMap.addMarker(new MarkerOptions().position(rsPKUG).title("RS PKU Muhammadiyah Gamping"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsPKUG));

        LatLng rsRajawali = new LatLng(-7.8475006323210845, 110.41019853388892);
        mMap.addMarker(new MarkerOptions().position(rsRajawali).title("RS Rajawali Citra"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsRajawali));

        LatLng rsBethesdaL = new LatLng(-7.795697331593862, 110.37297081522378);
        mMap.addMarker(new MarkerOptions().position(rsBethesdaL).title("RS Bethesda Lempuyangan Wangi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rsBethesdaL));
    }
}