package com.hilti.quiz.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hilti.quiz.api.model.AnsweredCorrect;

@Repository
@Transactional
public interface AnsweredCorrectDAO extends CrudRepository<AnsweredCorrect, Integer> {

}
