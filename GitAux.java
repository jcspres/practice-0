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
        System.out.println("Aqui escribimos todos");
	// modificaciones alumno 2
	System.out.println("Alumno 2 inserta esta sentencia");
    }
    public void testGitAux(){
	// metodo rama testing
        System.out.println("Metodo de testing");
    }
}
