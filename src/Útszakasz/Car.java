package Útszakasz;

public class Car {
   private int hour;
   private int min;
   private int sec;
   private int time;
   private String city;

    public Car(int hour, int min, int sec, int time, String city) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.time = time;
        this.city = city;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public int getTime() {
        return time;
    }

    public String getCity() {
        return city;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
