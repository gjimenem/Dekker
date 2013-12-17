package absis;

public class Principal {
	
	 public static void main(String[] arg){  
		    Inter comptador = new Inter();
			Mutex m = new Mutex();
		    final int M = 2;  
		    Proces processos[] = new Proces[M]; 
		    
		    for(int i = 0; i < M; i++) {
				processos[i] = new Proces(comptador, m, i); // crea el proces i�sim
				processos[i].start(); // i l'arrenca
			}
		 
		    for (int i = 0; i < M; i++) {  
		      try{  
		        processos[i].join(); //Espera la finalitzaci� del proces i�sim  
		      }catch(InterruptedException e){}  
		    }  
		 
		    System.out.println("El resultat final �s = " + comptador.get_valor());
		    
	 }
	
}
