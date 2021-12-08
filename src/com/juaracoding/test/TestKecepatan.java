package com.juaracoding.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.juaracoding.main.rumus.HitungKecepatan;

public class TestKecepatan {
	 HitungKecepatan cepat;

	@Before
	public void setUp() throws Exception {
		
		cepat = new  HitungKecepatan();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testHitungKecepatan() {
		assertEquals(40.0, cepat.hitungKecepatan(200.0, 5.0),0.0);
	//	assertEquals("Inputan Bukan angka ", 25.0, cepat.hitungKecepatan(q.0, 0),0.0);
	//	assertEquals("Inputan harus positif ", 12.0, cepat.hitungKecepatan(-600.0, 50.0),0.0);
	//	assertEquals("Inputan tidak boleh 0 ", 0.0, cepat.hitungKecepatan(0.0, 0),0.0);
	}

}
