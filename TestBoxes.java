import org.junit.*;
import static org.junit.Assert.*;

public class TestBoxes{
    @Test 
    public void testBoxCreate(){
        Box b =new Box();
    }
    @Test
    public void testBoxAdd(){
        
        Box b =new Box();
        Thing truc1 =new Thing("truc1");
        Thing truc2 =new Thing("truc2");
        Thing truc3 =new Thing("truc3");
       
        b.add(truc1);
        b.add(truc2);
        b.contains(truc1);
        
    }
}