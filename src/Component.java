
public abstract class Component {
	
	protected String name;
	protected int level;
	public Component(String n) {
		this.name=n;
	}
	
	public abstract void view();
	
	public String indentation() {
		String str="";
		for(int i=0;i < level;i++) {
			
		}
		return str;
	}

}
