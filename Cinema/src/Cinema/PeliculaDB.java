package Cinema;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class PeliculaDB {
    private Conexion1 conexion;
    private ArrayList<Pelicula>Peliculas;

    public PeliculaDB() {
        Peliculas=new ArrayList<Pelicula>();
    }
    
    public void insertar(Pelicula pelicula){
        String query="INSERT INTO pelicula (idPelicula,NombrePelicula,añoPublicacion,idiomaPelicula,duracionPelicula) VALUES(?,?,?,?,?)";
        conexion=new Conexion1();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setInt(1, pelicula.getIdPelicula());
            preparedStm.setString(2, pelicula.getNombrePelicula());
            preparedStm.setInt(3, pelicula.getAñoPublicacion());
            preparedStm.setString(4, pelicula.getIdiomaPelicula());
            preparedStm.setInt(5, pelicula.getDuracionPelicula());
            preparedStm.executeUpdate();
            System.out.println("Pelicula insertado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
    }
    
    public void actualizar(Pelicula pelicula) {
        String query = "UPDATE pelicula  SET NombrePelicula=?,añoPublicacion=?, idiomaPelicula=?, duracionPelicula=? WhERE idPelicula=? ";
        conexion = new Conexion1();
        try {
            PreparedStatement preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setString(1, pelicula.getNombrePelicula());
            preparedStm.setInt(2, pelicula.getAñoPublicacion());
            preparedStm.setString(3, pelicula.getIdiomaPelicula());
            preparedStm.setDouble(4, pelicula.getAñoPublicacion());
            preparedStm.setInt(5, pelicula.getIdPelicula());

            preparedStm.executeUpdate();
            System.out.println("Pelicula actualizado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    }
    
    public void borrar(int idPelicula) {
        String query = "DELETE FROM pelicula  WHERE idPelicula=? ";
        conexion = new Conexion1();
        try {
            PreparedStatement preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setInt(1,idPelicula);
            preparedStm.executeUpdate();
            System.out.println("Pelicula borrado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
        
    } 
    
    public ArrayList<Pelicula> listado(){
        Statement stmt=null;
        conexion=new Conexion1();
        String query="SELECT * FROM pelicula";
        try {
            stmt=conexion.conectar().createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                Pelicula pelicula =new Pelicula();
                pelicula.setIdPelicula(rs.getInt(1));
                pelicula.setNombrePelicula(rs.getString(2));
                pelicula.setAñoPublicacion(rs.getInt(3));
                pelicula.setIdiomaPelicula(rs.getString(4));
                pelicula.setDuracionPelicula(rs.getInt(5));
                Peliculas.add(pelicula);
            }
        } catch (Exception e) {
            System.out.println("Error obteniendo listado de Clientes "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
            return Peliculas;
        }
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    
        public ArrayList<Pelicula> porId(int idPelicula){
        String query="SELECT * FROM pelicula WHERE idPelicula=?";
        Pelicula pelicula=new Pelicula();
        conexion=new Conexion1();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setInt(1, idPelicula);
            ResultSet rs=preparedStm.executeQuery();
            while(rs.next()){
                pelicula.setIdPelicula(rs.getInt(1));
                pelicula.setNombrePelicula(rs.getString(2));
                pelicula.setAñoPublicacion(rs.getInt(3));
                pelicula.setAñoPublicacion(rs.getInt(4));
                pelicula.setDuracionPelicula(rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println("No se pudo mostrar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
        return Peliculas;
    }
}
