package pe.edu.upeu.encapsulamiento;

public class Persona {
   private String nombre;
   protected String apellido;
   private int edad;

   Persona() {}
   Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    void saludo(){
        System.out.println("Hola, mi nombre es "+getNombre()+" y mi edad es "+edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
