package myrepository;

public class Sum {
public static void main(String[] a){
	Sum s=new Sum();
	double sum=s.sum(10, 20);
	System.out.println("Sum =="+sum);
}
public double sum(double a,double b){
	return (a+b);
}
}
