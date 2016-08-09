package com.example.davidjacobo.automaintenance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setOnClickEventsForCardViews();
    }

    private void setOnClickEventsForCardViews() {

        CardView cardviewHeaderMaintenance;
        CardView cardviewHeaderAlerts;
        CardView cardviewHeaderSettings;

        cardviewHeaderMaintenance = (CardView)findViewById(R.id.cardview_maintenanceheader);

        cardviewHeaderMaintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MaintenanceDashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
