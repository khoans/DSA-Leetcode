package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example54;

// Usage: SignatureAbstractFactory factory = new DSFactory(); Signer signer = factory.createSigner(); byte[] signature = signer.sign("document");

public class Runner {
    public static void main(String[] args) {
        SignatureAbstractFactory factory = new DSFactory();
        Signer signer = factory.createSigner();
        Verifier verifier = factory.createVerifier();

        String data = "Important Document";
        byte[] signature = signer.sign(data);
        boolean isValid = verifier.verify(signature, data);

        System.out.println("Signature valid: " + isValid);
    }
}
