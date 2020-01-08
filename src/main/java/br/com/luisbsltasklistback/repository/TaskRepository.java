package br.com.luisbsltasklistback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.luisbsltasklistback.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
	
	Iterable<Task> findAllByStatusTrueOrderByDtCriacaoDesc();

}
