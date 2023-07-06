import java.io.*;
import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
       //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*String s = br.readLine(); //get String
        int i = Integer.parseInt(br.readLine());//get int
        */
      
      
        /* BufferedWriter bw = new BufferedWriter(new OutputStramWriter(System.out));
        String s = "abcdefg"
        bw.write(s+"\n"); //burfferd print
        bw.flush(); //print else
        bw.close(); //close stream
        */

    ArrayList<String> shape=new ArrayList<>();
    ArrayList<String> num=new ArrayList<>();
    shape.add("spade");
    shape.add("heart");
    shape.add("clover");
    shape.add("diamond");
    num.add("Ace");
    num.add("2");
    num.add("3");
    num.add("4");
    num.add("5");
    num.add("6");
    num.add("7");
    num.add("8");
    num.add("9");
    num.add("10");
    num.add("king");
    num.add("queen");

   for (int i = 0; i <5; i++ ){ 
       double r = Math.random();
       while (r > 0.4){
        r = Math.random();
       if (r == 0.0){
        r= Math.random();
        }
       }
       
       int rd = (int) (r*10);
        System.out.print(shape.get(rd)+" ");
      
        rd = (int) (r*100);
         while (rd >=12){
        r = Math.random();
        if (rd == 0){
        r= Math.random();
        }
       rd = (int) (r*100);
     
     }
   
        System.out.print(num.get(rd)+"\n");
        
    }

    //  for (int i = 0; i <5; i++ ){ 
    //    double r = Math.random();
    //    int rd = (int) (r*100);
    //    while (rd > 14){
    //     r = Math.random();
    //     if (r == 0.0){
    //     r= Math.random();
    //     }
    //    rd = (int) (r*100);
    //     System.out.print(num.get(rd));
     
    //  }

        
    // }
   
}
}