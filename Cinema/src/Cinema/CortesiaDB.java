package Cinema;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author udemy
 */
public class CortesiaDB {
    private Conexion1 conexion;
    private ArrayList<Cortesia>Cortesias;

    public CortesiaDB() {
        Cortesias=new ArrayList<Cortesia>();
    }
    
    public void insertar(Cortesia cortesia){
        String query="INSERT INTO cortesia (idCortesia,cantidadBoletas,estadoCortesia) VALUES(?,?,?)";
        conexion=new Conexion1();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setInt(1, cortesia.getIdCortesia());
            preparedStm.setInt(2, cortesia.getCantidadBoletas());
            preparedStm.setInt(3, cortesia.getEstadoCortesia());
            preparedStm.executeUpdate();
            System.out.println("Cortesia insertado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
    }
    
    public void actualizar(Cortesia idCortesia) {
        String query = "UPDATE cortesia  SET cantidadBoletas=?,telefonoAfiliado=?, estadoCortesia=? WhERE idCortesia=? ";
        conexion = new Conexion1();
        try {
            PreparedStatement preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setInt(1, idCortesia.getCantidadBoletas());
            preparedStm.setInt(2, idCortesia.getEstadoCortesia());
            preparedStm.setInt(5, idCortesia.getIdCortesia());

            preparedStm.executeUpdate();
            System.out.println("Cortesia actualizado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    }
    
    public void borrar(int idCortesia) {
        String query = "DELETE FROM cortesia  WHERE idCortesia=? ";
        conexion = new Conexion1();
        try {
            PreparedStatement preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setInt(1,idCortesia);
            preparedStm.executeUpdate();
            System.out.println("Cortesia borrado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
        
    } 
    
    public ArrayList<Cortesia> listado(){
        Statement stmt=null;
        conexion=new Conexion1();
        String query="SELECT * FROM cortesia";
        try {
            stmt=conexion.conectar().createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                Cortesia cortesia =new Cortesia();
                cortesia.setIdCortesia(rs.getInt(1));
                cortesia.setCantidadBoletas(rs.getInt(2));
                cortesia.setEstadoCortesia(rs.getInt(3));
                Cortesias.add(cortesia);
            }
        } catch (Exception e) {
            System.out.println("Error obteniendo listado de Clientes "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
            return Cortesias;
        }
    }
    
}
