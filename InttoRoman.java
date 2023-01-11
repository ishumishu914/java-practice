import java.util.Scanner;

/**
 * InttoRoman
 */
public class InttoRoman 
{
  public static String intToRoman(int num) 
  {
    StringBuilder res = new StringBuilder();
    String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    int i = 0;
    while(num > 0)
    {
      while(num >= values[i])
      {
        num -= values[i];
        res.append(roman[i]);
      }
      i++;
    }
    return res.toString();
  }
  public static void main(String[] args) 
  {
    try (Scanner in = new Scanner(System.in)) 
    {
      while(true)
      {
        System.out.println("Enter an integer: ");
        if (in.hasNextInt()) 
        {
          int num = in.nextInt();
          System.out.println(InttoRoman.intToRoman(num));
          System.out.println("Press any key to continue (q to quit)");          
        }
        else
        {
          in.close();
          break;           
        }
      }
    }
  }
}