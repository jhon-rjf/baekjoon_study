import java.util.Scanner;
import java.util.Arrays;
public class Main{

public Main(int Count)
    
    {
    this.Count = Count; //this 는 이 Main클래스 속의 a에 넣겠다는것.
    }

String [] func()
    {
        
        
           Scanner sc = new Scanner(System.in);
           // System.out.println("OX값");
            String ox = sc.next();
            this.strlength = ox.length();
           this.O = new String[strlength];
            this.O = ox.split("");
            
        
    
        return this.O;
    }

int calc()
    { 
    String OO = new String("O");
    this.sum=0;
    for (int z = 0; z<strlength; z++)
        {
        boolean tr = (O[z].equals(OO)); //O[z]가 O일때
        if (tr) 
            {
            this.temp += 1;
            this.sum += this.temp;
            } 
        else 
            {
                this.temp =0;
            }
            this.total = this.sum;
        }
    return this.total;
    }


    int strlength;
    int Count;
    String [] O ;
    int total;
    int sum;
    int temp;

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);  
      //System.out.println("몇번이나?");
      int Counta = sc.nextInt();
      Main obj = new Main (Counta);
      
      for(int i =0; i<Counta;i++){
        String prt = Arrays.toString(obj.func());
     //   System.out.println(prt);
      System.out.println(obj.calc());
      
      }
      

    }
}
