public class Main{
    public static void main(String[] args) {

        /*Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
        el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.*/
        Cliente persona1 = new Cliente();
        persona1.setNombre("Pablo");
        persona1.setEdad(38);
        persona1.setTelefono("0412-8948406");
        persona1.setCredito(35.45);

        persona1.mostrarDatos();

        /*Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
         y con una variable salario que solo tenga la clase Trabajador.*/
        Trabajador persona2 = new Trabajador();
        persona2.setNombre("Manuel");
        persona2.setEdad(45);
        persona2.setTelefono("0412-8456978");
        persona2.setSalario(325.78);

        persona2.mostrarDatos();

    }
}

/*Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono*/
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

/*Una vez creada la clase,
crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.*/
class Cliente extends Persona{
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double getCredito() {
        return credito;
    }
    public void mostrarDatos (){
        System.out.println("Los datos del cliente son:\n- Nombre: " + this.getNombre() + "\n- Edad: " + this.getEdad() + "\n- Telefono: " + this.getTelefono() + "\n- Credito: " + this.getCredito() + "\n");
    }
}
class Trabajador extends Persona {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void mostrarDatos (){
        System.out.println("Los datos del Trabajador son:\n- Nombre: " + this.getNombre() + "\n- Edad: " + this.getEdad() + "\n- Telefono: " + this.getTelefono() + "\n- Credito: " + this.getSalario());
    }

}