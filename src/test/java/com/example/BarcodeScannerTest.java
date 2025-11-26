package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BarcodeScannerTest {

    @Test
    void testSimulateScan() throws BarcodeScannerException {
        BarcodeScanner barcodeScanner = new BarcodeScanner();
        String scannedData = barcodeScanner.simulateScan();
        assertNotNull(scannedData);
        assertFalse(scannedData.isEmpty());
    }

    @Test
    void testScanBarcodeFromImage_ValidImage() {
        BarcodeScanner barcodeScanner = new BarcodeScanner();
        String imagePath = "src/test/resources/barcode.png"; // Replace with a valid path
        try {
            String scannedData = barcodeScanner.scanBarcodeFromImage(imagePath);
            assertNotNull(scannedData);
            assertFalse(scannedData.isEmpty());
        } catch (BarcodeScannerException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testScanBarcodeFromImage_InvalidImage() {
        BarcodeScanner barcodeScanner = new BarcodeScanner();
        String imagePath = "src/test/resources/invalid_barcode.png"; // Replace with a valid path
        assertThrows(BarcodeScannerException.class, () -> {
            barcodeScanner.scanBarcodeFromImage(imagePath);
        });
    }

    @Test
    void testScanBarcodeFromImage_NoBarcodeFound() {
        BarcodeScanner barcodeScanner = new BarcodeScanner();
        String imagePath = "src/test/resources/no_barcode.png"; // Replace with a valid path
        assertThrows(BarcodeScannerException.class, () -> {
            barcodeScanner.scanBarcodeFromImage(imagePath);
        });
    }

    @Test
    void testScanBarcodeFromImage_IOException() {
        BarcodeScanner barcodeScanner = new BarcodeScanner();
        String imagePath = "src/test/resources/nonexistent_image.png"; // Replace with a valid path
        assertThrows(BarcodeScannerException.class, () -> {
            barcodeScanner.scanBarcodeFromImage(imagePath);
        });
    }
}