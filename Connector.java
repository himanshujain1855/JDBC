import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    static Connection con=null;
    public static Connection doConnect()
    {
        String url,user_id,pass;
        url="jdbc:oracle:thin:hr/hr@localhost:1521:XE";
        user_id="jdbc";
        pass="123";

        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con= DriverManager.getConnection(url,user_id,pass);
        }

        catch (ClassNotFoundException c)
        {
            c.printStackTrace();
        }

        catch (SQLException s)
        {
            s.printStackTrace();
        }
        return con;
    }

    static void doClose() throws SQLException {
        if(con!=null){
            con.close();
        }
    }

}
