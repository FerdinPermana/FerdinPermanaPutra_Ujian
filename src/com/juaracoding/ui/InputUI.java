package com.juaracoding.ui;

import java.util.Scanner;


import com.juaracoding.main.rumus.HitungKecepatan;

public class InputUI {
	 HitungKecepatan cepat;

	
	 public InputUI () {
			if(cepat == null) {
				cepat = new HitungKecepatan();
			}	
		}
	 
	public void testHitungKecepatan() {
		Scanner input=new Scanner(System.in);
		System.out.println("Masukan jarak (kilometer)  = ");
		double jarak = input.nextInt();
		System.out.println("Masukan waktu (jam)  = ");
		double waktu = input.nextInt();
		
		System.out.println("Kecepatannya  adalah = " + cepat.hitungKecepatan(jarak, waktu));
	}

}
