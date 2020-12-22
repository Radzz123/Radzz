import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.*; 

public class Dates{
   public static void main(final String args[]) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String addonAdditionDate1 = "02 02 2020";
        String currentDate1 = "27 11 2020";

       try {
            Date addonAdditionDate = myFormat.parse(addonAdditionDate1);
            Date currentDate = myFormat.parse(currentDate1);
            long difference = currentDate.getTime() - addonAdditionDate.getTime();
            float daysBetween = (difference / (1000 * 60 * 60 * 24));
            float N = daysBetween / 29;
           System.out.println("Number of Days between dates: " + daysBetween);
           System.out.println("N : " + N);
           int number = (int)Math.ceil(N);
           System.out.println("Ceil : " + number);
           final Calendar c = Calendar.getInstance();
           c.setTime(addonAdditionDate);
           c.add(Calendar.DATE, (number * 29));
           Date newRecurrenceDate= c.getTime();
           System.out.println("New Recurrence Date: "+newRecurrenceDate);
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           String output = sdf.format(newRecurrenceDate);
            System.out.println(output);
       } catch (final Exception e) {
	       e.printStackTrace();
	 }
   }
}