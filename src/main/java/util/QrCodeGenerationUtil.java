/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class QrCodeGenerationUtil {

    public static void generateQrCode(String data) {
        try {
            // Đường dẫn tương đối tới thư mục "src/main/resources/QR_Code"
            Path path = Paths.get("src", "main", "resources", "QR_Code", data + ".jpg");

            // Tạo mã QR với kích thước 500x500
            BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 500, 500);

            // Ghi mã QR ra file ảnh
            MatrixToImageWriter.writeToPath(matrix, "jpg", path);

            System.out.println("QR code generated and saved to " + path.toAbsolutePath());

        } catch (WriterException | IOException ex) {
            System.out.println("Loi generate qr code");
        }
    }
}
