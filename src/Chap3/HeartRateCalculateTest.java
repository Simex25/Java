package Chap3;
/* Making a Difference 155
the American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for calculating your
 maximum heart rate in beats per minute is 220 minus your age in years. Your target
heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates
provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and
gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes
for the month, day and year of birth). Your class should have a constructor that receives this data as
parameters. For each attribute provide set and get methods. The class also should include a method
that calculates and returns the person’s age (in years),
 a method that calculates and returns the person’s maximum heart rate and
 a method that calculates and returns the person’s target heart rate.
Write a Java app that prompts for the person’s information, instantiates an object of class Heart Rates and
prints the information from that object—including the person’s first name, last name and
date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target heart-rate range.*/


import java.text.ParseException;
import java.util.Scanner;

public class HeartRateCalculateTest {

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);

        HeartRateCalculate heart = new HeartRateCalculate("","",0,0,0);


        System.out.println("Please enter your information");

        System.out.println("Enter your first name");
        String firstName = in.nextLine();
        heart.setFirstName(firstName);
        System.out.println("Enter your last name");
        String lastName = in.nextLine();
        heart.setLastName(lastName);
        System.out.println("Enter day Of Birth");
        int day = in.nextInt();
        heart.dayOfBirth(day);
        System.out.println("Enter month of birth");
        int month = in.nextInt();
        heart.monthOfBirth(month);
        System.out.println("Enter year of birth");
        int year = in.nextInt();
        heart.yearOfBirth(year);

        System.out.println("Health Profile");
        System.out.println();
        System.out.println();

        System.out.printf("%s%s%n%s%s%n%s%d/%d/%d%n%s%d%n%s%d",  "First name :",heart.getFirstName() ,"Last name :",heart.getLastName(),"Date of Birth :", heart.getDayOfBirth(),
                heart.getMonthOfBirth(),heart.getYearOfBirth(),"Age :",heart.calculateAge(),"Your heart rate is :", heart.CalculateMaximumHeartRate());
                 System.out.println();
                heart.calculateTargetRangeHeartRate();

    }
}
