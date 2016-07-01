package prgitejemplo;

/* @creator: jcspres, @colaborador: io-space */

public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("insertado por alumno2"); //  modificado por alumno 2
    }
    
    public void metodoComunitario(){
        int i = 0;
	System.out.println("Aqui escribimos todos");
	// modificaciones alumno 2
	System.out.println("Alumno 2 inserta esta sentencia");
	while(i>12) {
	   System.out.println("Este bucle no sirve para nada.");
	}
    }
    public void testGitAux(){
	// metodo rama testing
        System.out.println("Metodo de testing");
    }
    public void helper(){
	// el alumno 2 ha creado este procedimiento
	System.out.println("Hola, soy el alumno 2");
    }
}
