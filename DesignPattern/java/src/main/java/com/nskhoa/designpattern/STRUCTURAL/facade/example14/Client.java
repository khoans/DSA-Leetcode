package com.nskhoa.designpattern.STRUCTURAL.facade.example14;

class AccountManager {
    void login() { System.out.println("Logging in user account"); }
}
class PostManager {
    void createPost() { System.out.println("Creating post"); }
}
class InteractionManager {
    void interact() { System.out.println("Managing user interactions"); }
}

class SocialMediaFacade {
    private AccountManager account = new AccountManager();
    private PostManager postManager = new PostManager();
    private InteractionManager interaction = new InteractionManager();

    void usePlatform() {
        account.login();
        postManager.createPost();
        interaction.interact();
    }
}

public class Client {
    public static void main(String[] args) {
        SocialMediaFacade facade = new SocialMediaFacade();
        facade.usePlatform();
    }
}
