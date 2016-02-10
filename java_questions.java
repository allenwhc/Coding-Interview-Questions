import java.lang.StringBuffer;

public class java_questions{

	//1. Boolean types
	static String str;
	public static boolean test1(){
		return new Boolean("1");
	}

	public static boolean test2(){
		return new Boolean(str);
	}

	//2. Overload
	public static String getValue(Integer i){
		return "integer";
	}

	public static String getValue(Object o){
		return "object";
	}

	//3. Class call another class
	public static class class1{
		public static void main(String[] args) {
			String[] names={"1","2","3"};
			java_questions.main(names);
		}
	}

	//4. for-loop
	public static void forLoop(int[] nums){
		System.out.print("Original Array: ");
		for(int i:nums){
			System.out.print(i);
		}
		System.out.println();
		System.out.print("Using iteration variable: ");
		for(int i:nums){
			i+=5;
		}
		for(int i:nums){
			System.out.print(i);
		}
		System.out.println();
		System.out.print("Using index: ");
		for(int i=0; i<nums.length; i++){
			nums[i]+=5;
		}
		for(int i:nums){
			System.out.print(i);
		}
		System.out.println();
	}

	//5. Switch command
	public static void switchCommandTest(int[] nums){
		int x=0;
		for(int i:nums){
			switch(i){
				case 1:
					x+=i;
				case 5:
					x+=i;
				default:
					x+=i;
				case 2:
					x+=i;
			}
			System.out.println(x);
		}
	}

	//Confusing overload
	public static void method(int[] v){
		System.out.println("int");
		for(int n:v)
			System.out.println(v);
	}

	public static void method(boolean[] v){
		System.out.println("bool");
		for(boolean b:v)
			System.out.println(v);
	}

	//String Buffer
	public static void stringBufferCheck(){
		 String s = "";
    
	    StringBuffer sb1 = new StringBuffer("Hi");
	    StringBuffer sb2 = new StringBuffer("Hi");
	    StringBuffer sb3 = new StringBuffer(sb2);
	    StringBuffer sb4 = sb3;
	    
	    if(sb1.equals(sb2)) s += "1";
	    if(sb2.equals(sb3)) s += "2";
	    if(sb3.equals(sb4)) s += "3";
	    
	    String s1 = "Hi";
	    String s2 = "Hi";
	    String s3 = s2;
	    
	    if(s1.equals(s2)) s += "4";
	    if(s2.equals(s3)) s += "5";
	    
	    System.out.println(s);
	}

	public static void main(String[] args) {
		System.out.println("Boolean tests: ");
		if(test1())
			System.out.print("1");
		if(!test2())
			System.out.print("2");
		if(test1()!=test2())
			System.out.print("3");
		System.out.println();

		System.out.println("Overload test: ");
		System.out.println(getValue(2));

		System.out.println("Class call another class test:");
		for(String s:args)
			System.out.print(s);
		System.out.println("4");

		System.out.println("For-loop test: ");
		int[] nums={1,2,3,5};
		forLoop(nums);

		System.out.println("Switch command test: ");
		switchCommandTest(nums);

		// System.out.println("Confusing overload test: ");
		// method();
		System.out.println("String test: ");
		stringBufferCheck();
	}
}