package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        // önce exeli açarım, sheete ulaşırım
        // işlemlerimi eklerim (hafızada)
        // yazma modunda açıp , hafızadaki işlemleri kaydederim.

        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        // HAFIZADA işlemlere devam ediyorum.
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0);

        Row yeniSatir= sheet.createRow(sheet.getPhysicalNumberOfRows());  //her seferinde bir sonraki satırın 0. indexine yazma işlemi yapar.
        Cell yeniHucre= yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba Dünya");

        // Sıra kaydetmeye geldi, ama önce okuma MODUNDAN çıkıp ,
        // YAZMA moduna geçme lazım.
        inputStream.close();  // okuma modu kapatıldı.

        // yazma modunda açtım.
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);  // SAVE işlemi yapıldı
        workbook.close();  // hafızayı boşalt
        outputStream.close();  // hafızayı boşalt.

        System.out.println("yazma işlemi yapıldı.");

    }
}
