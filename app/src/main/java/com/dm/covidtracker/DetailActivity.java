package com.dm.covidtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    private TextView tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTodayDeaths,tvTotalDeaths,tvCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        positionCountry=intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of " +AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvCases=findViewById(R.id.tvCases);
        tvRecovered=findViewById(R.id.tvRecovered);
        tvCritical=findViewById(R.id.tvCritical);
        tvActive=findViewById(R.id.tvActive);
        tvTodayCases=findViewById(R.id.tvTodayCases);
        tvTodayDeaths=findViewById(R.id.tvTodayDeaths);
        tvTotalDeaths=findViewById(R.id.tvTotalDeaths);
        tvCountry=findViewById(R.id.tvCountry);

        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodaycases());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getTodaydeaths());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}