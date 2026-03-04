package excercise;

import utils.ScannerUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Exercise3 {
    // Date -> String ()
    public static void main(String[] args) throws ParseException {
        Date date = new Date(); // Khởi tạo 1 giá trị Date
        SimpleDateFormat formatter = new SimpleDateFormat("DD");
        // Ngày: dd(Ngày trong tháng) || DD (Ngày trong năm)
        // tháng: MM
        // năm: yyyy
        // giờ: hh (12h) || HH (24h)
        // phút: mm
        // giây: ss
        String dateStr = formatter.format(date);
        System.out.println(dateStr);

        // 02/03/2026 19:59:15
        // 02-03-2026 19:59:15

        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Mời bạn nhập vào ngày với định dạng: dd-MM-yyyy HH:mm:ss");
//        String dateStr2 = ScannerUtils.inputString();
//        Date date2 = formatter2.parse(dateStr2);
//        System.out.println(date2);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Instant instant = Instant.now();

    }
}
