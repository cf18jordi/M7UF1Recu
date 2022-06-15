package com.example.appm7recuperacio;

public class Weather {
    String day;
    String main;
    String percent;
    String temp_min;
    String temp_max;

    public Weather(String day, String main, String percent, String temp_min, String temp_max) {
        this.day = day;
        this.main = main;
        this.percent = percent;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }
}
