package Comparable;

public class Stude {

	private int id;
	private String name;
	
	
	public Stude(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	
	public boolean name(Stude s)
	{
		if(s.name.equals(this.name)&&s.id==this.id){
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Stude s1=new Stude(1,"tushar");
		Stude s2=new Stude(1,"tushar");
		
		System.out.println(s1.name(s2));
		
	}
	
}
