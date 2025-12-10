import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

public class Box{
    private ArrayList<Thing>contents= new ArrayList<>();
    private boolean isOpen=true;
    private int capacity=-1;
    Box(){
        System.out.println("Box créée !");
    }
    public Box (int capacity){
        this.capacity=capacity;
    }
    public void add(Thing truc){
        contents.add(truc);
        }
    public boolean contains(Thing truc){
        return this.contents.contains(truc);
    }
    public void remove(Thing truc){
        boolean ok=this.contents.contains(truc);
        if(!ok) throw new RuntimeException("remove impossible");
        contents.remove(truc);
        
    }
    public boolean isOpen(){
        return this.isOpen;
    }
    public void open(){
        this.isOpen=true;
    }
    public void close(){
        this.isOpen=false;
    }
    public String actionLook(){
        if(this.isOpen==false) return "la boite est fermee";
        else{
            String look;
            look="la boite contient: ";
            for(int i =0;i<this.contents.size();i++){
                
                look+= this.contents.get(i).getName();
                if (i!= this.contents.size()-1) look+=", ";
            }
            return look;

        }
    } 
    public int getCapacity(){
        return this.capacity;
    }
}