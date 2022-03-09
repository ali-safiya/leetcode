class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
        
        int noofyear= yearOddDays((year-1)% 400) % 7;
        
        int noofmonth= monthOddDays(month-1)%7;
        
        int whichday= (day+noofmonth + noofyear); 
        
        if(year%4==0 && year%100!=0 && month>2)
            whichday++;
        System.out.println(noofyear + noofmonth + whichday);
        return calday(whichday%7);
        
    }
        static int yearOddDays(int year){
            
            if(year>=100  && year<200){
                return  (year-100)/4+(year-100)+5;
            }
            
             else if(year>=200  && year<300){
                return  (year-200)/4+(year-200)+3;
            }
            
             else if(year>=300  && year<400){
                return  (year-300)/4+(year-300)+1;
            }
            else
            {
                return year+(year/4);
            }
            
            
        }
        
        
        static int monthOddDays(int month)
        {    
           switch(month)
            {
            case 0: return 0;  
            case 1: return 3;
            case 2: return 3;
            case 3: return 6;
            case 4: return 8;
            case 5: return 11;
            case 6: return 13;
            case 7: return 16;
            case 8: return 19;
            case 9: return 21;
            case 10: return 24;
            case 11: return 26;
            
            }
           return 0;
        }
        
         String   calday(int day){
            
            switch(day){
            case 0: return "Sunday";  
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";    
            
        }
             return " ";
         }
        
    
}