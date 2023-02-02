package com.example.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalkulatorApplication.class, args);

		Calculator calc = new Calculator();
		int a=8;
		int b=3;
		calc.addAtoB(a,b);
		calc.subtractBfromA(a,b);
	}







}
