package com.capgemini.files.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.assignments.FileExistApplication;
import com.capgemini.files.assignments.LineCount;

public class LineCountTest {

	@Test
	public void testNumberOfLines() throws IOException {
		LineCount file = new LineCount();
		assertEquals(48, file.numberOfLines());
	}

	
}
