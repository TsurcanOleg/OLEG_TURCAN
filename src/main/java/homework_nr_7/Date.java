package homework_nr_7;

public class Date {

    int day;
    int month;
    int year;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int displayDate() {
        int dateToShow = 0;
        if (1 > month) {
            return 1;
        } else if (12 < month) {
            return 2;
        }
        System.out.println(day + "/" + month + "/" + year);
        return dateToShow;
    }
}



