package haaall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class HalldaFama {
	
	ArrayList<Player> players = new ArrayList<Player>();
	
	public ArrayList<Player> top10(){
		if(players.size() == 0)
			doGambiDoProf();
			return players;     
	}

	public void push(Player player){
		players.add(player);
		Collections.sort(players, new Comparator<Player>() {
			public int compare (Player player1, Player player2){
				return player2.getScore() - player1.getScore();
			}
		});
		
		if(players.size() == 11){
			players.remove(10);
		}
        }
		
		private void doGambiDoProf() {
			players.add(new Player());
			players.get(0).setNome("Ninguém jogou ainda");
			
		}
		
	}


