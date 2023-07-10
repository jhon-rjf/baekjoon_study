public class Main{
 //1번
    public static void main(String[] args) {

        int i;
        int tot=0;
        for (i=1;i<101;i++){
            if ((i>2) && (i % 3==0) || (i>3) && (i % 4==0)){
                tot=tot+i;
                System.out.println("i="+i);
                System.out.println("tot="+tot);
            }
        }
        System.out.println(tot);
    }
}