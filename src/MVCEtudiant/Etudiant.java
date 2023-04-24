package MVCEtudiant;
import java.lang.String;


public class Etudiant {
	private String CNE;
	private int id; //= id in database
	private String nom;
	private double note;
	private String telephone;
	
	public Etudiant(int id, String CNE, String nom, double note, String telephone) {
		super();
		this.id = id;
		this.CNE = CNE;	
		this.nom = nom;
		this.note = note;
		this.telephone = telephone;
	}

	public String getCNE() {
		return CNE;
	}

	public void setCNE(String CNE) {
		this.CNE = CNE;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
