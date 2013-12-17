package absis;

public class Proces extends Thread{
	
	  private Inter comptador;
	  public int id;
	  Mutex m;  
	  
	  public Proces(Inter comptador, Mutex m, int id){  
		    this.comptador = comptador;  
			this.m = m;
			this.id=id;
		  }  
		
	  public void run(){  
	      final int N = 4;
		  int aux=0; 
	          for(int i = 0; i < N; i++){  
		     // protocol d'entrada a la Zona Crítica
	             m.entra_zc();
				 aux=comptador.get_valor();
	   			 aux++;
	  			 comptador.set_valor(aux);
		    // protocol de sortida de la Zona Crítica
	            m.surt_zc();   
	          }  
	  }  

}
