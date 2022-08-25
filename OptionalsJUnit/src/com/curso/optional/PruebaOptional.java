package com.curso.optional;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

public class PruebaOptional {

	// https://www.baeldung.com/java-optional

	public String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}

	// Prueba para crear un Optional
	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
		Optional<String> empty = Optional.empty();
		assertFalse(empty.isPresent());
	}

	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
		String name = "baeldung";
		Optional<String> opt = Optional.of(name);
		assertTrue(opt.isPresent());
	}

	// JUnit5 assertThrows(NullPointerException.class)
	@Test(expected = NullPointerException.class) // JUnit4
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
		String name = null;
		Optional.of(name);
	}

	@Test
	public void givenNonNull_whenCreatesNullable_thenCorrect() {
		String name = "baeldung";
		Optional<String> opt = Optional.ofNullable(name);
		assertTrue(opt.isPresent());
	}

	@Test
	public void givenNull_whenCreatesNullable_thenCorrect() {
		String name = null;
		Optional<String> opt = Optional.ofNullable(name);
		boolean r = opt.isPresent();
		assertFalse(r);
	}

	@Test
	public void givenOptional_whenIsPresentWorks_thenCorrect() {
		Optional<String> opt = Optional.of("Baeldung");
		assertTrue(opt.isPresent());

		opt = Optional.ofNullable(null);
		assertFalse(opt.isPresent());
	}

	@Test
	public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
		Optional<String> opt = Optional.of("Baeldung");
		assertFalse(opt.isEmpty());

		opt = Optional.ofNullable(null);
		assertTrue(opt.isEmpty());
	}

	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
		Optional<String> opt = Optional.of("baeldung");
		opt.ifPresent(name -> System.out.println(name.length()));
	}

	@Test
	public void whenOrElseWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("john");
		assertEquals("john", name);
	}

	@Test
	public void whenOrElseGetWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
		assertEquals("john", name);
	}

	@Test
	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
	    String text = null;

	    String defaultText = Optional.ofNullable(text)
	    						.orElseGet(()->this.getMyDefault());
	    						//.orElseGet(this::getMyDefault);
	    assertEquals("Default Value", defaultText);

	    defaultText = Optional.ofNullable(text).orElse("Default Value");
	    assertEquals("Default Value", defaultText);
	}
}
