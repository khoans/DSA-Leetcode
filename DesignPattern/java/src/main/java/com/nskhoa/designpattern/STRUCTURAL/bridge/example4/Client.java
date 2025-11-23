package com.nskhoa.designpattern.STRUCTURAL.bridge.example4;

public class Client {
    public static void main(String[] args) {
        DocumentFormatter pdfFormatter = new PDFFormatter();
        Document invoice = new InvoiceDocument(pdfFormatter, "Invoice Data");
        invoice.generate();

        DocumentFormatter htmlFormatter = new HTMLFormatter();
        Document htmlInvoice = new InvoiceDocument(htmlFormatter, "HTML Invoice Data");
        htmlInvoice.generate();
    }
}
