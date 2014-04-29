package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseのテスト() {
		SnakeCamelUtil snakecamel = new SnakeCamelUtil();
		String expected = ("Snake");
		String actual = snakecamel.snakeToCamelcase("snake_case");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void camelToSnakecaseのテスト() {
		SnakeCamelUtil snakecamel = new SnakeCamelUtil();
		String expected = ("camelcase");
		String actual = snakecamel.camelToSnakecase("camelcase");
		assertThat(actual,is(expected));
	}

}
