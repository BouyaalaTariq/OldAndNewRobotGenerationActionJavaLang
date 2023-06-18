public class RobotNG extends Robot {
	
	private boolean turbo;

	
	
	
	public RobotNG(String nom, int x, int y, DIRECTION direction) {
		super(nom, x, y, direction);
		turbo=false;
		 
	}
	

	public RobotNG(String nom) {
		super(nom);
		turbo=false;
		 
	}
	
	
	
	@Override
	public void avance() {
		if(turbo)  avance(3);
		else
		super.avance();
	}
	
	public void avance(int nombrePas) { 
//		for(int i=0;i<nombrePas;i++) 
	//		//avance();
		
		
		if(turbo) 
			nombrePas*=3;
		
switch (getDirection()) {
		
		case NORD: 
			setX(getX()+nombrePas);
			break;
			
		case SUD:
			setX(getX()+nombrePas);
				break;
		
		case EAST:
			setY(getY()+nombrePas);
			break;
			
		case WEST:
			setY(getY()+nombrePas);
			
			break;}
		
	}
	public void gauche() {
	//		droite();
		//	droite();
			//droite();
		
		switch (getDirection()){


		case EAST:
		
		setDirection(DIRECTION.NORD);
			break;
			
			
		case WEST:
			
		setDirection(DIRECTION.SUD);
			break;
			
		case NORD:
			
        setDirection(DIRECTION.WEST);

			break;
			
		case SUD:	
		
			setDirection(DIRECTION.EAST);
			
			break;
			
			
		}
			
	}
	public void DemiTour() {
		
	//	droite();
	//	droite();
		
		
		
		switch (getDirection()){


		case EAST:
		
		setDirection(getDirection().NORD);
			break;
			
			
		case WEST:
			
		setDirection(getDirection().EAST);
			break;
			
		case NORD:
			
        setDirection(getDirection().SUD);

			break;
			
		case SUD:	
		
			setDirection(getDirection().NORD);
			
			break;
			
			
		}
			
	}


	public boolean hasTurbo() {
		return turbo;
	}


	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	
	@Override
	public void afficher() {
		
		super.afficher();
		if (turbo) 
		System.out.println(" Turbo Activé");
		else 
		System.out.println(" Turbo désactivé");
	}

}
