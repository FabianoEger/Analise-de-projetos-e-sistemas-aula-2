package haaall;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHallFama extends TestCase {
    private HalldaFama hall;
    
    @Before
    public void setUp(){
        hall = new HalldaFama();
    }
    
      @After
    public void ternDawn(){
        hall = null;
        
    }
    
    @Test
    public void testIsEmpty(){
        String expected = "Ninguém jogou ainda";
        ArrayList<Player> players = hall.top10();
        assertEquals(1, players.size());
        
        assertEquals(expected, players.get(0).getNome());
        
    }
    
    @Test
    public void testMaisDoQueDezPlayers(){
        populate(15);
        
        assertEquals(10, hall.top10().size());
        assertEquals(140, hall.top10().get(0).getScore());
        assertEquals(130, hall.top10().get(1).getScore());
        assertEquals(50, hall.top10().get(9).getScore());
    }

    @Test
    public void testRetornaMenosQueDezPlayers(){
    	populate(5);
    	 assertEquals(5, hall.top10().size());
     	
    }
  

    private void populate(int n) {
        for (int i = 0; i < n; i++) {
            hall.push(new Player("Zé",10*i));
        }
    }
    @Test
    public void testOrdenarPorData(){
        hall.push(new Player("Fabiano", 50));
        hall.push(new Player("Lucas", 60));
        hall.push(new Player("Eduardo", 50));
        
        assertEquals("Lucas", hall.top10().get(0).getNome());
        assertEquals("Fabiano", hall.top10().get(1).getNome());
        assertEquals("Eduardo", hall.top10().get(2).getNome());
    }
}

