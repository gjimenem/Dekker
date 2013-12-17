package absis;

public class Proces {
	
	  private Inter comptador;
	  public int id;
	  Mutex m;  
	  
	  public Proces(Inter comptador, Mutex m, int id){  
		    this.comptador = comptador;  
			this.m = m;
			this.id=id;
		  }  
		

}
