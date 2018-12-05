# Actividad_3_Java
Programa donde se ve la herencia
```java



public class Empleado {
String Nombre;


public String toString() {
	return "Empleado :" + Nombre;
}
public Empleado() {}
public Empleado(String nombre) {
	this.Nombre=nombre;
}
public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}
}



public class Directivo extends Empleado {
public Directivo() {
	
}
public Directivo(String nombre) {
	super(nombre);
}
	
	public String toString() {
		
		return super.toString()+ "-->"+"Directivo";
	}
}


public class Operario extends Empleado {
public Operario(String nombre) {
	super(nombre);
}
public String toString() {
		
		return super.toString()+ "-->"+"Operario";
	}
}




public class Oficial extends Operario{
	
public Oficial(String nombre) {
		super(nombre);
		
	}

public String toString() {
		
		return super.toString()+ "-->"+"Oficial";
	}
}




public class Tecnico extends Operario {
public String toString() {
		
		return super.toString()+ "-->"+"Tecnico";
	}

	public Tecnico(String nombre) {
		
		super(nombre);

	}
	

		}

public class mainActividad3 {
	public static void main(String[] args){
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}


}








```
