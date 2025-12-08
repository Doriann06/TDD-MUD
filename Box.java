import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

public class Box{
    private ArrayList<Thing>contents= new ArrayList<>();
    Box(){
        System.out.println("Box créée !");
    }

public void add(Thing truc){
    contents.add(truc);
    }
public boolean contains(Thing truc){
    return this.contents.contains(truc);
}
public void remove(Thing truc){
    contents.remove(truc);
    if(this.contents.contains(truc)==false){
        new Exception("truc n'est pas dans liste");

    }
    }
}