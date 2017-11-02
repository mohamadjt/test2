package mafiia;
import java.util.Random;

public class God {

	public static void main(String[] args) {

		Person[] players = new Person[10];
		String[] name= {"ali","asghar","majid","mohamad","bahram","kamran","naser","mahdi","ghasem","pedram"};
		
		int inspector=0,doc=0;
		
		for(int t=0; t<10;t++) {
			
			players[t]= new Person(name[t],1, true);
			
		}
		
	//	int[] list = new int[6];
		int count = 0;
		while (count <= 2) {
			
			int play = rand();
			if(players[play].getID()!=2) {
				
				players[play].setID(2);
				count+=1;
			}
			
		}
		
		count = 0;
		while(true) {
			
			int p = rand();
			if(players[p].getID()!=3) {
				
				players[p].setID(3);
				doc=p;
				break;
			}
		}
		
		while(true) {
			
			int p = rand();
			if(players[p].getID()!=4) {
				
				players[p].setID(4);
				inspector=p;
				break;
			}
		}
		
		int co=0;
		boolean bool=true;
		while(bool==true) {
			
			
			night(players);
			System.out.println(co);
			if(round(players)==false) {
				
				System.out.println("finished");
				bool=false;
			}
			co+=1;
		}
		
		

	}
	
	static public boolean round(Person[] players) {
		
		int mafiaCount=0;
		int policeCount=0;
		
		for(int i=0;i<players.length;i++) {
			
			if(players[i].getID()==1 && players[i].getState()==true) {
				
				policeCount+=1;
			}else if(players[i].getID()==2 && players[i].getState()==true) {
				
				mafiaCount+=1;
			}
		}
		
		if(mafiaCount==0 || (policeCount<mafiaCount)) {
			
			return false;
		}else {
			
			return true;
		}
		
	}

	static public void night(Person[] players) {
		
		int[] mafiaVote = mafiaVote(players);
		int mafiaVoted=max(mafiaVote);
		int inspectorVoted=inspectorVote(players);
		int docVoted=docVote(players);
		
		int[] votes= {mafiaVoted,docVoted};
		day(players,votes);
		
	}
	
	static public void day(Person[] players,int[] votes) {
		
		if(votes[0]!=votes[1]) {
			
			players[0].setState(false);
		}
		
		int dayVote=-1;
		while(true) {
			
			dayVote=rand();
			if(players[dayVote].getState()==true) {
				break;
			}
			
		}
		
		players[dayVote].setState(false);
	}
	
	static int rand() {

		Random rand = new Random();
		int i = rand.nextInt(9);

		return i;
	}
	
	static int[] mafiaVote(Person[] players) {
		
		int[] vote = {-1,-1,-1};
		//int[] vote=new int[3];
		int count =0;
		for(int i=0; i<players.length;i++) {
			
			if(players[i].getID()==2 && players[i].getState()==true) {
				
				while(true) {
					int mafiaVote=players[i].select();
					if(players[mafiaVote].getID()!=2) {
						vote[count]= mafiaVote;
						count+=1;
						break;
				
				}
				}
			}
			
		}
		
		return vote;
	}
	
	static public int max(int[] vote) {
		
		int[] elected=new int[10];
		
		for(int e=0; e<vote.length;e++) {
		//	System.out.println("max"+" "+ vote[e] +" "+elected[vote[e]]);
			if(vote[e]!=-1) {
			elected[vote[e]]=elected[vote[e]]+1;
			}
		}
		int temp=elected[0];
		for(int c=1; c<elected.length;c++) {
			
			if(temp<elected[c]) {
			temp=elected[c];
			
			}
		}
		return temp;
	}
	
	static public int inspectorVote(Person[] players) {
		
		int vote=-1;
		
		for(int i=0;i<players.length;i++) {
			
			if(players[i].getID()==4 && players[i].getState()==true) {
				
				while(true) {
					vote=players[i].select();
					if(players[vote].getID()!=4 && players[vote].getState()==true) {
					
						break;
				}
				
				}
				
			}
		}
		
		
		return vote;
	}
	
	static public int docVote(Person[] players) {
		
		int vote=-1;
		
		for(int i=0;i<players.length;i++) {
			
			if(players[i].getID()==3 && players[i].getState()==true) {
				
				while(true) {
					vote=players[i].select();
					if(players[vote].getID()!=3 && players[vote].getState()==true) {
					
						break;
				}
				
				}
				
			}
		}
		
		
		return vote;
	}
	
	

}
