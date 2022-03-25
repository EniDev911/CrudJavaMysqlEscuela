package conexionSQL;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionSQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela?characterEncoding=utf8", "root", "enidev911");
            JOptionPane.showMessageDialog(null, "Se ha conectado exitosamente");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión"+ e.getMessage());
        }
        return conectar;
    }
    
}
