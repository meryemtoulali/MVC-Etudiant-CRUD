package MVCEtudiant;

import java.util.List;

public class EtudiantService {
	
	

//	public void updatePerson(Person p);
//	public List<Person> listPersons();
//	public Person getPersonById(int id);
//	public void removePerson(int id);
	
	private EtudiantDAO dao;
	public void setEtudiantDAO(EtudiantDAO dao) {
		this.dao = dao;
	}
	
	public void addEtudiant(Etudiant etudiant) {
		this.dao.addEtudiant(etudiant);
	}
	
	public void updateEtudiant(Etudiant etudiant) {
		//update based on id, which is intact
		//new student parameters have been set in etudiant using controller
		this.dao.updateEtudiant(etudiant);
	}
	
	public void deleteEtudiant(int id) {
		this.dao.deleteEtudiant(id);
	}
	
	
	
	public List<Etudiant> listEtudiants(){
		return this.dao.listEtudiants();
	}
//	
//	
//	public Etudiant getEtudiantById(int id) {
//		return this.dao.getEtudiantById(id);
//	}
//	


	
	
	//old: before, controller had to go through service to access getters and setters

//	
//	public void setEtudiantCNE(Etudiant model, String CNE) {
//		model.setCNE(CNE);
//	}
//	
//	public String getEtudiantCNE(Etudiant model) {
//		return model.getCNE();		
//	}
//	
//	public int getEtudiantNo(Etudiant model) {
//		return model.getNo();
//		
//	}
//	
//	public void setEtudiantNote(Etudiant model, double note) {
//		model.setNote(note);
//	}
//	
//	public double getEtudiantNote(Etudiant model) {
//		return model.getNote();
//	}
//	
//	public void setEtudiantNom(Etudiant model, String nom) {
//		model.setNom(nom);
//	}
//	
//	public String getEtudiantNom(Etudiant model) {
//		return model.getNom();
//	}
//	
//	public String getEtudiantTelephone(Etudiant model) {
//		return model.getTelephone();
//	}
//	
//	public void setEtudiantTelephone(Etudiant model, String telephone) {
//		model.setTelephone(telephone);
//	}
	
	

}
