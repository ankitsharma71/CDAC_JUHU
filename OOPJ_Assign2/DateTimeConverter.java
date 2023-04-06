import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (dd/mm/yyyy): ");
        String dateStr = scanner.nextLine();

        System.out.print("Enter time (hh:mm:ss): ");
        String timeStr = scanner.nextLine();

        // Convert date and time strings to LocalDateTime object
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        LocalDateTime dateTime;
        if (dateStr.contains("/")) {
            // Date format is either dd/mm/yyyy or mm/dd/yyyy
            if (dateStr.indexOf("/") == 2) {
                // Date format is dd/mm/yyyy
                dateTime = LocalDateTime.parse(dateStr + " " + timeStr, formatter1);
            } else {
                // Date format is mm/dd/yyyy
                dateTime = LocalDateTime.parse(dateStr + " " + timeStr, formatter2);
            }
        } else {
            // Date format is yyyy/mm/dd
            dateTime = LocalDateTime.parse(dateStr + " " + timeStr, formatter3);
        }

        // Convert LocalDateTime object to different formats
        String date1 = dateTime.format(formatter1);
        String date2 = dateTime.format(formatter2);
        String date3 = dateTime.format(formatter3);

        System.out.println("Date (dd/mm/yyyy HH:mm:ss): " + date1);
        System.out.println("Date (mm/dd/yyyy hh:mm:ss a): " + date2);
        System.out.println("Date (yyyy/mm/dd HH:mm): " + date3);
    }
}

