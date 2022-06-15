package com.example.appm7recuperacio;

import java.util.ArrayList;

public class City {

    String name;
    String temp;
    String main;
    String humidity;
    String description;
    ArrayList<Weather> today_prediction;
    ArrayList<Weather> tenday_prediction;

    public City(String name, String temp, String main, String humidity, String description, ArrayList<Weather> today_prediction, ArrayList<Weather> tenday_prediction) {
        this.name = name;
        this.temp = temp;
        this.main = main;
        this.humidity = humidity;
        this.description = description;
        this.today_prediction = today_prediction;
        this.tenday_prediction = tenday_prediction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Weather> getToday_prediction() {
        return today_prediction;
    }

    public void setToday_prediction(ArrayList<Weather> today_prediction) {
        this.today_prediction = today_prediction;
    }

    public ArrayList<Weather> getTenday_prediction() {
        return tenday_prediction;
    }

    public void setTenday_prediction(ArrayList<Weather> tenday_prediction) {
        this.tenday_prediction = tenday_prediction;
    }
}
