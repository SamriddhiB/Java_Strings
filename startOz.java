import java.util.Scanner;
/*Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o" */

public class startOz {
  public static 
    public static void main(String[] args) {

    // String str="ozyman";
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your string!!!");
     String str=sc.next();
        if (str.startsWith("oz")) {
            System.out.print("oz");        
        } else if (str.charAt(0) == 'o') {
            System.out.print("o");        
        } else if (str.length() > 1 && str.charAt(1) == 'z') {
          System.out.print("z");
        } else {
          System.out.print("");
        }
}
}