package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class fizzBuzz {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("print a number："); 
		int num = sc.nextInt(); 
		List<String> list = fizzBuzz(num);
		System.out.println(list);
		
		
		
		for(int k = 0;k<num;k++){
			if(list.get(k)=="Fizz"){
				list.set(k, "Fuck");
			}
		}
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);


	}

	public static List<String> fizzBuzz(int n) {
		ArrayList<String> list = new ArrayList();
		for(int i = 1; i<n+1;i++){
			if(i%15==0){
				System.out.print("FFFF"+" ");
				list.add("FizzBuzz");
			}else if(i%3==0){
				System.out.print("FFFghsafdfuhF"+" ");

				list.add("Fizz");
			}else if(i%5==0){
				System.out.print("FFdsfFF"+" ");

				list.add("Buzz");
			}else{
				System.out.print(i+" ");

				list.add(Integer.toString(i));
			}
		}		
		return list;       
    }
}
