// 3280 convert date into binary date format

public class Problem_3280 {
    public String convertDate(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year
        if (isLeapYear(year)) {
            daysInMonths[1] = 29;
        }

        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonths[i];
        }
        dayOfYear += day;

        String binaryYear = String.format("%014b", year);
        String binaryDayOfYear = String.format("%010b", dayOfYear);

        return binaryYear + binaryDayOfYear;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
