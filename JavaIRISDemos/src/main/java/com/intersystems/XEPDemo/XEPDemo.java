package com.intersystems.XEPDemo;


import com.intersystems.SpringMyBatisIRISDemo.Pojo.Patient;
import com.intersystems.XEPDemo.Pojo.Encounter;
import com.intersystems.xep.Event;
import com.intersystems.xep.EventPersister;
import com.intersystems.xep.PersisterFactory;


public class XEPDemo  {
	
	public static void main(String[] args) {
		
		Patient pat = new Patient();
		pat.setFirstName("Si");
		pat.setLastName("Li");
		pat.setGender("M");
		
		Encounter ent = new Encounter();
		ent.setEntNumber("111111");
		ent.setEntType("in");
		ent.setPatient(pat);
		
		// EventPersister 
		EventPersister xepPersister = PersisterFactory.createPersister(); 
		xepPersister.connect("192.168.113.170",51773,"JAVATEST","SuperUser","SYS"); 
		
		xepPersister.deleteExtent("com.intersystems.XEPDemo.Pojo.Encounter"); // remove old test data 
		xepPersister.importSchema("com.intersystems.XEPDemo.Pojo.Encounter"); // import flat schema
		
		// Event 
		Event xepEvent = xepPersister.getEvent("com.intersystems.XEPDemo.Pojo.Encounter"); 
		xepEvent.store(ent); 
		System.out.println("Encounter persisted with EntNumber: " + ent.getEntNumber()); 
		
	  }
	

}
