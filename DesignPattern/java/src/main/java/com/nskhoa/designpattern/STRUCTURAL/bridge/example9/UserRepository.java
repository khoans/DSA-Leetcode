package com.nskhoa.designpattern.STRUCTURAL.bridge.example9;

public class UserRepository extends Repository {
    UserRepository(DataStorage storage) {
        super(storage);
    }

    public void saveData(String data) {
        storage.save(data);
    }
}
