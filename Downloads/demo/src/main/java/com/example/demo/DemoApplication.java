package com.example.demo;


import com.example.demo.models.Video;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	SpringApplication app = new SpringApplication(DemoApplication.class);
	app.setAdditionalProfiles("postgresql");
	app.run(args);


	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	){
		return args -> {
		/*	var author = Author.builder()
					.firstName("Bilal")
					.lastName("Berek")
					.email("bilal@gmail.com")
					.build();
			authorRepository.save(author);

			var author2= Author.builder()
					.firstName("Bedia")
					.lastName("Berek")
					.email("bedia@gmail.com")
					.build();
			authorRepository.save(author2);
			*/
			var video = Video.builder()
					.length(45)
					.name("video_1")
					.url("wwww.wrrr.org")
					.build();
			videoRepository.save(video);

		};
	}

}
