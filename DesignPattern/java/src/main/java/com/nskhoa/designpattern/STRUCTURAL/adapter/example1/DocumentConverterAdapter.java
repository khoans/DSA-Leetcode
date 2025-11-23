package com.nskhoa.designpattern.STRUCTURAL.adapter.example1;

// Adapter that delegates based on format
public class DocumentConverterAdapter implements DocumentConverter {
    private PDFConverter pdfConverter = new PDFConverter();
    private DOCXConverter docxConverter = new DOCXConverter();
    private TXTConverter txtConverter = new TXTConverter();

    public void convert(String filePath) {
        if (filePath.endsWith(".pdf")) {
            pdfConverter.convertPDF(filePath);
        }
        else if (filePath.endsWith(".docx")) {
            docxConverter.convertDOCX(filePath);
        }
        else if (filePath.endsWith(".txt")) {
            txtConverter.convertTXT(filePath);
        }
        else {
            System.out.println("Unsupported format");
        }
    }
}
