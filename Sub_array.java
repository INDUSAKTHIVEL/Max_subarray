package Max_Subarray;
import java.util.*;
public class Sub_array {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter size:");
		        int n = sc.nextInt();
		        int[] arr= new int[n];
		        int b = sc.nextInt();
		        System.out.println("Enter the array");
		        for(int i=0;i<n;i++){
		            arr[i] = sc.nextInt();
		        }
		        int sum=0;
		        for(int j=0;j<n;j++){
		            for(int k=j;k<n;k++){
		                for(int l=j;l<=k;l++){
		                    if(sum<=b){
		                        break;
		                    }
		                    sum+=arr[l];
		                    
		                }
		            }
		        }
		        System.out.println("The sum is"+sum);
		    }

	}

