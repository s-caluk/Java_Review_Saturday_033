package week06_review;

public class OperatorsPractice {
    public static void main(String[] args) {

        double hourlyRate = 45;
        int weeklyHours = 40;
        double stateTaxRate = 0;
        double federalTaxRate = 26;

        stateTaxRate /= 100;
        federalTaxRate /= 100;


        // ------------------
        double salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * stateTaxRate;

        double federalTax = salaryBeforeTax * federalTaxRate;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross Pay: $" + salaryBeforeTax);
        System.out.println("Federal Tax: $" + federalTax);
        System.out.println("State Tax: $" + stateTax);
        System.out.println("Total Tax: $" + totalTax);
        System.out.println("Net Income: $" + salaryAfterTax);


    }
}
/*
4. Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax
				stateTax
				federalTax
				totalTax
				salaryAfterTax

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0
 */