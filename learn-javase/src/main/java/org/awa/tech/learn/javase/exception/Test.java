package org.awa.tech.learn.javase.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws IOException {

		try {
//			throw new InterruptedIOException("");
			throw new FileNotFoundException("");
		} catch (IOException e) {
			try {
				throw e;
			} catch (FileNotFoundException e1) {

			}
		}

	}

	public static void test(String[] args) {
		Test test = new Test();
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		test.excute(list,list2);
	}

	@SafeVarargs
	public static  <T> void excute(T... args){
		System.out.println(args.length);
	}
}
