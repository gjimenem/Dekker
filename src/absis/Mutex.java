package absis;

public class Mutex {
	volatile boolean enter0, enter1;
	volatile int turn;
	protected void entra_zc() { 
		if(((Proces)Thread.currentThread()).id==0) {		
			enter0=true;
			while(enter1) {
				if(turn==1) {
					enter0=false;
					while(turn==1){;}
					enter0=true;
				}
			}
		}
		else {
			enter1=true;
			while(enter0) {
				if(turn==0) {
					enter1=false;
					while(turn==0){;}
					enter1=true;
				}
			}
		}		
	}

	protected void surt_zc() {
		if(((Proces)Thread.currentThread()).id==0) {		
			enter0=false;
			turn=1;
		}
		else {
			enter1=false;
			turn=0;
		}
		
		
	}

}
