package quera;

public class Circle extends Shape {

	Double redius;

	public Circle(Color c, Pattern p, double r) {
		super(c, p);
		this.redius = r;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle["+this.color+","+this.pattern+",redius:"+this.redius+"]";
	}
	
	public boolean equals(Circle obj){
		if(this.color.equals(obj.color))
			return false;
		if(this.pattern.equals(obj.pattern))
			return false;
		if(this.redius.equals(obj.redius))
			return false;
		
		
		return true;
	}

	
}
