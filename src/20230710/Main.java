Class Circle{
int radius ;
String color ;

double calcArea() {
    return 3.14 * radius * radius;
}
}

public class CircleTest {
    public static void main(String[] args){
        Circle obj = new Circle();
        Circle objt = new Circle();
        obj.radius = 100;
        obj.color = blue;
        objt.radius=110;
        objt.color = red;
        double objarea = obj.calcArea();
        double objtarea = objt.calcArea();
        System.out.println("1원의면적" + objarea);
        System.out.println("1원의 색"+obj.color);
        System.out.println("2원의면적"+ objtarea);
        System.out.println("2원의 색"+objt.color);

    }
}