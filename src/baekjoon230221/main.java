import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //자리수 
        String in = sc.next();
        String total ="";
        for (int i = 0; i < N; i++){
            int strlength = in.length();
            String array [] = new String[strlength];
            array = in.split("");
            for(int z = 0; z<strlength; z++){
        total = total+array[z];
        System.out.println(total);
            }      
      

	
  sc.close();}
}
}