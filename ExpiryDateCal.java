import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.*; 

public class ExpiryDateCal{
   public static void main(final String args[]) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String addonAdditionDate1 = "18 12 2020";
        int duration = 29;

       try {
            Date addonAdditionDate = myFormat.parse(addonAdditionDate1);
            
           Date expiryDate ;

           if(duration > 0)
		    {
			    Calendar c = Calendar.getInstance();
			    c.setTime(addonAdditionDate);
			    c.add(Calendar.DAY_OF_MONTH, duration);
			
			    expiryDate = c.getTime();
		    }
		    else
		    {
			    expiryDate = null;
            }
            
           System.out.println("New Expiry Date: " + expiryDate);
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           String output = sdf.format(expiryDate);
            System.out.println(output);
       } catch (final Exception e) {
	       e.printStackTrace();
	 }
   }
}