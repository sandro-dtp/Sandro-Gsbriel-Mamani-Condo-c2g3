package pe.edu.upeu.herencia;

public class carro extends vehiculo {
    public static void main(String[] args) {
        carro c =new  carro();
        System.out.println("caracteriztica:");
        c.marca = "toyota";
        System.out.println("Marca"+c.marca);
        System.out.println("modelo:"+c.marca);
        System.out.println("color"+"No se puede"+"heredar por ser privado");
        c.sonido();
    }

}
