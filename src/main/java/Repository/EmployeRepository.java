package Repository;

import java.util.ArrayList;

import java.util.List;

import Models.Employe;

public class EmployeRepository {
	
	private List<Employe> listEmploye;

	public EmployeRepository(List<Employe> listEmploye) {
		this.listEmploye = listEmploye != null ? listEmploye : new ArrayList<>();
	}

	public EmployeRepository() {

		this.listEmploye = new ArrayList<>();
	}



	public List<Employe> getListEmploye() {
		return listEmploye;
	}



	public void setListEmploye(List<Employe> listEmploye) {
		this.listEmploye = listEmploye;
	}



	public Employe createEmploye(String nom, String prenom, String email, String poste) {
		Employe employe = new Employe(nom, prenom, email, poste);	
		return employe;
		
	};
	
	public List<Employe> addIntoEmployeList(Employe employe){
		listEmploye.add(employe);
		return listEmploye;
		
		
	}
	
	public void removeEmployeIntoList(Employe employe) {
		
		for(int i = 0; i < listEmploye.size(); i++) {
			
			if(listEmploye.get(i).getNom() == employe.getNom()) {
				listEmploye.remove(i);
			}
		}
			
	}
	
	public long searchSameEmail(List<Employe> listEmploye, String emailEmploye) {
		
		for (int i = 0; i < listEmploye.size(); i++) {
			if( listEmploye.get(i).getEmail() == emailEmploye) {
				return 1;
			}
		}
		

		return 0;
	}

}
