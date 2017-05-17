package baseDeDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

import ClasesTabla.Asociacion;

public class conn {
	private static String urltable;
	private String bd;
	private String url;
	private String usr;
	private String pwd;
	private static Connection conexion;

	public static String getUrltable() {
		return urltable;
	}

	public String getBd() {
		return bd;
	}

	public String getUrl() {
		return url;
	}

	public String getUsr() {
		return usr;
	}

	public String getPwd() {
		return pwd;
	}

	public conn() {
		Properties propiedades = new Properties();
		InputStream entrada = null;
		try {
			File miFichero = new File("config.ini");
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				// cargamos el archivo de propiedades
				propiedades.load(entrada);
				// obtenemos las propiedades y las imprimimos
				urltable = propiedades.getProperty("url");
				usr = propiedades.getProperty("user");
				pwd = propiedades.getProperty("passwd");
				bd = propiedades.getProperty("bd");
				url = urltable + bd;
			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			System.out.println("-- Conexion establecida --");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	public Connection getConexion() {
		// TODO Auto-generated method stub
		return conexion;
	}

}
