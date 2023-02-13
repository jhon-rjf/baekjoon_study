import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
public class Main{

public Main()
{}
String Scan;
int length;
int total;
int sum;
int temp;
String [] oxMain ;

String Scan(){
    System.out.println("Scanner?");
    Scanner sc = new Scanner(System.in);
    this.Scan = sc.next();
    return this.Scan;
}
int func(String temp){
    int strlength = temp.length();
    this.length = strlength;
    return this.length;
}

String [] function (String oxtemp){
    String ox = oxtemp;
    this.oxMain = new String[this.length];
    this.oxMain = ox.split("");
    return this.oxMain;
}

int calc(String [] O)
    { 
    String OO = new String("O");
    this.sum=0;
    for (int z = 0; z<this.length; z++)
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
        System.out.println(this.total);
    return this.total;
    }


    public static void main (String[] args) throws IOException{
        Main obj = new Main();
        int Count = Integer.parseInt(obj.Scan());
        for (int i=0; i<Count; i++ )
        {
            String ox = obj.Scan();
            int leng = obj.func(ox);
            String [] O = obj.function(ox);
            obj.calc(O);
            
        }

    }
}