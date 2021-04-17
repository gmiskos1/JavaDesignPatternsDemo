package creational.builder;

public class BuilderDemoApp {

    public static void main(String args[]){
        CrepaBuilder.Builder builder = new CrepaBuilder.Builder();
        builder.mushrooms("mushrooms").mayonnaise("mayonnaise");

        CrepaBuilder crepa = builder.build();

        System.out.println(crepa.toString());
    }
}
