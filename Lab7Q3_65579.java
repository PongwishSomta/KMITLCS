public class Lab7Q3_65579 {
    public static void main(String[] args) {
     numDaysFromDate(3,7,2003,4);

    }
    static void numDaysFromDate(int date, int month, int year, int myBD) {
        int daysBornTil31Dec2021 = 0;
        
        for ( int i = year + 1 ; i <= 2021 ; i++ ){
            if ( i %400 == 0 || (i %4 == 0 && i % 100 != 0)){
                daysBornTil31Dec2021 += 366 ; 
            }
            else {
                daysBornTil31Dec2021 += 365 ; 
            }
        }
     
    for (int i = month +1  ; i <= 12 ; i++){
       if( i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 ){
         daysBornTil31Dec2021 += 31 ; 
       } 
       else if ( i == 4 || i == 6 || i == 9 || i == 11 ){
         daysBornTil31Dec2021 += 30 ; 
       }
       else {
          if ( i%400 == 0 || (i %4 == 0 && i % 100 != 0)){
            daysBornTil31Dec2021 += 29 ;
          }
          else {
            daysBornTil31Dec2021 += 28 ; 
          }
       }
    }
    if( month  == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
         daysBornTil31Dec2021 += 31 - date ; 
      } 
      else if ( month == 4 || month == 6 || month == 9 || month == 11 ){
        daysBornTil31Dec2021 += 30 - date ; 
      }
      else {
         if ( year%400 == 0 || (year %4 == 0 && year % 100 != 0)){
           daysBornTil31Dec2021 += 29 - date  ;
         }
         else {
           daysBornTil31Dec2021 += 28 - date ; 
         }
      }
        
       
        
        

        int daysBornTil2Jan2022 = daysBornTil31Dec2021 + 2; // shift to Sunday Jan 02 2022
        String str = showResult(date, month, year, myBD, daysBornTil2Jan2022);
        System.out.println(str);
       } 
       static String showResult(int date, int month, int year, int myBD, int fromNumDaysFromDate) {
        String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday",
         "Thursday", "Friday", "Saturday" };
        int dayFromSun = 0;
        int modResult = fromNumDaysFromDate % 7;
         
        if (modResult > 0) {
            dayFromSun = 7 - modResult;
        }
         

        String str = String.format("You were born on %s and have been born for %d days (2 Jan 2022).Your program says %s", dayName[myBD], fromNumDaysFromDate, dayName[dayFromSun]);
         return str;
        }
       
}
