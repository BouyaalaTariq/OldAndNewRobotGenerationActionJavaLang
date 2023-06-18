
public class test {

	public static void main(String[] args) {
		Robot[] robots=new Robot[4];
		robots[0]= new Robot("Drone");
		robots[1]=new Robot("Drone1", 32, 11, DIRECTION.WEST);
		robots[2]=new RobotNG("Divdas", 344, 12, DIRECTION.SUD);
		robots[3]=new RobotNG(" Divdas Test ");
		
		
	/*	for(int i=0;i<robots.length;i++) {
			System.out.println(" le Robot Num " + (i+1));
			robots[i].afficher();
		}*/
		
		((RobotNG)robots[3]).setTurbo(true);	
	((RobotNG)robots[3]).avance(100);
	((RobotNG)robots[3]).DemiTour();
	((RobotNG)robots[3]).afficher();	
	}

}
