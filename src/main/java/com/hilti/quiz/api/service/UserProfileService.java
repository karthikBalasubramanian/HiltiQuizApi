package com.hilti.quiz.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hilti.quiz.api.dao.UserProfileDAO;
import com.hilti.quiz.api.model.UserProfile;

@Component
public class UserProfileService {
	@Autowired
	private UserProfileDAO userProfileDao;
	
		//save or update service
		public void saveUserProfileService(UserProfile userProfile){
			userProfileDao.save(userProfile);
		}
		
		public void saveManyUserProfilesService(ArrayList<UserProfile> listOfUserProfiles){
			userProfileDao.save(listOfUserProfiles);
		}
		
		public UserProfile findOneUserProfileService(int id){
			return userProfileDao.findOne(id);
		}
		
		public ArrayList<UserProfile> findListOfUserProfile(Integer[] ids){
			return (ArrayList<UserProfile>) userProfileDao.findAll(Arrays.asList(ids));
		}
		
		public ArrayList<UserProfile> viewAllUserProfileService(){
			return (ArrayList<UserProfile>) userProfileDao.findAll();
		}
		
		public void deleteUserProfileByIdService(int id){
			userProfileDao.delete(id);
		}
		
		public void deleteUserProfileService(UserProfile userProfile){
			userProfileDao.delete(userProfile);
		}
		
		public void deleteUserProfileListService(ArrayList<UserProfile> listOfUserProfiles){
			userProfileDao.delete(listOfUserProfiles);
		}
		
		public void deleteAllUserProfileService(){
			userProfileDao.deleteAll();
		}
		public UserProfile findEmpByEmailAndPasswordService(String email,String password){
			return userProfileDao.findEmpByEmailAndPassword(email,password);
		}
		
		
}
