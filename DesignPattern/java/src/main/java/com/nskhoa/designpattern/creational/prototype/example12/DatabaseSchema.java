package com.nskhoa.designpattern.creational.prototype.example12;

public class DatabaseSchema implements Cloneable {
    private String schemaName;
    private String[] tables;

    public DatabaseSchema(String schemaName, String[] tables) {
        this.schemaName = schemaName;
        this.tables = tables;
    }

    public DatabaseSchema clone() {
        try {
            DatabaseSchema cloned = (DatabaseSchema) super.clone();
            cloned.tables = tables.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String[] initialTables = {"Users", "Orders", "Products"};
        DatabaseSchema originalSchema = new DatabaseSchema("ECommerce", initialTables);

        DatabaseSchema clonedSchema = originalSchema.clone();
        clonedSchema.tables[0] = "Customers"; // Modify the first table in the cloned schema

        System.out.println("Original Schema Tables: ");
        for (String table : originalSchema.tables) {
            System.out.println(table);
        }

        System.out.println("Cloned Schema Tables: ");
        for (String table : clonedSchema.tables) {
            System.out.println(table);
        }
    }
}

