package array;

public class ArrayLab {

	public static void main(String[] args) {
		double[]x= {1.1,2.0,1.2,1.4,0.5,6.0};
		double max=x[0];
		double min=x[0];
		double sum=0;
		
		
		for(int i=0;i<x.length;i++) {
			if (max<x[i]) {
			max=x[i];
			}
			if(min>x[i]) {
				min=x[i];
			}
			sum+=x[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
