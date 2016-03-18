package haaall;


public class Player {


	private String nome;
	
	private int score;
 
	public Player(String nome, int score){
		this.nome = nome;
		this.score = score;
	}
	public Player(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

}
