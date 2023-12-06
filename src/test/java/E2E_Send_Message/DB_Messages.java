package E2E_Send_Message;

import org.junit.Assert;
import org.junit.Test;
import pojos.MessagePojo;

import java.sql.*;

public class DB_Messages {
    MessagePojo expected;
    Connection connection;
    Statement statement;
    @Test
    public void Data_baglantisini_kur() throws SQLException {
        Connection connection= DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunna_user","medunna_pass_987");

        statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from cmessage where id = 393476");
        resultSet.next();

        expected=new MessagePojo(393476,"name","email@email.com","subject","mesaj");
        Assert.assertEquals(expected.getName(),resultSet.getString("name"));
        Assert.assertEquals(expected.getEmail(),resultSet.getString("email"));
        Assert.assertEquals(expected.getSubject(),resultSet.getString("subject"));
        Assert.assertEquals(expected.getMessage(),resultSet.getString("message"));









    }
}
