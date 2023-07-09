package _JDBC.Gun01;

import _JDBC.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowGetType extends JDBC_Parent {

    @Test
    public void test1() throws SQLException{

        ResultSet rs= statement.executeQuery("select city from city");

        rs.last();
        System.out.println("son şehir adı = " + rs.getString(1));

        rs.first();
        System.out.println("ilk şehir adı = " + rs.getString(1));


        rs.last();
        int kacinciSatirdayim=rs.getRow();
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);


    }
}
