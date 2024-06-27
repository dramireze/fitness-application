package dev.dramireze.fitnessapplication;

import dev.dramireze.fitnessapplication.user.UserHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication(scanBasePackages = { "dev.dramireze.fitnessapplication.run", "dev.dramireze.fitnessapplication.user"})
public class FitnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessApplication.class, args);
	}

	@Bean
	UserHttpClient userHttpClient() {
		RestClient restClient = RestClient.create("https://jsonplaceholder.typicode.com/");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
		return factory.createClient(UserHttpClient.class);
	}

}
