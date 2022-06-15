package com.example.appm7recuperacio;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.appm7recuperacio.Adapter.Adapter10day;
import com.example.appm7recuperacio.Adapter.AdapterToday;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerViewDay;
    private RecyclerView recyclerViewWeek;
    City Barcelona;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //-----------------------SET LAYOUT----------------------------------
        // Inflate the layout for this fragment
        setContentView(R.layout.activity_main);

        //--------------------DECLARACIÓ VARIABLES---------------------------

        Barcelona = new City("Barcelona", "0º", "sunny", "60%", "Lorem Ipsum dolor Sit amet", new ArrayList<Weather>(), new ArrayList<Weather>());
        Barcelona.today_prediction.add(new Weather("Now", "snow", "80%", "0º", ""));
        Barcelona.today_prediction.add(new Weather("10PM", "snow", "70%", "-3º", ""));
        Barcelona.today_prediction.add(new Weather("11PM", "snow", "30%", "2º", ""));
        Barcelona.today_prediction.add(new Weather("12AM", "cloud", "", "0º", ""));
        Barcelona.today_prediction.add(new Weather("1AM", "cloud", "", "4º", ""));
        Barcelona.today_prediction.add(new Weather("2AM", "cloud", "", "4º", ""));
        Barcelona.today_prediction.add(new Weather("3AM", "cloud", "", "10º", ""));

        Barcelona.tenday_prediction.add(new Weather("Today", "snow", "60%", "0º", "5º"));
        Barcelona.tenday_prediction.add(new Weather("Tue", "snow", "60%", "0º", "5º"));
        Barcelona.tenday_prediction.add(new Weather("Wed", "snow", "60%", "-1º", "5º"));
        Barcelona.tenday_prediction.add(new Weather("Thu", "snow", "60%", "-3º", "13º"));
        Barcelona.tenday_prediction.add(new Weather("Fri", "snow", "60%", "2º", "5º"));
        Barcelona.tenday_prediction.add(new Weather("Sat", "cloud", "", "10º", "15º"));
        Barcelona.tenday_prediction.add(new Weather("Sun", "cloud", "", "-1º", "12º"));



        TextView textMain = findViewById(R.id.txtMain);
        textMain.setText(Barcelona.getMain());
        final ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);

        if (textMain.equals("sunny")) {
            constraintLayout.setBackgroundResource(R.drawable.sunny);
        } else if (textMain.equals("snow")) {
            constraintLayout.setBackgroundResource(R.drawable.snow);
        }else if (textMain.equals("cloud")) {
            constraintLayout.setBackgroundResource(R.drawable.cloud);
        }else if (textMain.equals("fog")) {
            constraintLayout.setBackgroundResource(R.drawable.fog);
        }
        //-------------------------------------------------------------------
        // Create the RecyclerView
        recyclerViewDay = findViewById(R.id.dayRecyclerView);
        AdapterToday adapterDay = new AdapterToday(Barcelona.getToday_prediction());
        recyclerViewDay.setAdapter(adapterDay);
        recyclerViewDay.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewWeek = findViewById(R.id.weekRecyclerView);
        Adapter10day adapterWeek = new Adapter10day(Barcelona.getTenday_prediction());
        recyclerViewWeek.setAdapter(adapterWeek);
        recyclerViewWeek.setLayoutManager(new LinearLayoutManager(this));


    }
}