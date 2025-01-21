/* Wap convert minutes into the number of years, days.
Examples:
 Input : minutes = 3000010 
 Output : Given minutes has 5 years 258 days 
 */
class MinutesToYears {
    void minToYrs() {
        int minutes = 3000010;
        int minutesInYear = 365 * 24 * 60;
        int years = minutes / minutesInYear;
        int remainingMinutes = minutes % minutesInYear;
        int days = remainingMinutes / (24 * 60);
        
        System.out.println("Given minutes has " + years + " years " + days + " days");
    }
}       

public class demo018 {
    public static void main(String[] args) {
        MinutesToYears obj = new MinutesToYears();
        obj.minToYrs();
    }
}