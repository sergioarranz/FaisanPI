package Lanzador;
import Vista.Login;
import baseDeDatos.AsociacionBBDD;
import baseDeDatos.Conexion;
import baseDeDatos.conn;

public class Launch {
	public static void main(String[] args) {
		conn conexionBBDD = new conn();
		
		AsociacionBBDD.setConexion(conexionBBDD.getConexion());
		Login frame = new Login();
		frame.setVisible(true);

	}
}
