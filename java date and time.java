import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//Calendar class in Java is an abstract class that provides methods for converting date between a specific instant in time

class Result {    
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance(); //calender class
        cal.set(Calendar.MONTH,month-1);       //Set Month
        cal.set(Calendar.DAY_OF_MONTH,day);    //Set Day
        cal.set(Calendar.YEAR,year);           //Set Year
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return dayOfWeek;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]); //Get Month

        int day = Integer.parseInt(firstMultipleInput[1]);   //Get Day

        int year = Integer.parseInt(firstMultipleInput[2]); //Get Year

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
