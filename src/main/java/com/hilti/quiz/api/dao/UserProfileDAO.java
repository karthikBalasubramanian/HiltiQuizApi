package com.hilti.quiz.api.dao;


import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hilti.quiz.api.model.UserProfile;

@Repository
@Transactional
public interface UserProfileDAO extends CrudRepository<UserProfile,Integer> {

	@Query("SELECT u FROM UserProfile u where u.email = :email AND u.password= :password") 
    public UserProfile findEmpByEmailAndPassword(@Param("email") String email,@Param("password") String password);
	

	@Query("SELECT u FROM UserProfile u order by totalScore desc") 
    public List <UserProfile> findFirstByOrderBytotalScore();

}
