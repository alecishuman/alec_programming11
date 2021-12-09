public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour % 24;
        this.minute = minute % 60;
        this.second = second % 60;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour % 24;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute % 60;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second % 60;
    }

    public String toString() {
        String strHour, strMin, strSec;
        if (Integer.toString(this.hour).length() == 1) {
            strHour = "0" + Integer.toString(this.hour);
        } else {
            strHour = Integer.toString(this.hour);
        }
        if (Integer.toString(this.minute).length() == 1) {
            strMin = "0" + Integer.toString(this.minute);
        } else {
            strMin = Integer.toString(this.minute);
        }
        if (Integer.toString(this.second).length() == 1) {
            strSec = "0" + Integer.toString(this.second);
        } else {
            strSec = Integer.toString(this.second);
        }
        return strHour + ":" + strMin + ":" + strSec;
    }

    public Time nextSecond() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
        }
        if (this.minute == 60) {
            this.minute = 0;
            this.hour++;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }
        return this;
    }

    public Time previousSecond() {
        this.second--;
        if (this.second == -1) {
            this.second = 59;
            this.minute--;
        }
        if (this.minute == -1) {
            this.minute = 59;
            this.hour--;
        }
        if (this.hour == -1) {
            this.hour = 23;
        }
        return this;
    }
}
