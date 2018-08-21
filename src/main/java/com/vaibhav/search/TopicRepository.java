package com.vaibhav.search;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vaibhav.search.dbmodel.orm.Topic;


@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {

	List<Topic> findByDescriptionLikeIgnoreCase(String searchString);
	
}