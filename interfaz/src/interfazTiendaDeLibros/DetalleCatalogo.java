package interfazTiendaDeLibros;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class DetalleCatalogo extends JPanel{

	private JButton btnAdicionarLibro, btnOpcion1, btnOpcion2, btnComprar;
	private JTable tablaCatalogo;
	private JPanel panelBotones, panelCatalogo, panelComprar;
	private JLabel labCantidad;
	private JTextField jtfCantidad;
	
	public DetalleCatalogo() {
		
		// layoutManager
		setLayout(new BorderLayout());
		
		//Creación de paneles
		//Arriba
		panelBotones = new JPanel();
		add(panelBotones, BorderLayout.NORTH);
		//Centro
		panelCatalogo = new JPanel();
		add(panelCatalogo, BorderLayout.CENTER);
		panelCatalogo.setLayout(new BoxLayout(panelCatalogo, BoxLayout.Y_AXIS));
		//Abajo
		panelComprar = new JPanel();
		JPanel panelCantidad = new JPanel();
		panelCantidad.setLayout(new BoxLayout(panelCantidad, BoxLayout.Y_AXIS));
		
		//PANEL BOTONES
		
		//Creación de Botones (Arriba)
		btnAdicionarLibro = new JButton("Adicionar libro");
		btnAdicionarLibro.setPreferredSize(new Dimension(150,25));
		btnOpcion1 = new JButton("Opcion 1");
		btnOpcion1.setPreferredSize(new Dimension(150,25));
		btnOpcion2 = new JButton("Opcion 2");
		btnOpcion2.setPreferredSize(new Dimension(150,25));
		
		//Agregando los componentes al panelBotones
		panelBotones.add(btnAdicionarLibro);
		panelBotones.add(btnOpcion1);
		panelBotones.add(btnOpcion2);
		
		//PANEL CATÁLOGO
		
		//Borde con titulo para el panel catálogo
		TitledBorder borde = BorderFactory.createTitledBorder("Detalle del catalogo");
		borde.setTitleColor(Color.BLUE);
		panelCatalogo.setBorder(borde);
		
		//Arrays para la tabla
		String[][] datos = {};
		String[] encabezado = {"ISBN", "Título", "Precio"};
		//Creación de la tabla
		tablaCatalogo = new JTable(datos,encabezado);
		// Scroll para datos que no quepan en tabla
		JScrollPane scroll = new JScrollPane(tablaCatalogo);
		scroll.setPreferredSize(new Dimension(100,150));
		
		//Agregando los componentes al panelCatalogo
		panelCatalogo.add(scroll);
		panelCatalogo.add(panelComprar);
		
		//PANEL COMPRAR
		
		//Creación de botón y label para panelComprar
		labCantidad = new JLabel("Cantidad");
		jtfCantidad = new JTextField();
		jtfCantidad.setPreferredSize(new Dimension(70,18));
		btnComprar = new JButton("Comprar");
		
		//Agregando componenetes a panelCantidad
		panelCantidad.add(labCantidad);
		panelCantidad.add(jtfCantidad);
		
		//Agregando panelCantidad y btnComprar a PanelComprar
		panelComprar.add(panelCantidad);
		panelComprar.add(btnComprar);
		
	}
}