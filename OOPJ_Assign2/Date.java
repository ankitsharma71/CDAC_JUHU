public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        if (year < 0) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        int maxDay = getMaxDayOfMonth();
        if (day < 1 || day > maxDay) {
            return false;
        }

        return true;
    }

    public int getDayOfWeek() {
        // This method is left as an exercise for the reader.
        // There are various algorithms to calculate the day of the week given a date.
        // One popular algorithm is Zeller's congruence.
        return -1;
    }

    public boolean isLeapYear() {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }

    public Date getNextDay() {
        int maxDay = getMaxDayOfMonth();
        if (day < maxDay) {
            return new Date(day + 1, month, year);
        } else {
            if (month == 12) {
                return new Date(1, 1, year + 1);
            } else {
                return new Date(1, month + 1, year);
            }
        }
    }

    public Date getPreviousDay() {
        if (day > 1) {
            return new Date(day - 1, month, year);
        } else {
            if (month == 1) {
                return new Date(31, 12, year - 1);
            } else {
                int prevMonth = month - 1;
                int prevMaxDay = new Date(1, prevMonth, year).getMaxDayOfMonth();
                return new Date(prevMaxDay, prevMonth, year);
            }
        }
    }

    private int getMaxDayOfMonth() {
        switch (month) {
            case 2:
                return isLeapYear() ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }

    public static void main(String[] args) {
        Date date = new Date(31, 12, 2022);
        System.out.println(date.isValid()); // true
        System.out.println(date.getDayOfWeek()); // -1
        System.out.println(date.isLeapYear()); // false
        Date nextDay = date.getNextDay();
        System.out.println(nextDay); // 01-01-2023
        Date previousDay = date.getPreviousDay();
        System.out.println(previousDay); // 30-12-2022
    }
}
