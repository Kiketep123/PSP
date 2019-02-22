```java




	import java.io.Serializable;
import java.util.Scanner;

	public class Mensaje implements Serializable {
	    private static final long serialVersionUID = -5399605122490343339L;
	    public static Scanner lector =new Scanner(System.in);
	    private Integer A;
	    private Integer B;
	    private Integer Result; 

	    public Mensaje(Integer firstNumber, Integer secondNumber ){
	        this.A = firstNumber; 
	        this.B = secondNumber;
	    }

	    public Integer getA() {
	        return A;
	    }

	    public Integer getB() {
	        return B;
	    }

	    public void setResult(Integer X)  {
	        Result = X;
	    }
	    public static   void Calculos(Mensaje m) {
	    	System.out.println("Introduce los valores con los que deseas operar :");
	    	int val1=lector.nextInt();
	    	int val2=lector.nextInt();
	    	
	    	System.out.println("Que deseas hacer con estos valores ?\n1.Multiplicarlos\n.Calcluar la potencia de b sobre a \n3.Dividirlos.");
	    	int tria =lector.nextInt();
	    	
	    	switch(tria) {
	    	case 1:
	    		 m.setResult(new Integer(val1*val2));
	    		
	    		break;
	    	case 2:
	    		m.setResult(new Integer((int) Math.pow(val1,val2)));
	    		break;
	    	case 3:
	    		m.setResult(new Integer(val1/val2));
	    		break;
	    	
	    	
	    	}
}
	}


´´´
