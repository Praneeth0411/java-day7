public class Program1 {
    static void arRR(int[] x) {
    	int len = x.length;
    	int arrLen = len -1;
    	int t=x[arrLen];
    	//num[4]=num[3]
    	//num[3]=num[2]
    	//num[2]=num[1]
    	//num[1]=num[0]
    	for(int i=arrLen;i>=1;i--) {
    		x[i]=x[i-1];
    	}
    	x[0]=t;
    	
    	
    	System.out.println("\n after 1 right Rotation");
    	for(int i=0;i<arrLen;i++) {
    		System.out.print(x[i]+" ");
    	}
    }
	public static void main(String[] args) {
		//right side rotation
		//0 1 2 3 4
		//10 20 30 40 50
		//length ---5
		//arLen = len -1;
		//3---4
		//2---3
		//1---2
		//0---1
		//50 10 20 30 40 --1
		int[]num = {10,20,30,40,50};
		System.out.println("Befor Right Rotation");
		for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");	
		}
	arRR(num);
	arRR(num);
	arRR(num);
		}
		
		
	}


