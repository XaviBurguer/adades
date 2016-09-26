package src;
public class Persona {

    private String DNI;
    private int NumSeguridadSocial;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private int Salario;

    public Persona(String DNI, int numSeguridadSocial, String nombre, String apellidos, int edad, int salario) {
        this.DNI = DNI;
        NumSeguridadSocial = numSeguridadSocial;
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
        Salario = salario;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNumSeguridadSocial() {
        return NumSeguridadSocial;
    }

    public void setNumSeguridadSocial(int numSeguridadSocial) {
        NumSeguridadSocial = numSeguridadSocial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }
}

