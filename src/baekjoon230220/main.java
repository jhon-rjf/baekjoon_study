import java.util.Scanner;
public class main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
double a = sc.nextDouble();

double aa = a/4;
int i = 0;
int count = 0;
count = count + (int)aa;
if(a%4 > 0){
    count ++;
}
for(i = 0; i<count; i++){
    System.out.print("long ");
}


 System.out.println("int");


sc.close();
}
}