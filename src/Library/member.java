package Library;

import java.util.Scanner;

public class member {
	private int id;
	private String name;
	Scanner s=new Scanner(System.in);
	main p=new main();
	static int Max_books=3;
	book [] b=new book[3];
	int i=0;
	public member(int id,String name){
		this.id=id;
		this.name=name;
	}
	

	public void rent(String name){
		if(i!=3){
			
			
			for (book b : main.books) {
				if(b.getName()==name){
					if(b.status=="Available"){
						b.IdCurrentOwner=this.id;
						i++;
					}else{
						book.waitinglist[book.count++]=this.id;
					}
				}
			}
			
		}else{
			System.err.println("this member has reached his limits");
		}
	}
	public void retu(String name){
		for (book b : main.books) {
			if(b.getName()==name){
				for (book g : this.b) {
					if(g==b){
						g=null;
						i--;
					}
				}
				b.IdCurrentOwner=book.waitinglist[book.waiter++];
			}
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
