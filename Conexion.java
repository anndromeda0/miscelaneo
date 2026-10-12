
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  *
 *   * @author frgarciav
 clase para consultar informacion desde una base en sql server y convertir los datos a un arreglo de tipo json
 *    */
public class Conexion {

   public static void main(String[] args) throws SQLException {
           String server = "MEGANG-474\\NTSPSIGME2019";
           String DB = "SigmeIndicadores";
           String password = "";
           String user = "";
           Connection cn=null;

   try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url ="jdbc:sqlserver://"+ server + ";database=" + DB + ";integratedSecurity=false;encrypt=false;trustServerCertificate=false;";
           cn = DriverManager.getConnection(url, user, password);
           PreparedStatement stmt = cn.prepareStatement("select * from sigmeindicadores.dbo.TablaFinalHtml");
           ResultSet rs = stmt.executeQuery();
        try(PrintWriter out= new PrintWriter(new FileWriter("salida"))){
           while(rs.next()){
                   out.print("[" + rs.getString("region") + "," + rs.getString("Cluster") + "," + rs.getString("Sucursal") +"," + rs.getString("Contrato") +","+ rs.getString("clasif") + "," +rs.getString("tipificacion") + "," + rs.getString("proyectos") + "," + rs.getString("rangos") +"," + rs.getString("mes") + "," + rs.getString("suscriptores")+ "]"+"," );
           }
        }

           cn.close();
           System.out.println(url);
    } catch(ClassNotFoundException ex){
            ex.printStackTrace();
    }
   catch(IOException e){
           e.printStackTrace();
    }
           System.out.println(cn);

    }

}
