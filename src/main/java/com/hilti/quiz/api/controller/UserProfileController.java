package com.hilti.quiz.api.controller;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hilti.quiz.api.model.Success;
import com.hilti.quiz.api.model.UserProfile;
import com.hilti.quiz.api.service.UserProfileService;
import com.hilti.quiz.api.utility.ImageToByteArray;

@RestController
public class UserProfileController {

	@Autowired
	UserProfileService userProfileService;

	@Autowired
	private ImageToByteArray imageToByte;

	@RequestMapping("/userProfile/viewAllUserProfile")
	public @ResponseBody Iterable<UserProfile> viewAllUserProfile() {
		return userProfileService.viewAllUserProfileService();
	}

	@RequestMapping("/userProfile/crUpUserProfile")
	public @ResponseBody Success onUpdate(int empid, String password, String displayPic, String firstName,
			String lastName, String middleName, String department, String asOfDate, String email, int totalScore) {

		UserProfile UserProfile = null;

		try {
			// displayPic = imageToByte.imageToBytes(new
			// File("C:\\Users\\vaishu\\Desktop\\diagram\\artisty-devushki-lyudi-muzyka-33759.jpg"));
			UserProfile = new UserProfile(empid, password, displayPic, firstName, lastName, middleName, department,
					asOfDate, email, totalScore);
			userProfileService.saveUserProfileService(UserProfile);
		} catch (Exception ex) {
			return new Success("sorry Try Again");
		}
		return new Success(
				"yes " + UserProfile.class.getName().substring(UserProfile.class.getName().lastIndexOf(".") + 1)
						+ " record created");

	}

	@RequestMapping("/userProfile/viewUserProfileById")
	public @ResponseBody Iterable<UserProfile> viewUserProfileById(Integer[] userProfileIdList) {
		return userProfileService.findListOfUserProfile(userProfileIdList);
	}

	@RequestMapping("/userProfile/findEmpByEmailAndPassword")
	public @ResponseBody UserProfile findEmpByEmailAndPassword(String email, String password) {
		return userProfileService.findEmpByEmailAndPasswordService(email, password);
	}

	@RequestMapping("/userProfile/findFirstByOrderBytotalScore")
	public @ResponseBody List<UserProfile> findFirstByOrderBytotalScore() {
		try {
			return userProfileService.findFirstByOrderBytotalScore();
		} catch (Exception e) {
			return userProfileService.findFirstAllByOrderBytotalScore();
		}
	}

	@RequestMapping("/UserProfile/deleteUserProfileById")
	public @ResponseBody Success onDelete(int userProfileid) {

		try {
			userProfileService.deleteUserProfileByIdService(userProfileid);
		} catch (Exception ex) {
			return new Success("sorry Try Again");
		}
		return new Success(
				"yes " + UserProfile.class.getName().substring(UserProfile.class.getName().lastIndexOf(".") + 1)
						+ " record deleted");

	}

}
