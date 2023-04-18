package MVCEtudiant;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EtudiantDAO {
	private String url;
	private String username;
	private String password;
	
	public EtudiantDAO(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
	
	public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
	
	public void addEtudiant(Etudiant e) {
		
		try(
			Connection conn = getConnection();
		)
		{
			Statement stmt = conn.createStatement();
			String strInsert;
			if(e.getId() == -1) {
				//insert with automatic id
				strInsert = "insert into etudiants (CNE, nom, note, telephone) values('" + e.getCNE() +
						"', '" + e.getNom() + "', " + e.getNote() + ", '" + e.getTelephone() +"')";
			} else {
				//insert with specified id
				strInsert = "insert into etudiants values(" + e.getId() + ", '" + e.getCNE() +
						"', '" + e.getNom() + "', " + e.getNote() + ", '" + e.getTelephone() +"')";
			}
			System.out.println("The SQL statement is: " + strInsert + "\n"); // Echo For debugging
			int rowsAffected = stmt.executeUpdate(strInsert);
			System.out.println(rowsAffected + " rows affected.");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void updateEtudiant(Etudiant e) {
		
		try(
			Connection conn = getConnection();
		)
		{
			Statement stmt = conn.createStatement();
			String strUpdate = "update etudiants set CNE ='" + e.getCNE() +
					"', nom = '" + e.getNom() +
					"', note = " + e.getNote() +
					", telephone = '" + e.getTelephone() + "' where id = " + e.getId();
			System.out.println("The SQL statement is: " + strUpdate + "\n"); // Echo For debugging
			int rowsAffected = stmt.executeUpdate(strUpdate);
			System.out.println(rowsAffected + " rows affected.");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void deleteEtudiant(int id) {
		
		try(
			Connection conn = getConnection();
		)
		{
			Statement stmt = conn.createStatement();
			String strDelete = "delete from etudiants where id =" + id;
			System.out.println("The SQL statement is: " + strDelete + "\n"); // Echo For debugging
			int rowsAffected = stmt.executeUpdate(strDelete);
			System.out.println(rowsAffected + " rows affected.");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	
	
	public List<Etudiant> listEtudiants(){
		List<Etudiant> listeEtudiants = new ArrayList<Etudiant>();

				try(
						
				Connection conn = getConnection();
			)
			{
				Statement stmt = conn.createStatement(); 
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
				    double note = rset.getFloat("note");
				    String telephone = rset.getString("telephone");
				    
				    System.out.println(id + ", " + cne + ", " + nom + ", " + note + ", " + telephone);
				    ++rowCount;
				    
				    //add etudiant to list
				    listeEtudiants.add(new Etudiant(id, cne, nom, note, telephone));
				 }
				 System.out.println("Total number of records = " + rowCount);	
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
			return listeEtudiants;
		}

}
