package jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public static Connection doConnect()
    {
        String url,user_id,pass,q;
        url="jdbc:oracle:thin:hr/hr@localhost:1521:XE";
        user_id="jdbc";
        pass="123";
        Connection con=null;
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

}
