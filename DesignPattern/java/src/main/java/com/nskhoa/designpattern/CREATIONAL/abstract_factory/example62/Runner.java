package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example62;

public class Runner {
    public static void main(String[] args) {
        IOAbstractFactory textFactory = new TextFactory();
        Reader textReader = textFactory.createReader();
        Writer textWriter = textFactory.createWriter();
        String textData = textReader.read("file.txt");
        textWriter.write(textData, "file.txt");

        IOAbstractFactory binaryFactory = new BinaryFactory();
        Reader binaryReader = binaryFactory.createReader();
        Writer binaryWriter = binaryFactory.createWriter();
        String binaryData = binaryReader.read("file.bin");
        binaryWriter.write(binaryData, "file.bin");
    }
}
