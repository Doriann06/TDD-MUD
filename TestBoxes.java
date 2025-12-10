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
        assertTrue( b.contains(truc1));
        assertTrue( b.contains(truc2));
        assertFalse(b.contains(truc3));
        
    }
    @Test (expected =  RuntimeException.class)
    public void testBoxRemove(){
        
        Box b =new Box();
        Thing truc1 =new Thing("truc1");
        Thing truc2 =new Thing("truc2");
        Thing truc3 =new Thing("truc3");
       
        b.add(truc1);
        b.add(truc2);
        b.remove(truc2);
        assertTrue( b.contains(truc1));
        assertFalse(b.contains(truc2));
        assertFalse(b.contains(truc3));
        b.remove(truc3);
    
        
    }
    @Test
    public void testBoxOpen(){
        Box b =new Box();
        Thing truc1 =new Thing("truc1");
        Thing truc2 =new Thing("truc2");
        Thing truc3 =new Thing("truc3");
        assertTrue(b.isOpen());
        b.close();
        assertFalse(b.isOpen());
        b.open();
        assertTrue(b.isOpen());
    }
    @Test
    public void testActionLook(){
        Box b =new Box();
        Thing truc1 =new Thing("truc1");
        Thing truc2 =new Thing("truc2");
        Thing truc3 =new Thing("truc3");
       
        b.add(truc1);
        b.add(truc2);
        assertEquals("la boite contient: truc1, truc2",b.actionLook());
        b.close();
        assertEquals("la boite est fermee",b.actionLook());
    }
}