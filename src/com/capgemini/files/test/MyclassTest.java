package com.capgemini.files.test;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.files.assignments.Myclass;

public class MyclassTest {

	private static Myclass student1;
	private static Myclass student2;
	private static Myclass student3;
	private static Myclass student4;
	private static Myclass student5;

	@BeforeClass
	public static void setUp() {
		student1 = new Myclass(23, "tonny Starc", "Computer");
		student2 = new Myclass(34, "John", "Mechanical");
		student3 = new Myclass(45, "ricky ", "ENTC");
		student4 = new Myclass(54, "alex", "Instrumentation");
		student5 = new Myclass(22, "Grant", "IT");
	}

	@Test
	public void test() throws IOException, ClassNotFoundException {
		ArrayList<Myclass> arrayList = new ArrayList<Myclass>();
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);

		FileOutputStream fileOutputStream = new FileOutputStream("student.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(arrayList);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("student.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		ArrayList<Myclass> arrayList2 = (ArrayList<Myclass>) inputStream.readObject();

		Iterator<Myclass> iterator = arrayList.iterator();
		Iterator<Myclass> iterator2 = arrayList2.iterator();

		while (iterator.hasNext() && iterator2.hasNext()) {

			assertTrue(iterator.next().equals(iterator2.next()));
		}

		inputStream.close();

	}

}
