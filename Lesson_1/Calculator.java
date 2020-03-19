public class Calculator{
	
	public static void main(String[] args){

		int a=3;
		int b=2;
		double result;
		char sum='+';
		char minus='-';
		char ymn='*';
		char delenie='/';
		char stepen='^';
		char ostatok='%';
		

		if (sum=='+'){
			result=a+b;
			System.out.println("a+b="+result);
		}

		if (minus=='-'){
			result=a-b;
			System.out.println("a-b="+result);
		}

		if (ymn=='*'){
			result=a*b;
			System.out.println("a*b="+result);
		}

		if (delenie=='/'){
			result=a/b;
			System.out.println("a/b="+result);
		}

		if (stepen=='^'){
			result=1;
			for (int i=1;i<=b;i++){
				result=result*a;
			}
			
			System.out.println("a^b="+result);
		}

		if (ostatok=='%'){
			result=a%b;
			System.out.println("a%b="+result);
		}


	}
}