import java.util.Scanner;
public class Main{
 //2번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("정수를 입력하세요:");
        int input= sc.nextInt();
     if(input == 1){
        System.out.println("ONE");
     }else if(input == 2){
        System.out.println("TWO");
     }else if(input == 3){
        System.out.println("THREE");
     }else if(input == 4){
        System.out.println("FOUR");
     }else if(input == 5){
        System.out.println("FIVE");
     }else if(input == 6){
        System.out.println("SIX");
     }else if(input == 7){
        System.out.println("SEVEN");
     }else if(input == 8){
        System.out.println("EIGHT");
     }else if(input == 9){
        System.out.println("NINE");
     }else {
        System.out.println("OTHER");
     }
     
    }
}