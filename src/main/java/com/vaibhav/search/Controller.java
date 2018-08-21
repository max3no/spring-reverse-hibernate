package com.vaibhav.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.search.dbmodel.orm.Topic;

@RestController
public class Controller {

	@Autowired
	TopicRepository topicRepository;
	
	@RequestMapping("/")
	public List<Topic> index() {
		return topicRepository.findByDescriptionLikeIgnoreCase("%some%");
	}
}
