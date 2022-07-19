public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setEdad(34);
        persona.setNombre("Hector");
        persona.setTelefono("0412-8948406");
        System.out.println("La edad de " + persona.getNombre() + " es " + persona.getEdad() + " y su telefono es " + persona.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

}