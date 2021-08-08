package pack1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Main {

	public static void main(String[] args) {
		 //In order to find system time we are going to use LocalTime.now()
        LocalTime time = LocalTime.now();  
        System.out.println(time); 
       
    /*************************************************/
    //printing date time ina a specific format
        LocalDateTime now = LocalDateTime.now();  
       // System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        //System.out.println("After Formatting: " + formatDateTime);  
        
        
        
     /**************************************************/
    //Finding Dates of today, tomorrow and yeasterday
   
      //today date
    LocalDate date = LocalDate.now();
    //System.out.println("Today date: "+date); 
      //yesterday date
    LocalDate yesterday = date.minusDays(1); 
    //System.out.println("Yesterday date: "+yesterday);  
     //tomorrow date
    LocalDate tomorrow = yesterday.plusDays(2);   
    //System.out.println("Tommorow date: "+tomorrow); 
    
    /**************************************************/
   
    //Finding Leap year using .isLeapYear()
    LocalDate ly1 = LocalDate.of(2017, 1, 13);  
    //System.out.println(ly1.isLeapYear());  
    LocalDate ly2 = LocalDate.of(2016, 9, 23);  
    //System.out.println(ly2.isLeapYear());
    
    /*************************************************/
    //Setting date and time using .atTime() for that we need to import LocalDateTime
    
    LocalDate st1 = LocalDate.of(2017, 1, 13);  
    LocalDateTime datetime = st1.atTime(1,50,9);      
    //System.out.println(datetime); 
    /************************************************/
  
    
    // Modifications in hours ands minutes by using .minusHours() , .plusHours and .minusMinutes and .plusMinutes 
    LocalTime time1 = LocalTime.of(10,43,12); 
    //System.out.println("Actual Time What we given is: "+time1);
   
    LocalTime time2=time1.minusHours(2);  
    LocalTime time3=time2.minusMinutes(34);  
    //System.out.println("After applying Minus operations: "+time3);  
   
    LocalTime time4=time1.plusHours(4);  
    LocalTime time5=time4.plusMinutes(18);  
    //System.out.println("After applying Plus operations: "+time5);  
  /***************************************************************/
    // changing dates by adding days using Plus and Minus
    LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);  
    LocalDateTime datetime2 = datetime1.plusDays(120);  
    //System.out.println("Before Formatting: " + datetime2);  
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
    String formatDateTime1 = datetime2.format(format1);   
    //System.out.println("After Formatting: " + formatDateTime1 );  
    
    /**************************************************************/
   //timings in between Two Zones using ZoneId
    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
    LocalTime t1 = LocalTime.now(zone1);  
    //System.out.println("India Time Zone: "+t1);  
    LocalTime t2 = LocalTime.now(zone2);  
   // System.out.println("Japan Time Zone: "+t2);  
    long hours = ChronoUnit.HOURS.between(t1, t2);  
    //System.out.println("Hours between two Time Zone: "+hours);  
    long minutes = ChronoUnit.MINUTES.between(t1, t2);  
    //System.out.println("Minutes between two time zone: "+minutes);  
    /**************************************************************/
    
    //Finding day in a particular year
    Year y = Year.of(2021);  
    LocalDate l = y.atDay(123);  
    //System.out.println("Day of a 123 is:"+l);
    
    //finding length of a year i.e., how many days
    Year year = Year.of(2017);  
    //System.out.println("No.of days in a "+ year+" is: "+year.length());
    
    //finding current year and month 
    YearMonth ym = YearMonth.now();  
    //System.out.println("Current year and month is: "+ym); 
    
    /**********************************************************************/
    
   // calculating periodical dates by giving input as no.of days
    Period period = Period.ofDays(24);
    Temporal temp = period.addTo(LocalDate.now());
    //System.out.println(temp);

	}

}
