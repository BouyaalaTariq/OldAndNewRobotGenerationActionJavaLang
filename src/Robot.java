
public class Robot {

	public Robot(String nom, int x, int y, DIRECTION direction) {
		super();
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public Robot(String nom) {
		
		this.nom = nom;
		x=0;
		y=0;
		direction=direction.EAST;
	}

	private String nom;
	private int x,y;
	private DIRECTION direction;

	
	public void avance(){
		
		switch (direction) {
		
		case NORD: 
			x++;
			break;
			
		case SUD:
			x++;
				break;
		
		case EAST:
			y++;
			break;
			
		case WEST:
			y++;
			break;  }
		
		}

	public void droite() {
		
		switch (direction) {


		case EAST:
		
		direction=direction.WEST;
			break;
			
			
		case WEST:
			
			direction=direction.EAST;
			break;
			
		case NORD:
			
			direction=direction.SUD;
			break;
			
		case SUD:	
		
			direction=direction.NORD;
			
			break;
			
			
		}
	}
	
	
	public void afficher() {
		
		System.out.println(" le Nom du Robot" +nom);
		System.out.println(" les coordonnées du Robot (" +x+ " " +y+ ")" );
		System.out.println(" la Direction du Robot" + "  " + direction.toString());
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public DIRECTION getDirection() {
		return direction;
	}

	public void setDirection(DIRECTION direction) {
		this.direction = direction;
	}
	
	
}
