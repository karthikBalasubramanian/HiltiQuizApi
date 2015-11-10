package com.hilti.quiz.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hilti.quiz.api.model.RelatedTopic;

@Repository
@Transactional
public interface RelatedTopicDAO extends CrudRepository<RelatedTopic, Integer>{

}
