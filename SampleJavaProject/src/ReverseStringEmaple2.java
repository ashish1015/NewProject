
public class ReverseStringEmaple2 {
	String abc = "Hello World i should be reversed";
	
	void reverse(){
	char[] rev =abc.toCharArray();
	for(int i =abc.length()-1 ;i>=0;i--){
	System.out.print(rev[i]);
	}
	System.out.println("\n");
	}
	
	
	void wordrevese() {
	String [] Tok = abc.split(" ");

	for(int k = Tok.length-1 ;k>=0;k--){
	System.out.print(Tok[k]+" ");
	}
	}


	public static void main(String[] args){
		ReverseStringEmaple2 RV = new ReverseStringEmaple2();
	RV.reverse();
	RV.wordrevese();
	}

}
