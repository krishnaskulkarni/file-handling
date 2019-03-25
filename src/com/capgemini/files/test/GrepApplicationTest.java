package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.assignments.GrepApplication;

public class GrepApplicationTest {

	@Test
	public void test() throws IOException {
		GrepApplication file = new GrepApplication();
		file.checkAppearances().get(3);
		System.out.println(file.checkAppearances());
		assertEquals("Hello ....",file.checkAppearances().get(1));
	}

}
