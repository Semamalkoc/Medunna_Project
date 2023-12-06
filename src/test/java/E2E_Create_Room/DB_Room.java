package E2E_Create_Room;

import org.junit.Assert;
import org.junit.Test;
import pojos.ResponseRoomPojo;

import java.sql.*;


public class DB_Room {

    Connection connection;
    Statement statement;

    @Test
    public void Data_baglantisini_kur() throws SQLException {

       connection=DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunna_user","medunna_pass_987");
       statement=connection.createStatement();

        ResponseRoomPojo expected=new ResponseRoomPojo("team87_admin","2022-07-20 13:11:57.269192",130664,151,"DELUXE",true,170,"t");

        ResultSet resultSet=statement.executeQuery("select * from room where id=130664");
        resultSet.next();

        Assert.assertEquals(expected.getCreatedBy(),resultSet.getString("created_by"));
        Assert.assertEquals(expected.getCreatedDate(),resultSet.getString("created_date"));
        Assert.assertEquals(expected.getId(),resultSet.getInt("id"));
        Assert.assertEquals(expected.getRoomNumber(),resultSet.getInt("room_number"));
        Assert.assertEquals(expected.getRoomType(),resultSet.getString("room_type"));
        Assert.assertEquals(expected.getPrice(),resultSet.getInt("price"));





    }
}
