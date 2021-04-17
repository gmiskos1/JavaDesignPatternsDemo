package creational.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrototypeDemoApp {

    public static void main(String args[]){
        Registry registry = new Registry();
        List<Tree> forest = new ArrayList<>();

        PlaneTree planeTree1 = (PlaneTree) registry.plantTree("PlaneTree");
        forest.add(planeTree1);
        PlaneTree planeTree2 = (PlaneTree) registry.plantTree("PlaneTree");
        forest.add(planeTree2);
        PlaneTree planeTree3 = (PlaneTree) registry.plantTree("PlaneTree");
        forest.add(planeTree3);

        FirTree firTree1 = (FirTree) registry.plantTree("FirTree");
        forest.add(firTree1);
        FirTree firTree2 = (FirTree) registry.plantTree("FirTree");
        forest.add(firTree2);
        FirTree firTree3 = (FirTree) registry.plantTree("FirTree");
        forest.add(firTree3);

        //we can suffle.
        //we can create random forest
        //but we have a forest from only two tree objects :))
        //we are copying the prototypes. Not using the new keyword
        Collections.shuffle(forest);
        System.out.println(forest);
    }
}
