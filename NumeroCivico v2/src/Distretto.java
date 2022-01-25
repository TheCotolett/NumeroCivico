
public class Distretto {
	private Scuola arrayScuola[];
	private Plesso arrayPlesso[];
	
	
	public Distretto(int dim) {
		this.arrayScuola = new Scuola[dim];
		this.arrayPlesso = new Plesso[dim];
	}
	public Distretto(Distretto distretto) {
		for(int i=0; i<distretto.getArrayPlesso().length; i++) {
			this.arrayScuola[i]=distretto.getPlessoInPosition(i);
		}
		for(int i=0; i<distretto.getArrayScuola().length; i++) {
			this.arrayScuola[i]=distretto.getScuolaInPosition(i);
		}
	}
	public Plesso getPlessoInPosition(int i) {
		return arrayPlesso[i];
	}
	public Scuola getScuolaInPosition(int i) {
		return arrayScuola[i];
	}
	public void setPlessoInPosition(int i, Plesso p) {
		this.arrayPlesso[i]=p;
	}
	public void setScuolaInPosition(int i, Scuola s) {
		 this.arrayScuola[i]=s;
	}
	public Plesso[] getArrayPlesso() {
		return arrayPlesso;
	}
	public Scuola[] getArrayScuola() {
		return arrayScuola;
	}
	public void setArrayPlesso(Plesso[] arrayPlesso) {
		this.arrayPlesso = arrayPlesso;
	}
	public void setArrayScuola(Scuola[] arrayScuola) {
		this.arrayScuola = arrayScuola;
	}
	public void eraseScuolaInPosition(int i) {
		this.arrayScuola[i]=null;
	}
	public void erasePlessoInPosition(int i) {
		this.arrayPlesso[i]=null;
	}
	public void printAllDistretto() {
		for(int i=0; i<arrayPlesso.length; i++) {
			if(arrayPlesso[i]!=null)
				System.out.print("\n"+arrayPlesso[i].getVia()+" n."+arrayPlesso[i].getCivico()+" piani:"+arrayPlesso[i].getPiani());
		}
		for(int i=0; i<arrayScuola.length; i++) {
			if(arrayScuola[i]!=null)
				System.out.print("\n"+arrayScuola[i].getVia()+" n."+arrayScuola[i].getCivico());
		}
	}
	
	
}
	