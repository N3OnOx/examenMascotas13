public class Mascota {
    private int cod_mascota;
    private String apodo;
    private int peso;
    private int edad;
    private int cod_propietario;

    public Mascota() {
    }

    public Mascota(int cod_mascota, String apodo, int peso, int edad, int cod_propietario) {
        this.cod_mascota = cod_mascota;
        this.apodo = apodo;
        this.peso = peso;
        this.edad = edad;
        this.cod_propietario = cod_propietario;
    }

    public int getCod_mascota() {
        return cod_mascota;
    }

    public void setCod_mascota(int cod_mascota) {
        this.cod_mascota = cod_mascota;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCod_propietario() {
        return cod_propietario;
    }

    public void setCod_propietario(int cod_propietario) {
        this.cod_propietario = cod_propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "cod_mascota=" + cod_mascota +
                ", apodo='" + apodo + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                ", cod_propietario=" + cod_propietario +
                '}';
    }
}
