package creational.singleton;

public class SumSingleton {
    private static volatile SumSingleton sumSingleton = null;

    public static int sum = 0;

    private SumSingleton(){
        if(sumSingleton!=null){
            throw new RuntimeException("Use getSumSingleton() to create a sum.");
        }
    }

    public static SumSingleton getSumSingleton(){
        if(sumSingleton == null){ // lazy loading. It is created only when we need it.
            synchronized (SumSingleton.class){
                if(sumSingleton==null){
                    sumSingleton = new SumSingleton();
                    System.out.println("The sum when we create object = "+sum);
                }
            }
        }
        return sumSingleton;
    }
}
