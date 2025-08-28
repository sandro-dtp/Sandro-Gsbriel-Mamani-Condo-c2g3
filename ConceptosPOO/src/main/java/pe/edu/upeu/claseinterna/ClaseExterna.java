package pe.edu.upeu.claseinterna;

public class ClaseExterna {
    int a,b;
    class claseInterna1{
       double r;
       double sumar(){
           r = a+b;
           return b;
        }
    }
    class claseInterna2{
       double r;
       double resta (){
           r=a+b;
           return b;

       }
    }

    public static void main(String[] args) {
        ClaseExterna c= new ClaseExterna();
        c.a=10;
        c.b=3;
        claseInterna1 ci1= c.new claseInterna1();
        System.out.println(ci1.sumar());

        claseInterna2 ci2=c.new claseInterna2();
        ci2.resta();
        System.out.println(ci2.r);


    }
}
class claseExterna3{

}
