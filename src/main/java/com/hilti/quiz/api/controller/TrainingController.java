package com.hilti.quiz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hilti.quiz.api.model.Success;
import com.hilti.quiz.api.model.Training;
import com.hilti.quiz.api.service.TrainingService;
@RestController
public class TrainingController {

	@Autowired
	private TrainingService trainingService;
	
	@RequestMapping("/training/viewAlltrainings")
	public @ResponseBody Iterable<Training> viewAlltraining(){
				return trainingService.viewAllTrainingService();
	}

	@RequestMapping("/training/createTraining")
	public @ResponseBody Success onCreate(String title,String imageRes,String feature,String application){
		Training training = null;
		try{
			training = new Training(title,imageRes,feature,application);
			trainingService.saveTrainingService(training);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Training.class.getName().substring(Training.class.getName().lastIndexOf(".")+1)+" record created");
		
	}
	
	@RequestMapping("/training/updateTraining")
	public @ResponseBody Success onUpdate(int trainingId,String title,String imageRes,String feature,String application){
		Training training = null;
		try{
			training = new Training(trainingId,title,imageRes,feature,application);
			trainingService.saveTrainingService(training);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Training.class.getName().substring(Training.class.getName().lastIndexOf(".")+1)+" record updated");
		
	}
	
	@RequestMapping("/training/viewTrainingById")
	public @ResponseBody Iterable<Training> viewQuestionById(Integer[] trainingIdList){
		return trainingService.findListOfTraining(trainingIdList);
	}
	
	@RequestMapping("/training/deleteTrainingById")
	public @ResponseBody Success onDelete(int trainingId){
	
		try{
			
			trainingService.deleteTrainingByIdService(trainingId);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Training.class.getName().substring(Training.class.getName().lastIndexOf(".")+1)+" record deleted");
		
	}
}
