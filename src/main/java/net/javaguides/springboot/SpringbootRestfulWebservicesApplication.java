package net.javaguides.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Tag(
        name = "CRUD Rest APIs for User Resource",
        description = "CRUD Rest APIs: Create User, Update User, Delete User and Get All User Rest APIs"

)
@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot Restful Web Services",
                description = "Spring Boot Restful API Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Vinícius Meneses",
                        email = "viniciusmenesesdev@gmail.com",
                        url = "https://github.com/vinimeneses"
                ),
                license = @io.swagger.v3.oas.annotations.info.License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"
                )
        )
)
public class SpringbootRestfulWebservicesApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
    }

}

