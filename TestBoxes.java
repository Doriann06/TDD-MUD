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
        Thing truc1 =new Thing("truc1",3);
        Thing truc2 =new Thing("truc2",3);
        Thing truc3 =new Thing("truc3",3);
       
        b.add(truc1);
        b.add(truc2);
        assertTrue( b.contains(truc1));
        assertTrue( b.contains(truc2));
        assertFalse(b.contains(truc3));
        
    }
    @Test (expected =  RuntimeException.class)
    public void testBoxRemove(){
        
        Box b =new Box();
        Thing truc1 =new Thing("truc1",3);
        Thing truc2 =new Thing("truc2",3);
        Thing truc3 =new Thing("truc3",3);
       
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
        Thing truc1 =new Thing("truc1",3);
        Thing truc2 =new Thing("truc2",3);
        Thing truc3 =new Thing("truc3",3);
        assertTrue(b.isOpen());
        b.close();
        assertFalse(b.isOpen());
        b.open();
        assertTrue(b.isOpen());
    }
    @Test
    public void testActionLook(){
        Box b =new Box();
        Thing truc1 =new Thing("truc1",3);
        Thing truc2 =new Thing("truc2",3);
        Thing truc3 =new Thing("truc3",3);
       
        b.add(truc1);
        b.add(truc2);
        assertEquals("la boite contient: truc1, truc2",b.actionLook());
        b.close();
        assertEquals("la boite est fermee",b.actionLook());
    }
    @Test
    public void testVolume(){
        Thing truc1 =new Thing("truc1",3);
        Thing truc2 =new Thing("truc2",6);
        Thing truc3 =new Thing("truc3",12);
       
        assertEquals(3, truc1.getVolume());
        assertEquals(6, truc2.getVolume());
        assertEquals(12, truc3.getVolume());
    }
    @Test
    public void testCapacity(){
        Box b=new Box();
        Box b2=new Box(10);
        assertEquals(-1, b.getCapacity());
        assertEquals(10, b2.getCapacity());
    }
    @Test
    public void testHasRoomFor(){
        Box b=new Box(10);
        Box b2=new Box();
        Thing truc1 =new Thing("truc1",5);
        Thing truc2 =new Thing("truc2",6);
        Thing truc3 =new Thing("truc3",12);
        assertTrue(b.hasRoomFor(truc1));
        assertFalse(b.hasRoomFor(truc3));
        assertTrue(b2.hasRoomFor(truc3));
        b.add(truc1);
        assertFalse(b.hasRoomFor(truc2));
    }
}