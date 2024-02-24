package com.springlec.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springlec.base.service.CalcService;

@Configuration
public class DataAccessConfig {

	// Spring을 켜자마자 만들어져 있음 (객체가 생성됨)
	@Bean
	CalcService calcServiceAdd() {
		return new CalcService() {
			
			@Override
			public int addition(int num1, int num2) throws Exception {
				// TODO Auto-generated method stub
				return num1 + num2;
			}

			@Override
			public int subtraction(int num1, int num2) throws Exception {
				// TODO Auto-generated method stub
				return num1 - num2;
			}

			@Override
			public int multiplication(int num1, int num2) throws Exception {
				// TODO Auto-generated method stub
				return num1 * num2;
			}

			@Override
			public double division(double num1, double num2) throws Exception {
				// TODO Auto-generated method stub
				return num1 / num2;
			}
		};
	}
}
