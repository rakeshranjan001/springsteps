package com.springsteps.project;

import com.springsteps.project.bean.SpringStepsStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return String.format("Home !!");
	}

	@GetMapping("/status")
	public SpringStepsStatus status() {
		SpringStepsStatus status = new SpringStepsStatus();
		return status;
	}
	@GetMapping("/login")
	public String login() {
		return String.format("Hello Login!!");
	}
}
