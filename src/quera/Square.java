package quera;

public class Square extends Shape {

	Integer length;

	public Square(Color c, Pattern p, int length) {
		super(c, p);
		this.length = length; 

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square["+this.color+",pattern:"+this.pattern+", length:"+this.length+"]";
	}
	
	public boolean equals(Square obj){
		if(this.color.equals(obj.color)&&this.length.equals(obj.length)&&this.pattern.equals(obj.pattern))
			return true;
		return false;
	}

	
}
