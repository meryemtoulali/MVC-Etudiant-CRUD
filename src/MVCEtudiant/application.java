package MVCEtudiant;

import java.util.List;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize app
		
		EtudiantDAO dao = new EtudiantDAO("jdbc:mysql://localhost:3306/etudiants_mvc", "root", "root");
				
		EtudiantService service = new EtudiantService();
		service.setEtudiantDAO(dao);
		
		EtudiantController controller = new EtudiantController();
		controller.setEtudiantService(service);
		EtudiantView view = new EtudiantView(controller);
		
		view.start();

		
//		// start
//		
//		Etudiant etudiant = new Etudiant(1, "19000194", "meryem", 20.00, "0656498838");
//
//		// insert etudiant
//		controller.addEtudiant(etudiant);
//		
//		// update CNE and name
//		controller.setEtudiantCNE(etudiant, "19000100");
//		controller.setEtudiantNom(etudiant, "sara toulali");
//		controller.updateEtudiant(etudiant);
//		
//		//insert etudiant 2
//		etudiant = new Etudiant(2, "19000193", "kenza toreis", 20.00, "0495820394");
//		controller.addEtudiant(etudiant);
//
//		// delete etudiant
//		controller.deleteEtudiant(7);
//		
//		// retrieve student list
//		List<Etudiant> listeEtudiants = controller.listEtudiants();
//		for(Etudiant e : listeEtudiants) {
//			int id = e.getId();
//		    String cne = e.getCNE();
//		    String nom = e.getNom();
//		    double note = e.getNote();
//		    String telephone = e.getTelephone();
//		    System.out.println(id + ", " + cne + ", " + nom + ", " + note + ", " + telephone);
//		}
//		
		
		
		
		
		
		// call controller in view eg button
		//System.out.println(controller.getEtudiantCNE());
		
		

	}

}
