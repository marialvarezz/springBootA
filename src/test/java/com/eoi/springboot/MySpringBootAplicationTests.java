package com.eoi.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = MySpringBootAplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Log4j2
class MySpringBootAplicationTests {


		@Autowired

		private TestRestTemplate template;



		/**

		 * Hello main.

		 *

		 * @throws Exception the exception

		 */

		@Test

		void hello_main() throws Exception {

			ResponseEntity<String> response = template.getForEntity("/", String.class);

			assertThat(response.getBody()).isEqualTo("Main class");

		}




		@Test

		void hello_hola() throws Exception {

			ResponseEntity<String> response = template.getForEntity("/hola", String.class);

			assertThat(response.getBody()).isEqualTo("Hola mundo!");

		}



	}

