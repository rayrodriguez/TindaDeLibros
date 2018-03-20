package interfazTiendaDeLibros;

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.BoxLayout;

public class TiendaLibros extends JFrame{

	private DetalleCatalogo detalleCatalogo;
	private CarritoCompra carritoCompra;
	
	public TiendaLibros() {
		Container contenedor = getContentPane();
		setTitle("Tienda de Libros");
		setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
		setSize(500,560);
		setResizable(false);
		
		detalleCatalogo = new DetalleCatalogo();
		contenedor.add(detalleCatalogo);
		
		carritoCompra = new CarritoCompra();
		contenedor.add(carritoCompra);
	}
	
	public static void main(String[] args) {
		JFrame frame = new TiendaLibros();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
