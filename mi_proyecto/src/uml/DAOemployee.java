
package uml;
import java.util.ArrayList;
import java.sql.*;
public class DAOemployee {
    Employee em = new Employee();
    Database db = new Database();
    
    public ArrayList<Object[]> listar(){
        ArrayList<Object[]> datos = new ArrayList<>();
        
        Connection con;
        PreparedStatement pst; 
        ResultSet rs;
        ResultSetMetaData meta;
        String sql = "select * from employee";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(); 
            meta=rs.getMetaData(); 
            while (rs.next()){
                Object[] fila = new Object[meta.getColumnCount()]; 
                
                for (int i =0; i < fila.length; i++ ){
                    fila[i] = rs.getObject(i+1);
                }
                datos.add(fila); 
            }
            rs.close();
            
        } catch (Exception e) {
        }
        return datos;
    }
    
    public String insertar(Object obj){
        Employee emp = (Employee) obj; 
        String respuesta;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into employee values(?,?,?,?)";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            
            pst = con.prepareStatement(sql); 
            pst.setString(1,emp.getCodemployee()); 
            pst.setInt(2,emp.getIddepartament());
            pst.setString(3,emp.getFirtsname());
            pst.setString(4,emp.getLastname());
            
       
            int registros = pst.executeUpdate();
            respuesta = registros + "Registros Ingresados Exitosamente";
            
        } catch (Exception e) {
            respuesta = e.getMessage();
        }
        return "respuesta";
    }
    
    public String eliminar(Object obj){
        Employee emp = (Employee) obj; //casting el obj va a tomar una estructura de la clase empleado y la va a guardar en la variable emp
        String respuesta;
        Connection con;
        PreparedStatement pst;
        String sql = "delete from employee where codemployee=?";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            
            pst = con.prepareStatement(sql); //preparamos la consulta
            pst.setString(1,emp.getCodemployee()); //le mandamos el numero y el valor de los ?
            
            //ejecutamos la sentencia preparada
            int registros = pst.executeUpdate();
            respuesta = registros + "Registros Eliminados Exitosamente";
            
        } catch (Exception e) {
            respuesta = e.getMessage();
        }
        return "respuesta";
    }
    
    public String modificar(Object obj){
        Employee emp = (Employee) obj; //casting el obj va a tomar una estructura de la clase empleado y la va a guardar en la variable emp
        String respuesta;
        Connection con;
        PreparedStatement pst;
        String sql = "update employee set iddepartament=?, firtsname=?, lastname=? where codemployee=?";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPass());
            
              pst = con.prepareStatement(sql); 
          
            pst.setInt(1,emp.getIddepartament());
            pst.setString(2,emp.getFirtsname());
            pst.setString(3,emp.getLastname());
              pst.setString(4,emp.getCodemployee()); 
            
            //ejecutamos la sentencia preparada
            int registros = pst.executeUpdate();
            respuesta = registros + "Registros Modificados Exitosamente";
            
        } catch (Exception e) {
            respuesta = e.getMessage();
        }
        return "respuesta";
    }
     public ArrayList<Object[]>filtrar(String criterio,String campo){
        ArrayList<Object[]> datos = new ArrayList<>();
        
        Connection con; 
        PreparedStatement pst; 
        ResultSet rs;
        ResultSetMetaData meta;
        
        String sql = "select * from employee where "+campo+" like '%"+criterio+"%'";
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
