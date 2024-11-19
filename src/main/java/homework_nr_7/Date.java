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
        if (1 > month) {
            return 0;
        } else if (12 < month) {
            return 0;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (1 > day) {
                    return 0;
                } else if (31 < day) {
                    return 0;
                }
                break;
            case 2:
                if (1 > day) {
                    return 0;
                } else if (28 < day) {
                    return 0;
                }
                break;
            case 4, 6, 9, 11:
                if (1 > day) {
                    return 0;
                } else if (30 < day) {
                    return 0;
                }
                break;
            default:
        }
        System.out.println(day + "/" + month + "/" + year);
        return 1;
    }
}
