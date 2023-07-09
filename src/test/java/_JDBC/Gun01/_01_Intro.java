package _JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void test1() throws SQLException {

        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";


        //connection açılıyor, fileInputStream
        Connection connection = DriverManager.getConnection(hostUrl, username, password); //bağlantıya click

        //sql lerin yazılacağı sayfa
        Statement statement = connection.createStatement(); //sorguları çalıştırmak için sorgu gönderme ortamı

        //sorguyu yazdım ve çalıştırdım
        ResultSet resultSet = statement.executeQuery("select * from customer"); //sorgu çalıştı sonuçları nerede? --> resultset

        //hangi satırı istiyorsun?
        resultSet.next(); // sıradaki ilk satıra gitti
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        System.out.println("1.Müşterinin adı ve soyadı= "+ firstName+" "+lastName);

        //tekrar nwxt kullanmak bir sonraki satıra geçer
        resultSet.next(); // sıradaki ilk satıra gitti
        String firstName1 = resultSet.getString("first_name");
        String lastName1 = resultSet.getString("last_name");
        System.out.println("2.Müşterinin adı ve soyadı= "+ firstName1+" "+lastName1);

        connection.close();




    }
}
