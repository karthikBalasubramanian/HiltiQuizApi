package com.hilti.quiz.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hilti.quiz.api.model.Question;
import com.hilti.quiz.api.model.UserProfile;
@Repository
@Transactional
public interface QuestionDAO extends CrudRepository<Question, Integer> {
	

	@Query("select q from Question q, RelatedTopic r, Topic t where q.qid=r.qid and r.topicid=t.topicid and t.topicName IN (:topicName) and q.difficulty IN (:difficulty) and q.qid not in (Select a.qid from AnsweredCorrect a where a.empid=:empid)") 
    public List<Question> findQuestionByTopic(@Param("topicName") String [] topicName, @Param("difficulty") int []  difficulty ,@Param("empid") Integer empid);
	
	
}
