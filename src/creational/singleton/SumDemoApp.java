package creational.singleton;

public class SumDemoApp {
    public static void main(String args[]){
        // create a sum
        SumSingleton sumSingleton = SumSingleton.getSumSingleton();
        sumSingleton.sum += 1;
        System.out.println("sumSingleton before anotherSumSingleton is created = "+sumSingleton.sum);

        // create and another
        SumSingleton anotherSumSingleton = SumSingleton.getSumSingleton();
        anotherSumSingleton.sum += 1;
        System.out.println("anotherSumSingleton is created = "+anotherSumSingleton.sum);


        System.out.println("both are now created. sumSingleton = "+sumSingleton.sum+ " and anotherSumSingleton = "+anotherSumSingleton.sum);//check the sum

        if(sumSingleton==anotherSumSingleton){
            System.out.println("They are the same. Use a reference to the same object.");
        }
    }
}
