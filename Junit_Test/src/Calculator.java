
public class Calculator {
	private int result;
	
	public int cal(int num1,int num2,char opr) {
		switch (opr) {
		case '+':
			add(num1, num2);
			break;
		case '-':
			substract(num1, num2);
			break;
		case '*':
			multiply(num1, num2);
			break;
		case '/':			
			divide(num1, num2);
			break;
		default:
			System.out.println("非法运算符");
			break;
		}
		return result;
	}
    public void add(int num1,int num2) {
        result = num1+num2;
    }
    public void substract(int num1,int num2) {
        result = num1-num2; 
    }
    public void multiply(int num1,int num2) {
    		result = num1*num2;
    }         
    public void divide(int num1,int num2) {
        result = num1/num2;
    }
    
}
