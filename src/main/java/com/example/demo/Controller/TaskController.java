package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Repository.TaskRepository;
import com.example.demo.model.Task;

@Controller
public class TaskController {

	@Autowired
	TaskRepository repo;
	
	@PostMapping("/insert")
	public String create(Task task)
	{
		repo.save(task);
		return "redirect:/index.html";
	}
	
	@GetMapping("/AllTask")
	public String readData(Model m)
	{
		List<Task> task = repo.findAll();
		m.addAttribute("task",task);
		return "ReadAll";
	}
	
	@GetMapping("/delete")
	public String delete(int taskId)
	{
		repo.deleteById(taskId);
		return "redirect:/index.html";
	}
	
	@GetMapping("/update")
	public String update(Task t)
	{
		Task tsk = repo.findById(t.getTaskId()).get();
		tsk.setDescription(t.getDescription());
		repo.save(tsk);
		return "redirect:/index.html";
		
		
		
		
		
		
	}
}
