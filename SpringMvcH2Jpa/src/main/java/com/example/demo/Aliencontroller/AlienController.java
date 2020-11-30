package com.example.demo.Aliencontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Alien;
import com.example.demo.Dao.AlienRepo;

/*if we are using a rest application we dont need to "response body" every time ,we just need to do change @controller to @restcontroller
*/@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	// adding data
	@RequestMapping("/addAlien")
	public String addAlien1(Alien alien) {

		repo.save(alien);
		return "home.jsp";
	}

	// fetching data
	/*
	 * @RequestMapping("/getAlien") public ModelAndView getAlien(@RequestParam int
	 * aid) { ModelAndView mv = new ModelAndView("FetchAlien.jsp"); Alien alien
	 * =repo.findById(aid).orElse(new Alien());
	 * System.out.println(repo.findByAidGreaterThan(102));
	 * System.out.println(repo.findByTechSorted("java")); mv.addObject(alien);
	 * return mv;
	 * 
	 * }
	 */
	/*
	 * post =submiting data ,get=fetching data, put =to update ,data delete= to delete
	 * data
	 */
	// all aliens
	// most of the servers supports json as default one so spring also supports json as default 
	// postman is used as client 
	//produces only supports xml not json,produces= {"application/xml"} if we given like this
	@PutMapping(path="/alien",consumes= {"application/json"})
	
	public Alien updateAlien(@RequestBody Alien alien){
		repo.save(alien);
		return alien;
	}
@PostMapping(path="/alien",consumes= {"application/json"})
	
	public Alien addAlien(@RequestBody Alien alien){
		repo.save(alien);
		return alien;
	}
	//by default get if we give like request mapping 
	//we can declare get and post either in annotation way or inside a method as method="post"
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable  int aid)
	
	{
		Alien a =repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}
	
@GetMapping(path="/aliens")
	public List<Alien> getAliens() {
		return repo.findAll();
	}
// all aliens
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}

}
