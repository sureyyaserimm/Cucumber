package _JDBC.Gun01;

import _JDBC.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBC_Parent {

    @Test
    public void textNextPrev() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next(); //ilk satir 1.satir
        System.out.println("1. satir dil adı=" + rs.getString(2)); //2 column sırası English

        rs.next(); //2.satır
        System.out.println("2. satir dil adı=" + rs.getString(2)); //italian

        rs.next(); //3.satır
        System.out.println("3. satir dil adı=" + rs.getString(2)); //japanese

        rs.previous(); //2.satır
        System.out.println("2. satir dil adı=" + rs.getString(2)); //italian

    }

        @Test
        public void AbsoluteRelative () throws SQLException{

        ResultSet rs=statement.executeQuery("select * from film");

//        rs.next(); --> sonraki satır
//        rs.previous(); --> önceki satır
//        rs.absolute(10) --> baştan itibaren 10.satıra gider
//        rs.relative(10); --> bulunduğu yerden 10 satır gider
//        rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
//        rs.relative(-5) :  - (eksi) bulundu yerden 5 satır geri

            rs.absolute(10); //10.satıra git
            System.out.println("10.satır - title = " + rs.getString("title"));

            //rs.absolute(5); //5.satıra giderdi

            rs.relative(5); //15.satıra gider. Çünkü en son bulubdupu yerden 5 satır ileriye gider.
            System.out.println("15.satır - title = " + rs.getString("title"));

            rs.absolute(-10); //10.satıra git
            System.out.println("sondan 10.satır - title = " + rs.getString("title"));





    }

}
