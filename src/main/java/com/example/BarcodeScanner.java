package com.example;

import com.google.zxing.*;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BarcodeScanner {

    public String scanBarcode(String imagePath) throws BarcodeScannerException {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
            LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            Result result = new MultiFormatReader().decode(bitmap);
            return result.getText();

        } catch (NotFoundException e) {
            throw new BarcodeScannerException("No barcode found in the image.");
        } catch (IOException e) {
            throw new BarcodeScannerException("Error reading the image file: " + e.getMessage());
        } catch (Exception e) {
            throw new BarcodeScannerException("Error during barcode scanning: " + e.getMessage());
        }
    }

    public String simulateScan() throws BarcodeScannerException {
        // Simulate a barcode scan.  In a real application, this would
        // involve capturing an image from a camera and processing it.
        // For this example, we'll just return a sample barcode value.
        String simulatedBarcode = "1234567890";
        System.out.println("Simulating barcode scan...");
        return simulatedBarcode;
    }

    public String scanBarcodeFromImage(String imagePath) throws BarcodeScannerException {
      try {
          BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
          LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
          BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

          Result result = new MultiFormatReader().decode(bitmap);
          return result.getText();

      } catch (NotFoundException e) {
          throw new BarcodeScannerException("No barcode found in the image.");
      } catch (IOException e) {
          throw new BarcodeScannerException("Error reading the image file: " + e.getMessage());
      } catch (Exception e) {
          throw new BarcodeScannerException("Error during barcode scanning: " + e.getMessage());
      }
    }
}