package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Tree> trees = new HashMap<String, Tree>();

    public Registry(){
        createForest();
    }

    public Tree plantTree(String type){
        Tree tree = null;
        try{
            tree = (Tree)(trees.get(type)).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return tree;
    }

    private void createForest() {
        PlaneTree plane  = new PlaneTree();
        plane.setLatitude(34.03943);
        plane.setLongitude(34.03943);
        trees.put("PlaneTree", plane);

        FirTree fir = new FirTree();
        fir.setLatitude(45.342342);
        fir.setLongitude(45.345345);
        trees.put("FirTree", fir);
    }
}
