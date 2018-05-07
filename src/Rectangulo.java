/**
 * @author Soledad soto
 * @version 1.2
 *
 */
public class Rectangulo extends FiguraGeometrica {
	private double l1;
	private double l2;
	
	/**
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * metodo que calcula el área del rectángulo multiplicando lado mayor por el menor
 * return area
 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}
	
	/**
	 * metodo que calcula el perímetro del rectángulo con la fórmula indicada
	 * return perimetro
	 */


}
