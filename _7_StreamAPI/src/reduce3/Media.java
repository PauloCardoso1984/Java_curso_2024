package reduce3;

public class Media {
	
	private double total;
	private int quantidade;
	
	// Somará as notas e a quantidade
	// Forma 1 

	public void adicionar1(double valor) {
		total += valor;
		quantidade++;
	} 
	
	// Forma 2
	public Media adicionar2(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getValor() {
		return total / quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
		
	}
}
