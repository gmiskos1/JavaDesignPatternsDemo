package creational.singleton;

public class SingletonDemoApp {
    public static void main(String args[]){
        // create a session
        SessionSingleton sessionSingleton = SessionSingleton.getSession();

        // create and another
        SessionSingleton anotherSessionSingleton = SessionSingleton.getSession();

        System.out.println(sessionSingleton);//check the address
        System.out.println(anotherSessionSingleton); // check the address

        if(sessionSingleton==anotherSessionSingleton){
            System.out.println("They are the same. Use a reference to the same object.");
        }
    }
}
