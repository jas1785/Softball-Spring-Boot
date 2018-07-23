package com.example.test.mongoRest;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.tracker.model.Players;


public interface PlayersRepository extends MongoRepository<Players, String>{
	Players findBy_id(ObjectId _id);
	
	Players insert(Players player);
}
