package EmployeTest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Models.Employe;
import Repository.EmployeRepository;




public class EmployeTest {
	
	private EmployeRepository employeRepository;
	
	private Employe employe;
	
	
	@BeforeEach
	public void initEmployeList() {
		employeRepository = new EmployeRepository();
		employe = new Employe();
	}
	
	@Test
	public void testCreateEmploye() {
		Employe newEmploye = employeRepository.createEmploye("Hammami", "Yassin", "yas.hammami@gmail.com", "developpeur");
		Employe newEmployeMock = mock(Employe.class);
		when(employeRepository.createEmploye("Hammami", "Yassin", "yas.hammami@gmail.com", "developpeur")).thenReturn(newEmployeMock);
		
        assertNotNull(newEmploye);
        assertEquals("Hammami", newEmploye.getNom());
        verify(employeRepository).createEmploye("Hammami", "Yassin", "yas.hammami@gmail.com", "developpeur");
	}
	
	@Test
	public void testAddEmployeIntoList() {
		
		employe.setNom("Test");
		employe.setPrenom("testeur");
		employe.setEmail("testeur@outlook.fr");
		employe.setPoste("ingenieur");
		employe.setDate_embauche(LocalDateTime.now());
		
		employeRepository.addIntoEmployeList(employe);

		
	    assertEquals(1, employeRepository.getListEmploye().size());
	    assertEquals("Test", employeRepository.getListEmploye().get(0).getNom());
		
	}
	
	@Test
	public void testRemoveEmployeIntoList() {
		
		employe.setNom("Test");
		employe.setPrenom("testeur");
		employe.setEmail("testeur@outlook.fr");
		employe.setPoste("ingenieur");
		employe.setDate_embauche(LocalDateTime.now());
		
		employeRepository.addIntoEmployeList(employe);		
		employeRepository.removeEmployeIntoList(employe);
		
		assertNotEquals(employeRepository, employe);
	}
	
	@Test
	public void testSearchUniqueEmail() {
		
		employe.setNom("Test");
		employe.setPrenom("testeur");
		employe.setEmail("testeur@outlook.fr");
		employe.setPoste("ingenieur");
		employe.setDate_embauche(LocalDateTime.now());
		
		employeRepository.addIntoEmployeList(employe);	
		Employe otherEmploye = new Employe("Test","Testeur","testeur@outlook.fr","developpeur");
		employeRepository.addIntoEmployeList(otherEmploye);
		assertEquals(1, employeRepository.searchSameEmail(employeRepository.getListEmploye(), otherEmploye.getEmail()));
		
	}
	


}