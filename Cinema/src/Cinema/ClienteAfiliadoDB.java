
package Cinema;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class ClienteAfiliadoDB {
    private Conexion1 conexion;
    private ArrayList<ClienteAfiliado>Clientes;

    public ClienteAfiliadoDB() {
        Clientes=new ArrayList<ClienteAfiliado>();
    }
    
    public void insertar(ClienteAfiliado cliente){
        String query="INSERT INTO clienteafiliado (cedulaAfiliado,nombreAfiliado,telefonoAfiliado,numeroTarjeta,saldoAfiliado) VALUES(?,?,?,?,?)";
        conexion=new Conexion1();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setInt(1, cliente.getIdPersona());
            preparedStm.setString(2, cliente.getNombrePersona());
            preparedStm.setString(3, cliente.getTelefonoPersona());
            preparedStm.setInt(4, cliente.getIdTarjetaAfiliacion());
            preparedStm.setDouble(5, cliente.getSaldoTarjeta());
            preparedStm.executeUpdate();
            System.out.println("Cliente insertado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
    }
    
    public void actualizar(String idCliente,ClienteAfiliado cliente) {
        String query = "UPDATE clienteafiliado  SET nombreAfiliado=?,telefonoAfiliado=?, numeroTarjeta=?, saldoAfiliado=? WhERE cedulaAfiliado=? ";
        conexion = new Conexion1();
        try {
            PreparedStatement preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setString(1, cliente.getNombrePersona());
            preparedStm.setString(2, cliente.getTelefonoPersona());
            preparedStm.setInt(3, cliente.getIdTarjetaAfiliacion());
            preparedStm.setDouble(4, cliente.getSaldoTarjeta());
            preparedStm.setInt(5, cliente.getIdPersona());

            preparedStm.executeUpdate();
            System.out.println("Cliente actualizado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
    }
    
    public void borrar(String cedula) {
        String query = "DELETE FROM clienteafiliado  WHERE cedulaAfiliado=? ";
        conexion = new Conexion1();
        try {
            PreparedStatement preparedStm = conexion.conectar().prepareStatement(query);
            preparedStm.setString(1,cedula);
            preparedStm.executeUpdate();
            System.out.println("Cliente borrado con exito");
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el registro " + e);
        } finally {
            if (conexion != null) {
                conexion.cerrar();
            }
        }
        
    } 
    
    public ArrayList<ClienteAfiliado> listado(){
        Statement stmt=null;
        conexion=new Conexion1();
        String query="SELECT * FROM clienteafiliado";
        try {
            stmt=conexion.conectar().createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                ClienteAfiliado cliente =new ClienteAfiliado();
                cliente.setIdPersona(rs.getInt(1));
                cliente.setNombrePersona(rs.getString(2));
                cliente.setTelefonoPersona(rs.getString(3));
                cliente.setIdTarjetaAfiliacion(rs.getInt(4));
                cliente.setSaldoTarjeta(rs.getDouble(5));
                Clientes.add(cliente);
            }
        } catch (Exception e) {
            System.out.println("Error obteniendo listado de Clientes "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
            return Clientes;
        }
    }
    
    public ClienteAfiliado porCedula(int cedula){
        String query="SELECT * FROM clienteafiliado WHERE cedulaAfiliado=?";
        ClienteAfiliado cliente=new ClienteAfiliado();
        conexion=new Conexion1();
        try {
            PreparedStatement preparedStm=conexion.conectar().prepareStatement(query);
            preparedStm.setInt(1, cedula);
            ResultSet rs=preparedStm.executeQuery();
            while(rs.next()){
                cliente.setIdPersona(rs.getInt(1));
                cliente.setNombrePersona(rs.getString(2));
                cliente.setTelefonoPersona(rs.getString(3));
                cliente.setIdTarjetaAfiliacion(rs.getInt(4));
                cliente.setSaldoTarjeta(rs.getDouble(5));
            }
        } catch (Exception e) {
            System.out.println("No se pudo mostrar el registro "+e);
        }
        finally{
            if (conexion!=null) {
                conexion.cerrar();
            }
        }
        return cliente;
    }
}
