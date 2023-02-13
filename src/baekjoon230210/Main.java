import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
public class Main{

public Main(boolean temp,int Count,String ox)
    
    {
     temp = temp;
    this.Count = Count; //this 는 이 Main클래스 속의 a에 넣겠다는것.
    this.ox = ox;
    }

String [] func()
    {
        
        
        //    Scanner sc = new Scanner(System.in);
           // System.out.println("OX값");
            // String ox = sc.next();
            String ox = this.ox;
            this.strlength = ox.length();
           this.O = new String[strlength];
            this.O = ox.split("");
            
        
    
        return this.O;
    }

String in(){
    System.out.println("Scanner?");
     Scanner sc = new Scanner(System.in);  
     this.scan = sc.next();
     return this.scan;
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
    String ox;
    String scan;
    public static void main(String[] args) throws IOException{
    //   Scanner sc = new Scanner(System.in);  
      //System.out.println("몇번이나?");
      boolean temp = 1>0;
      Main obj =new Main (temp);
      int Counta = 0 ;
      Counta = Integer.parseInt(obj.in());
      String ox ;
      ox = obj.in();
     obj =new Main (temp, Counta, ox);
      for(int i =0; i<Counta;i++){
        String prt = Arrays.toString(obj.func());
     //   System.out.println(prt);
      System.out.println(obj.calc());
      
      }
      

    }
}
