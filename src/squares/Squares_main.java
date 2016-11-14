package squares;

public class Squares_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x[] = { 0.0 , 0.1 ,0.2 ,0.3 , 0.4 ,0.5 , 0.6 ,0.7 , 0.8 , 0.9 , 1.0 , 1.1 , 1.2 };
		double y[] = { 0.23 , 0.56 , 0.79 , 1.12 , 1.39 , 1.74 , 2.01 , 2.33 , 2.61 , 2.89 , 3.20 , 3.53 , 3.80 };
		double theta[] = new double[2];
	
		Squares_lib slib = new Squares_lib(x,y);

		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getRx());
		}

	}
}
// theta[0]=0.2269    ,    theta[1]=2.9808  by Excel