package com.nskhoa.designpattern.CREATIONAL.builder.example2;

public class Resume {
    private String name;
    private String education;
    private String experience;

    private Resume(Builder builder) {
        this.name = builder.name; this.education = builder.education; this.experience = builder.experience;
    }

    public static class Builder {
        private String name;
        private String education;
        private String experience;

        public Builder name(String name) {
            this.name = name; return this;
        }

        public Builder education(String edu) {
            this.education = edu; return this;
        }

        public Builder experience(String exp) {
            this.experience = exp; return this;
        }

        public Resume build() {
            return new Resume(this);
        }
    }

    public static void main(String[] args) {
        Resume resume = new Resume.Builder()
                .name("John Doe")
                .education("B.Sc. in Computer Science")
                .experience("5 years in Software Development")
                .build();
        System.out.println("Name: " + resume.name);
        System.out.println("Education: " + resume.education);
        System.out.println("Experience: " + resume.experience);
    }
}
