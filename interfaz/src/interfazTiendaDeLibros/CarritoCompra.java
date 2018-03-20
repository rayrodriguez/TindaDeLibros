package interfazTiendaDeLibros;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class CarritoCompra extends JPanel{

	private JPanel panelTablaCar, panelTotal, panelCarrito;
	private JTable tablaCarrito;
	private JLabel labTotal, labPrecioTotal;
	private JButton btnBorrar;
	
	public CarritoCompra() {
		
		//Creación de LayoutManager
		setLayout(new BorderLayout());
		
		//Crear paneles necesarios
		panelCarrito = new JPanel();
		add(panelCarrito);
		panelTablaCar = new JPanel();
		panelCarrito.add(panelTablaCar, BorderLayout.NORTH);
		panelTotal = new JPanel();
		panelCarrito.add(panelTotal, BorderLayout.CENTER);
		
		//Borde para Detalles
		TitledBorder border = BorderFactory.createTitledBorder("Detalle del carrito de compras");
		border.setTitleColor(Color.BLUE);
		panelCarrito.setBorder(border);
		
		//Tabla para detalles Carrito
		String[][] datos = {};
		String[] encabezado = {"ISBN","Titulo","Cantidad","Subtotal"};
		tablaCarrito = new JTable(datos,encabezado);
		JScrollPane scroll = new JScrollPane(tablaCarrito);
		scroll.setPreferredSize(new Dimension(480,150));
		panelTablaCar.add(scroll);
		
		//Borde para total
		Border borde = BorderFactory.createLineBorder(Color.red);
		
		//Botón y labels para panel total
		btnBorrar = new JButton("Borrar");
		btnBorrar.setPreferredSize(new Dimension(155,28));
		labTotal = new JLabel("Total");
		labPrecioTotal = new JLabel(" $ 0");
		labPrecioTotal.setPreferredSize(new Dimension(150,30));
		labPrecioTotal.setBorder(borde);
		
		//Agregando a panel total
		panelTotal.add(btnBorrar);
		//Area rigida para separar boton de Labels
		panelTotal.add(Box.createRigidArea(new Dimension(115,0)));
		panelTotal.add(labTotal);
		panelTotal.add(labPrecioTotal);
		
	}
}