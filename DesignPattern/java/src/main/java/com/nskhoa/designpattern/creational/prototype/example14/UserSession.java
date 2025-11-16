package com.nskhoa.designpattern.creational.prototype.example14;

public class UserSession implements Cloneable{
    private String userId;
    private String authToken;

    public UserSession(String userId, String authToken) {
        this.userId = userId;
        this.authToken = authToken;
    }

    public UserSession clone() {
        try {
            return (UserSession) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        UserSession originalSession = new UserSession("user123", "token_abc");

        UserSession clonedSession = originalSession.clone();

        System.out.println("Original Session User ID: " + originalSession.userId);
        System.out.println("Cloned Session User ID: " + clonedSession.userId);
    }
}
