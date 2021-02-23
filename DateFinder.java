import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFinder {

    public static void main(String[] args) {
        String datePattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        String strDate;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter Date (dd/mm/yyyy Format) (0 to Close): ");
            strDate = input.next();
            if(strDate == "0") {
                break;
            }
            try {          
                Date date = dateFormat.parse(strDate);
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                switch(cal.get(Calendar.DAY_OF_WEEK)) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                }
            } catch (ParseException e) {
                System.out.println("ParseException occured: " + e.getMessage() + ". Exiting.");
                break;
            }
        }
    }
}
