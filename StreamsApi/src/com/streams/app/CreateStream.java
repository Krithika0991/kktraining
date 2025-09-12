package com.streams.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateStream {
 public static void main(String[] args) {
	List<String> Courses = Arrays.asList("java","c","c++","spring","html","css");
	//list to convert stream
	Courses.stream().filter(str->str.length()>2).forEach(str->System.out.println(str.toUpperCase()));
	
	System.out.println();
	//Stream<String> st=Courses.stream().filter(str->str.length()>3).sorted().limit(1);
	//System.out.println(st);
	
	List<String> Coursess= Courses.stream().filter(str->str.length()>2).sorted().limit(4)
  // .toList()
   .collect(Collectors.toList());
	//System.out.println(Coursess);
	
	Coursess.forEach(System.out::println);


}
}
