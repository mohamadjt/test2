package Library;

import java.util.Scanner;

public class main {
	static member [] members;
	static book [] books;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.println();
		books=new book[m];
		members=new member[n];
		for(int i=0;i<m;i++){
			String ketab=s.next();
			System.out.print("*");
			books[i]=new book(ketab);
		}
		for(int p=0;p<n;p++){
			String nam=s.next();
			int j=0;
			System.out.print("*");
			String name="";
			int id;
			while(nam.charAt(j)!=' '){
				name=name+nam.charAt(j);
			}
			j++;
			String idd="";
			while(j<=nam.length()){
				idd=idd+nam.charAt(j);
			}
			id=Integer.parseInt(idd);
			members[p]=new member(id,nam);
		}
		
		String a="";
		inner :do{
			a=s.nextLine();
			if(a.equals("End")){
				System.out.println("Finished");
				break inner;

			}
			int i=0;
			String name="";
			while(a.charAt(i)!=' '){
				name=name+a.charAt(i);
				i++;
			}
			i=i+1;
			String Action="";
			while(a.charAt(i)!=' '){
				Action=Action+a.charAt(i);
				i++;
			}
			i=i+1;
			String book="";
			while(i<=a.length()+1){
				book=book+a.charAt(i);
				i++;
			}
			
			switch (Action){
					case "rent":
						for (member b : members) {
							if(b.getName()==name){
								b.rent(book);
						}	
						}
					case "return":
						for(member b:members){
							if(b.getName()==name)
								b.retu(book);
						}
							
			}
				
		}while(!a.equals("End"));
		s.close();


	}
	
	
		

}
