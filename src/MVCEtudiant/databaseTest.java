package MVCEtudiant;
import java.sql.*;

public class databaseTest {
	
//	public void addPerson(Person p);
//	public void updatePerson(Person p);
//	public List<Person> listPersons();
//	public Person getPersonById(int id);
//	public void removePerson(int id);

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/etudiants_mvc",
					"root", "root");   // For MySQL only
			// The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
		){
			Statement stmt = conn.createStatement();
			
			String strDelete = "delete from etudiants where id = 2";
			System.out.println("The SQL statement is: " + strDelete + "\n"); // Echo For debugging
			int rowsAffected = stmt.executeUpdate(strDelete);
			System.out.println(rowsAffected + " rows affected.");
			
			String strInsert = "insert into etudiants(id, cne, nom, note, telephone) "
					+ "values(1, '19000194', 'meryem toulali', 20.00, '0656498848')";
			System.out.println("The SQL statement is: " + strDelete + "\n"); // Echo For debugging
			rowsAffected = stmt.executeUpdate(strInsert);
			System.out.println(rowsAffected + " rows affected.");

			
			String strSelect = "select * from etudiants";
			System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
			ResultSet rset = stmt.executeQuery(strSelect);
			
			//process the result set
			System.out.println("The records selected are:");
			 int rowCount = 0;
			 while(rset.next()) {   // Repeatedly process each row
				 int id = rset.getInt("id");
			     String cne = rset.getString("cne");
			     String nom = rset.getString("nom");
			     float note = rset.getFloat("note");
			     String telephone = rset.getString("telephone");
			     System.out.println(id + ", " + cne + ", " + nom + ", " + note + ", " + telephone);
			     ++rowCount;
			  }
			  System.out.println("Total number of records = " + rowCount);
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

}
