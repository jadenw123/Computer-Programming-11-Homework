public class Time {
    private String zero;
    private String zero2;
    private String zero3;
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
        if(hour>24){
            this.hour = 0;
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if(minute>59){
            this.minute = 0;
            this.hour++;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        if(second>59){
            this.second = 0;
            this.minute++;
        }
    }

    public String addZeroHour(){
        if(hour<9){
            zero = "0";
        }
        else{
            zero= "";
        }
        return zero;
    }

    public String addZeroMinute(){
        if(minute<9){
            zero2 = "0";
        }
        else{
            zero2 = "";
        }
        return zero2;
    }

    public String addZeroSecond(){
        if(second<9){
            zero3= "0";
        }
        else{
            zero3 = "";
        }
        return zero3;
    }

    public String toString(){
        return "hour: " + addZeroHour() + hour + "\tminute: " + addZeroMinute() + minute + "\tseconds: " + addZeroSecond() +second;
        }

    public Time nextSecond(){
        Time time = new Time(0, 0, 0);
        this.second++;
        if(hour>24){
            this.hour = 0;
        }
        if(minute>59) {
            this.minute = 0;
            this.hour++;
        }
        if(second>59) {
            this.second = 0;
            this.minute++;
        }
        return time;
    }


    public Time previousSecond(){
        Time time = new Time(0, 0, 0);
        this.second--;
        if(this.second<0)
            this.hour = 23;
        this.minute = 59;
        this.second = 59;
        return time;
    }




}
