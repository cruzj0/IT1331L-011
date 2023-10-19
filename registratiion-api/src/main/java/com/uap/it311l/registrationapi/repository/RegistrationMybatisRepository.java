package com.uap.it311l.registrationapi.repository;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.uap.it311l.registrationapi.model.Attendee;

@Mapper
public interface RegistrationMybatisRepository {
	
	@Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age) VALUES (#{firstName}, #{middleName}, #{lastName}, #{course}, #{age})")
	public int insert(Attendee attendee);
	
	@Select("SELECT * FROM attendees")
	public Attendee[] findAll();
}
