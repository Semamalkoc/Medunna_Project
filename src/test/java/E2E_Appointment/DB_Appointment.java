package E2E_Appointment;

import org.junit.Assert;
import org.junit.Test;
import pojos.AppointmentPojo;
import pojos.MessagePojo;
import pojos.ResponseRoomPojo;

import java.sql.*;

public class DB_Appointment {
    ResultSet resultSet;
    Connection connection;
    Statement statement;


    @Test
    public void Data_baglantisini_kur() throws SQLException {
        connection=DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunna_user","medunna_pass_987");
        statement=connection.createStatement();

        AppointmentPojo expected=new AppointmentPojo("anonymousUser","2022-01-01 14:07:54.214439",4671,"2022-12-08 00:00:00","2022-12-08 01:00:00","PENDING","","","","","");

        ResultSet resultSet=statement.executeQuery("select * from appointment where id=4671");
        resultSet.next();
        Assert.assertEquals(expected.getCreatedBy(),resultSet.getString("created_by"));
        Assert.assertEquals(expected.getCreatedDate(),resultSet.getString("created_date"));
        Assert.assertEquals(expected.getId(),resultSet.getInt("id"));
        Assert.assertEquals(expected.getStartDate(),resultSet.getString("start_date"));
        Assert.assertEquals(expected.getEndDate(),resultSet.getString("end_date"));
        Assert.assertEquals(expected.getStatus(),resultSet.getString("status"));




    }
}
