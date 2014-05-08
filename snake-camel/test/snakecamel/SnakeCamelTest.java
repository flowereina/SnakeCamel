package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseのテスト() {
		SnakeCamelUtil snakecamel = new SnakeCamelUtil();
		String expected = ("SnakeCase");
		String actual = snakecamel.snakeToCamelcase("snake_case");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void camelToSnakecaseのテスト() {
		SnakeCamelUtil snakecamel = new SnakeCamelUtil();
		String expected = ("camel_case");
		String actual = snakecamel.camelToSnakecase("CamelCase");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void capitalizeのテスト() {
		SnakeCamelUtil snakecamel = new SnakeCamelUtil();
		String expected = ("Snake");
		String actual = snakecamel.capitalize("snake");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void uncapitalizeのテスト() {
		SnakeCamelUtil snakecamel = new SnakeCamelUtil();
		String expected = ("camel");
		String actual = snakecamel.uncapitalize("Camel");
		assertThat(actual,is(expected));
	}

}
