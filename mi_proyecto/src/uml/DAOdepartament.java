
package uml;

import java.util.ArrayList;
import java.sql.*;

public class DAOdepartament {
    
    Departament depa = new Departament();
    Database db = new Database();
    
    public ArrayList<Object[]>listar(){
        ArrayList<Object[]> datos = new ArrayList<>();
        
        Connection con; 
        PreparedStatement pst; 
        ResultSet rs;
        ResultSetMetaData meta;
        
        String sql = "select * from departament";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
            
            pst = con.prepareStatement(sql);
            
            
            rs= pst.executeQuery();
            meta= rs.getMetaData(); 
            
           
            while (rs.next()){
                Object[] fila = new Object[meta.getColumnCount()]; 
                
                for(int i=0; i<fila.length; i++){
                    fila[i] = rs.getObject(i+1);
                }
                
                datos.add(fila);
            }
            rs.close();
        } catch (Exception e) {
            
        }
        
        return datos;
    }
        
        public String insertar( Object obj){
        Departament depa = (Departament) obj; 
     
        String respuesta;
        Connection con;
        PreparedStatement pst;
        String sql="insert into departament values(?,?,?,?)";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
            
            pst = con.prepareStatement(sql); 
            pst.setInt(1, depa.getIddepartament());
            pst.setString(2, depa.getDepartament_name());
            pst.setString(3, depa.getAddress());
            pst.setInt(4, depa.getPhonnumber()); 
           
            
            
            int registros = pst.executeUpdate();
            respuesta = registros + "Ingresados exitosamente";
        } catch (Exception e) {
           respuesta = e.getMessage();
        }
         return respuesta;
    }
    
    public String eliminar(Object obj){
         Departament depa = (Departament) obj; 
        
        String respuesta;
        Connection con;
        PreparedStatement pst;
        String sql="delete from departament where iddepartament=? ";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
            
            pst = con.prepareStatement(sql);  
            pst.setInt(1, depa.getIddepartament());
           
            
            
           
            int registros = pst.executeUpdate();
            respuesta = registros + "Eliminado exitosamente";
        } catch (Exception e) {
           respuesta = e.getMessage();
        }
         return respuesta;
    }
    
    public String modificar(Object obj){
     Departament depa = (Departament) obj; 
        
        String respuesta;
        Connection con;
        PreparedStatement pst;
        String sql="update departament set departament_name=?, address=?, phonnumber=? where iddepartament=?";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
            
            pst = con.prepareStatement(sql); 
           
            pst.setString(1, depa.getDepartament_name());
            pst.setString(2, depa.getAddress());
            pst.setInt(3, depa.getPhonnumber()); 
            pst.setInt(4,depa.getIddepartament());
            
            
            
            int registros = pst.executeUpdate();
            respuesta = registros + "Modificados exitosamente";
        } catch (Exception e) {
           respuesta = e.getMessage();
        }
         return respuesta;
    }
    public ArrayList<Object[]>filtrar(String criterio){
        ArrayList<Object[]> datos = new ArrayList<>();
        
        Connection con; 
        PreparedStatement pst; 
        ResultSet rs;
        ResultSetMetaData meta;
        
        String sql = "select * from departament where departament_name like'%"+criterio+"%'";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
            
            pst = con.prepareStatement(sql);
            
            
            rs= pst.executeQuery();
            meta= rs.getMetaData(); 
            
           
            while (rs.next()){
                Object[] fila = new Object[meta.getColumnCount()]; 
                
                for(int i=0; i<fila.length; i++){
                    fila[i] = rs.getObject(i+1);
                }
                
                datos.add(fila);
            }
            rs.close();
        } catch (Exception e) {
            
        }
        
        return datos;
    }
    }

