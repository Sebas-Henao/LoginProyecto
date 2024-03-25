package loginProyecto;
import java.sql .*;	
public class loginProyecto {
	
	public static void main(String[] args) {
		
	
		String usuario ="root";
		String password = "Sebash310";
		String url = "jdbc:mysql://localhost:3306/bd_usuarios";
		Connection conexion;
		Statement statement;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conexion = DriverManager.getConnection (url, usuario, password);
			statement = conexion.createStatement();
			statement.executeUpdate ("INSERT INTO INFOUSUARIOS(NOMBRES,APELLIDOS, NOMUSUARIO,EMAIL,CONTRASEÑA) VALUES ('FGHL','FGHL','YUI-E','IGJH@SERVICIOS.COM','FGHL')");
			rs = statement.executeQuery("SELECT * FROM INFOUSUARIOS");
			rs.next();
			do {
				System.out.println(rs.getInt("idUsuarios")+" : "+rs.getString("nombres"));
				
				}while(rs.next());
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
