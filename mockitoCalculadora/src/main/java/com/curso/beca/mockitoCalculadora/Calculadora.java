package com.curso.beca.mockitoCalculadora;

public class Calculadora {
	
	CloudCalculadora cloudCalc;
	
	double suma(double a,double b) {
		return a+b;
	}
	
	double sumaCloud(double a,double b) {
		double resultadoSuma = cloudCalc.sumaExterna(a,b);
		return resultadoSuma;
	}

}
