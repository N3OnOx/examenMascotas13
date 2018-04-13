import java.sql.*;

public class BDController {
    private Connection conexion;
    private PreparedStatement existeCodCamp;
    private PreparedStatement existeCodCiud;
    private PreparedStatement existeCodMasc;
    private PreparedStatement existeCodProp;

    BDController(){
        try {
            //this.conexion = DriverManager.getConnection("jdbc:mysql://192.168.10.252:3306/videojuegos", "1GS","Nelson2000");
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/musica", "root","");
            String SQLExisteCodCamp = "";
            this.existeCodCamp = conexion.prepareStatement(SQLExisteCodCamp);
            String SQLExisteCodCiud = "";
            this.existeCodCiud = conexion.prepareStatement(SQLExisteCodCiud);
            String SQLExisteCodMasc = "";
            this.existeCodMasc = conexion.prepareStatement(SQLExisteCodMasc);
            String SQLExisteCodProp = "";
            this.existeCodProp = conexion.prepareStatement(SQLExisteCodProp);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    

    public boolean existeCodCamp(int cod_camp){
        boolean existe = true;
        try {
            existeCodCamp.setInt(1, cod_camp);
            ResultSet rs = existeCodCamp.executeQuery();
            if (!rs.first()){
                existe = false;
            }
            rs.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return existe;
    }
    public boolean existeCodCiud(int cod_ciud){
        boolean existe = true;
        try {
            existeCodCiud.setInt(1, cod_ciud);
            ResultSet rs = existeCodCiud.executeQuery();
            if (!rs.first()){
                existe = false;
            }
            rs.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return existe;
    }
    public boolean existeCodMasc(int cod_masc){
        boolean existe = true;
        try {
            existeCodMasc.setInt(1, cod_masc);
            ResultSet rs = existeCodMasc.executeQuery();
            if (!rs.first()){
                existe = false;
            }
            rs.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return existe;
    }
    public boolean existeCodProp(int cod_prop){
        boolean existe = true;
        try {
            existeCodProp.setInt(1, cod_prop);
            ResultSet rs = existeCodProp.executeQuery();
            if (!rs.first()){
                existe = false;
            }
            rs.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return existe;
    }
}
