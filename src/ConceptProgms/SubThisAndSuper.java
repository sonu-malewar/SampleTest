package ConceptProgms;

public class SubThisAndSuper extends ThisAndSuper1 {
	int a=1000;


	public SubThisAndSuper(String a){
	
		super(10,"Tech");
		
		
		
		
	}
	
	
    void show(String s) {
    	
    
    	super.show();
		
		
	}
	
	public static void main(String[] args) {
		SubThisAndSuper s1 = new SubThisAndSuper("java");
		s1.show();
		
	
		
		
	}
		
}
