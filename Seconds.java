/**
 * @author Johnathan L. Nelson Ento
 * @version July 28, 2019
 * converts seconds to equivalent hours, minutes, and seconds
 */

import java.util.Scanner;
public class Seconds {
  public static void main(String[] args){
    Scanner secIn = new Scanner(System.in);
    int sec;
    int min;
    int hours;
    System.out.print("Enter the number of seconds: ");
    sec = secIn.nextInt();
    System.out.print("\n" +sec + " seconds = ");
    min = sec / 60;
    sec %= 60;
    hours = min / 60;
    min %= 60;
    System.out.print(hours + " hours, " + min + " minutes, and " + sec + " seconds\n\n" );
  }
}
