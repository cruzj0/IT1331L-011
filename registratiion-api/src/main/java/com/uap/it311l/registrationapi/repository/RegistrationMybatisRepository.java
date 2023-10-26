package com.uap.it311l.registrationapi.repository;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.uap.it311l.registrationapi.model.Attendee;

@Mapper
public interface RegistrationMybatisRepository {
	
	@Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age) VALUES (#{firstName}, #{middleName}, #{lastName}, #{course}, #{age})")
	public int insert(Attendee attendee);
	
	@Select("SELECT * FROM attendees")
	public Attendee[] findAll();
	
	@Update("UPDATE attendees SET surveyEligibilityTag = TRUE WHERE course = 'BSIT';")
	public void markEligible();
	
	@Delete("DELETE FROM attendees WHERE attendeeId = #{id};")
	public void delete(String id);
}
