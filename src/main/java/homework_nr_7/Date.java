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

        if (month < 1) {
        } else if (month > 12) {
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (day < 1) {
                } else if (day > 31) {
                }
                break;
            case 2:
                if (day < 1) {
                } else if (day > 28) {
                }
                break;
            case 4, 6, 9, 11:
                if (day < 1) {
                } else if (day > 30) {
                }
                break;
            default:
        }
    }

    public void displayDate() {
        System.out.println(day +"/"+ month +"/"+year);
}
}

