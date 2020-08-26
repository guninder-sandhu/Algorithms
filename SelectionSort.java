package selection_sort;

import java.util.Scanner;

public class SelectionSort {
	
	int [] arrayToBeSorted;
	Scanner scan=new Scanner(System.in);
	
	
	SelectionSort(){
		System.out.println("Enter the number of elements");
		int total=scan.nextInt();
		this.arrayToBeSorted=new int[total];
		for(int i=0;i<total;i++) {
			System.out.println("Enter the "+i+" number of elements");
			this.arrayToBeSorted[i]=scan.nextInt();
		}
		
	}
	
	public void Sort() {
		int minIndex,min;
		boolean swapRequired=false;
		for(int i=0;i<arrayToBeSorted.length;i++) {
			minIndex=i;
			min=this.arrayToBeSorted[i];
			for(int j=i+1;j<this.arrayToBeSorted.length;j++) {
				if(this.arrayToBeSorted[j]<min) {
					min=this.arrayToBeSorted[j];
					minIndex=j;
					swapRequired=true;
				}
			}
			if(swapRequired) {
				swap(i,minIndex);
			}
			//else {
				
			//	break;
			//}
			
				
		}
		
		for(int x:this.arrayToBeSorted) {
			System.out.print(x+" ");
		}
			
		}
	
	public void swap(int i,int j) {
		
		//System.out.println("swap called, pos="+i+"and minindex="+j);
		int temp=this.arrayToBeSorted[i];
		this.arrayToBeSorted[i]=this.arrayToBeSorted[j];
		this.arrayToBeSorted[j]=temp;
		
		//System.out.println("------------");
		
	}
	public static void main(String[] args) {
		SelectionSort s=new SelectionSort();
		s.Sort();
	}

}
