package com.hilti.quiz.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hilti.quiz.api.model.Question;
@Repository
@Transactional
public interface QuestionDAO extends CrudRepository<Question, Integer> {

}
