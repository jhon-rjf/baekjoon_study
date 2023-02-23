import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int total = 0;
       int x = sc.nextInt();
       String n = sc.next();
        String array [] = new String[x];
        array = n.split("");
        for (String s : array){
            total += Integer.parseInt(s);
        }








        System.out.println(total);
              sc.close();}      
      

	
}

