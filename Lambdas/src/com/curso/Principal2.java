package com.curso;

import java.util.function.*;

public class Principal2 {
	
	public static void main(String[] args) {
		
		BooleanSupplier b = () -> true;
		Predicate<String> p = z -> true;
		
		BiFunction<Integer,Integer,Integer> lambda01 = (x,y) -> x + y;
		BiFunction<Double,Double,Double> lambda02 = (x,y) -> x + y;
		BiFunction<Long,Long,Long> lambda03 = (x,y) -> x + y;
		BiFunction<String,String,String> lambda04 = (x,y) -> x + y;

		BinaryOperator<Integer> lambda05 = (x,y) -> x + y;
		BinaryOperator<Double> lambda06 = (x,y) -> x + y;
		BinaryOperator<Long> lambda07 = (x,y) -> x + y;
		BinaryOperator<String> lambda08 = (x,y) -> x + y;
		
		IntBinaryOperator lambda09 = (x,y) -> x + y;
		LongBinaryOperator lambda10 = (x,y) -> x + y;
		DoubleBinaryOperator lambda11 = (x,y) -> x + y;
		
		ToIntBiFunction<Integer,Integer> lambda12 = (x,y) -> x + y;
		ToDoubleBiFunction<Double,Double> lambda13 = (x,y) -> x + y;
		ToLongBiFunction<Long,Long> lambda14 = (x,y) -> x + y;


		
	}

}
