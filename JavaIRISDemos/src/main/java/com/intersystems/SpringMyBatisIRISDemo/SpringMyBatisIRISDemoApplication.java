package com.intersystems.SpringMyBatisIRISDemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.intersystems.SpringMyBatisIRISDemo.Mapper.DataModelMapper;
import com.intersystems.SpringMyBatisIRISDemo.Pojo.Patient;

@SpringBootApplication
public class SpringMyBatisIRISDemoApplication implements CommandLineRunner {

private final DataModelMapper mapper;
	
	public SpringMyBatisIRISDemoApplication(DataModelMapper mapper) {
	    this.mapper = mapper;
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMyBatisIRISDemoApplication.class, args);
	  }
	
	public void run(String... args) throws Exception {
		
		//Select one
		System.out.println("-------------------------Selecting one Patient---------------------------------");
		Patient pat = this.mapper.selectPatientById(1);
		System.out.println(pat.getLastName()+":"+pat.getFirstName()+":"+pat.getGender());
		
		//Select list
		System.out.println("-------------------------Selecting Patient list---------------------------------");
		List<Patient> patList = this.mapper.selectPatientByName("%B%");
		for(Patient p : patList) {
			System.out.println(p.getLastName()+":"+p.getFirstName()+":"+p.getGender());
		}
		
		//Insert one
		System.out.println("-------------------------Insert Patient---------------------------------");
		Patient newPat = new Patient();
		newPat.setFirstName("Si");
		newPat.setLastName("Li");
		newPat.setGender("M");
		int rowCount = this.mapper.insertPatient(newPat);
		System.out.println(rowCount + " patient created");
		
	}
}
