package com.epam.JUnitAndTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFromString {
	DeleteAFromString del;
	@BeforeEach
	void setUp()
	{
		del=new DeleteAFromString();
	}

	@Test
	void test1() {
		assertEquals("BCD",del.deleteA("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("CD",del.deleteA("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD",del.deleteA("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA",del.deleteA("BBAA"));
	}
	@Test
	void test5() {
		assertEquals("BAA",del.deleteA("AABAA"));
	}
	@Test
	void test6() {
		assertEquals("",del.deleteA("AA"));
	}
	@Test
	void test7() {
		assertEquals("B",del.deleteA("AB"));
	}
}
