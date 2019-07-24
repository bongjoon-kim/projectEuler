import java.util.Arrays;

public class Euler24a {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		int a[]={0,1,2,3,4,5,6,7,8,9};
		for(int i=1;i<1000000;nextPerm(a),++i);
		System.out.println(Arrays.toString(a));
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간(밀리초):" + (endTime - startTime) );			
	}
	
	static boolean nextPerm(int a[]) {
		for(int n=a.length-1,i=n,j;i>0;)
			if(a[i--]>a[i]) {
				for(j=n;a[j]<=a[i];j--);
				a[j]=a[j]^a[i]^(a[i]=a[j]);
				for(j=i,i=n+i>>1;++j<=i;a[j]=a[j]^a[n]^(a[n--]=a[j]));
				return true;
			}
		return false;
	}

}
