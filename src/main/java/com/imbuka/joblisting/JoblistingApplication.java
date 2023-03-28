package com.imbuka.joblisting;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Job Listing Project",
                version = "1.0.0",
                description = "A backend application for connecting developers to jobs",
                termsOfService = "imbuka",
                contact = @Contact(
                        name = "Alvin Imbuka",
                        email = "imbuka@gmail.com"
                ),
                license = @License(
                        name = "licence",
                        url = "imbuka"
                )
        )
)
public class JoblistingApplication {
    public static void main(String[] args) {
        SpringApplication.run(JoblistingApplication.class, args);
    }

}
