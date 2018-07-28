package com.example.test.mongoRest;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.tracker.model.Players;


@RestController
@RequestMapping("/players")
public class PlayerController {
	
	  @Autowired
	  private PlayersRepository repository;
	  
	  @CrossOrigin
	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Players getPlayerById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }
	  
	  @CrossOrigin
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Players> getAllPlayers() {
		 for(Players a:repository.findAll()) {
			 a.set_id(a.get_id());
			 System.out.println(a.toString());
		 } 
	    return repository.findAll();
	  }
	  
	  @CrossOrigin
	  @RequestMapping(value = "/create/", method = RequestMethod.POST)
	  public Players createPlayer(@Valid @RequestBody Players player) {
		player.set_id(ObjectId.get());
	    return repository.insert(player);
	  }
	  
	  @CrossOrigin
	  @RequestMapping(value = "/update/", method = RequestMethod.PUT)
	  public Players updatePlayer(@Valid @RequestBody Players player) {
	    return repository.save(player);
	  }
	  
	  @CrossOrigin
	  @RequestMapping(value = "/delete/", method = RequestMethod.DELETE)
	  public void deletePlayer(@Valid @RequestBody Players player) {
	     repository.delete(player);
	  }
}
