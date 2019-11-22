package com.intersystems.SpringMyBatisIRISDemo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.intersystems.SpringMyBatisIRISDemo.Pojo.Patient;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;



@Mapper
public interface DataModelMapper {
	 @Select("SELECT ID, FirstName, Gender, LastName FROM DataModel.Patient p where p.ID = #{id}")
	 Patient selectPatientById(@Param("id") int id);
	 
	 @Select("select ID, FirstName, Gender, LastName FROM DataModel.Patient p where {fn CONCAT(p.FirstName,p.LastName)} LIKE #{name}")
	 List<Patient> selectPatientByName(@Param("name") String name);
	 
	 @Insert("INSERT INTO DataModel.Patient "
	 		+ "(FirstName, Gender, LastName) "
	 		+ "VALUES(#{FirstName}, #{Gender}, #{LastName})")
	 int insertPatient(Patient patient);
	
		
}
