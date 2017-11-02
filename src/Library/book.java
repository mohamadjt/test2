package Library;

import java.util.Scanner;

public class book {
	private String name;
	static int [] waitinglist=new int[100];
	String status="Availabe";
	int IdCurrentOwner;
	static int count=0;
	static int waiter=0;
	Scanner s=new Scanner(System.in);
	public book(String name){
		 this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print(){
		if(IdCurrentOwner!=0&& waitinglist[0]==0){
			System.out.printf("%s ,Rented by : %d ",name,IdCurrentOwner);
	}	
		if(IdCurrentOwner==0){
			System.out.printf("%s",name);
		}
		if(IdCurrentOwner!=0&& waitinglist[0]!=0){
			System.out.printf("%s ,Rented by : %d ,WaitingList:  ",name,IdCurrentOwner);
			for (int i : waitinglist) {
				System.out.print(i+" ");
			}
			
		}
	}
}
