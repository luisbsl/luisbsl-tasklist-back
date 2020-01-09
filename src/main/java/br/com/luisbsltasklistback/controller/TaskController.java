package br.com.luisbsltasklistback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luisbsltasklistback.model.Task;
import br.com.luisbsltasklistback.service.TaskService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public ResponseEntity<Iterable<Task>> getTasks() {
		Iterable<Task> tasks = taskService.findAllByStatusTrueOrderByDtCriacaoDesc();
		return new ResponseEntity<Iterable<Task>>(tasks, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> postTask(@RequestBody Task task) {
		taskService.save(task);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<HttpStatus> putTask(@RequestBody Task task) {
		taskService.update(task);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteTask(@PathVariable Integer id) {
		taskService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
