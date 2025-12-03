import java.util.ArrayList;

public class Box{
    ArrayList<Thing>contents= new ArrayList<>();
    Box(){
        System.out.println("Box créée !");
    }

public void add(Thing truc){
    contents.add(truc);
    }
}