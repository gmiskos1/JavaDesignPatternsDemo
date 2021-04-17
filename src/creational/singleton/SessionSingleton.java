package creational.singleton;

public class SessionSingleton {
    private static volatile SessionSingleton session = null; // volatile keep it thread safe

    private SessionSingleton(){
        if(session!=null){//protect from reflection
            throw new RuntimeException("Use getSession() method to create a session.");
        }
    }

    public static SessionSingleton getSession(){
        if(session == null){ // lazy loading. It is created only when we need it.
            synchronized (SessionSingleton.class){
                if(session==null){
                    session = new SessionSingleton();
                }
            }
        }
        return session;
    }
}
