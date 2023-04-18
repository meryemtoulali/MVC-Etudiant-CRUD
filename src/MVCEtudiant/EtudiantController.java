package MVCEtudiant;

import java.util.List;

public class EtudiantController {
	//private Etudiant model;
	//private EtudiantView view;
	private EtudiantService service;
	
	public void setEtudiantService(EtudiantService service) {
		this.service = service;
	}
	
	public void addEtudiant(Etudiant etudiant) {
		this.service.addEtudiant(etudiant);
	}
	
	
	public void updateEtudiant(Etudiant etudiant) {
		//update based on id, which is intact
		this.service.updateEtudiant(etudiant);
	}
	
	public void deleteEtudiant(int id) {
		this.service.deleteEtudiant(id);
	}
	
	public List<Etudiant> listEtudiants(){
		return this.service.listEtudiants();
	}
//	
//	public Etudiant getEtudiantById(int id) {
//		return this.service.getEtudiantById(id);
//	}
//	

	
//	public EtudiantController(Etudiant model, EtudiantView view, EtudiantService service) {
//		this.model = model;
//		this.view = view;
//		this.service = service;
//	}
	
	
	public void setEtudiantCNE(Etudiant model, String CNE) {
		model.setCNE(CNE);
	}
	
	public String getEtudiantCNE(Etudiant model) {
		return model.getCNE();		
	}
	
	public int getEtudiantId(Etudiant model) {
		return model.getId();
		
	}
	
	public void setEtudiantNote(Etudiant model, double note) {
		model.setNote(note);
	}
	
	public double getEtudiantNote(Etudiant model) {
		return model.getNote();
	}
	
	public void setEtudiantNom(Etudiant model, String nom) {
		model.setNom(nom);
	}
	
	public String getEtudiantNom(Etudiant model) {
		return model.getNom();
	}
	
	public String getEtudiantTelephone(Etudiant model) {
		return model.getTelephone();
	}
	
	public void setEtudiantTelephone(Etudiant model, String telephone) {
		model.setTelephone(telephone);
	}

	
	//old: before, controller had to go through service to access getters and setters
	
	//	public void setEtudiantCNE(String CNE) {
//		service.setEtudiantCNE(model, CNE);
//	}
//	
//	public String getEtudiantCNE() {
//		return service.getEtudiantCNE(model);		
//	}
//	
//	public int getEtudiantNo() {
//		return service.getEtudiantNo(model);
//		
//	}
//	
//	public void setEtudiantNote(double note) {
//		service.setEtudiantNote(model, note);
//	}
//	
//	public double getEtudiantNote() {
//		return service.getEtudiantNote(model);
//	}
//	
//	public void setEtudiantNom(String nom) {
//		service.setEtudiantNom(model, nom);
//	}
//	
//	public String getEtudiantNom() {
//		return service.getEtudiantNom(model);
//	}
//	
//	public String getEtudiantTelephone() {
//		return service.getEtudiantTelephone(model);
//	}
//	public void setEtudiantTelephone(String telephone) {
//		service.setEtudiantTelephone(model, telephone);
//	}
	
	

}
