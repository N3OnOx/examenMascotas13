public class Ciudad {
    private int cod_ciudad;
    private String nombre;

    public Ciudad() {
    }

    public Ciudad(int cod_ciudad, String nombre) {
        this.cod_ciudad = cod_ciudad;
        this.nombre = nombre;
    }

    public int getCod_ciudad() {
        return cod_ciudad;
    }

    public void setCod_ciudad(int cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "cod_ciudad=" + cod_ciudad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
