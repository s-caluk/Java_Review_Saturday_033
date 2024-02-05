package week06_review;

public class MethodsPractice {
    public static void main(String[] args) {

        String result = day(5);
        System.out.println(result);

        String str = monthName(2);
        System.out.println(str);

        daysInMonth(12);
    }

    public static String day(int num) {

        String name = "Invalid number";

        switch (num) {
            case 1 -> name = "Monday";
            case 2 -> name = "Tuesday";
            case 3 -> name = "Wednesday";
            case 4 -> name = "Thursday";
            case 5 -> name = "Friday";
            case 6 -> name = "Saturday";
            case 7 -> name = "Sunday";
        }

        return name;
    }


    public static String monthName(int num) {

        String name = "Invalid Month";

        if (num >= 1 && num <= 12) {
            // Jan, Feb, Mar ...
            name = (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April"
                    : (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August"
                    : (num == 9) ? "September" : (num == 10) ? "October" : (num == 11) ? "November" : "December";

        }

        return name;
    }


    public static void daysInMonth(int num){
        String monthName = monthName(num);
        int days = 0;

        if(num >= 1 && num <= 12){
            if(num == 2){
                // if its leap yes then set it to 29
                days = 28;
            }else if(num == 4 || num == 6 || num == 9 || num == 11){
                days = 30;
            }else{
                days = 31;
            }
        }

        System.out.println(monthName + " has " + days + " days");
        // return days;

    }
}

/*
3. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Month."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */
