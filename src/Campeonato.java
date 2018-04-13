public class Campeonato {
    private int cod_campeonato;
    private int cod_ciudad;
    private String fecha;
    private int campeon;
    private int subcampeon;

    public Campeonato() {
    }

    public Campeonato(int cod_campeonato, int cod_ciudad, String fecha, int campeon, int subcampeon) {
        this.cod_campeonato = cod_campeonato;
        this.cod_ciudad = cod_ciudad;
        this.fecha = fecha;
        this.campeon = campeon;
        this.subcampeon = subcampeon;
    }

    public int getCod_campeonato() {
        return cod_campeonato;
    }

    public void setCod_campeonato(int cod_campeonato) {
        this.cod_campeonato = cod_campeonato;
    }

    public int getCod_ciudad() {
        return cod_ciudad;
    }

    public void setCod_ciudad(int cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCampeon() {
        return campeon;
    }

    public void setCampeon(int campeon) {
        this.campeon = campeon;
    }

    public int getSubcampeon() {
        return subcampeon;
    }

    public void setSubcampeon(int subcampeon) {
        this.subcampeon = subcampeon;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "cod_campeonato=" + cod_campeonato +
                ", cod_ciudad=" + cod_ciudad +
                ", fecha='" + fecha + '\'' +
                ", campeon=" + campeon +
                ", subcampeon=" + subcampeon +
                '}';
    }
}
