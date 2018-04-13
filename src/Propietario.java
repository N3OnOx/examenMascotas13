public class Propietario {
    private int cod_propietario;
    private String dni;
    private String nombre;
    private int edad;

    public Propietario() {
    }

    public Propietario(int cod_propietario, String dni, String nombre, int edad) {
        this.cod_propietario = cod_propietario;
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getCod_propietario() {
        return cod_propietario;
    }

    public void setCod_propietario(int cod_propietario) {
        this.cod_propietario = cod_propietario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "cod_propietario=" + cod_propietario +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
