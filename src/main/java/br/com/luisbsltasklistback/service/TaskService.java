package br.com.luisbsltasklistback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luisbsltasklistback.model.Task;
import br.com.luisbsltasklistback.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Iterable<Task> findAllByStatusTrueOrderByDtCriacaoDesc() {
		return taskRepository.findAllByStatusTrueOrderByDtCriacaoDesc();
	}
	
	public Task save(final Task task) {
		return taskRepository.save(task);
	}
	
	public void delete(final Integer id) {
		Task task = taskRepository.findById(id).get();
		task.setStatus(false);
		task.setRemocao(true);
		this.save(task);
	}
	
	public void update(final Task task) {
		Task taskToUpdate = taskRepository.findById(task.getId()).get();
		taskToUpdate.setDescricao(task.getDescricao());
		taskToUpdate.setTitulo(task.getTitulo());
		taskToUpdate.setEdicao(task.getEdicao());
		taskToUpdate.setConclusao(task.getConclusao());
		if(Boolean.FALSE.equals(taskToUpdate.getEdicao())) {
			taskToUpdate.setEdicao(true);
		}
		this.save(taskToUpdate);
	}

}
