
public class App {

	public static void main(String[] args) {
		Folder racine=new Folder("Racine");
		Folder f1=new Folder("Structure");
		Folder f2=new Folder("Comportement");
		Folder f3=new Folder("Creation");
		
		racine.addComponent(f1);
		racine.addComponent(f2);
		racine.addComponent(f3);
		racine.view();
		
		f1.addComponent(new File("Composite"));
		f1.addComponent(new File("Decorator"));
		
		f2.addComponent(new File("Strategy"));
		
		f3.addComponent(new File("Singleton"));
		f3.addComponent(new File("Builder"));
		
		racine.view();

		

		
	}
}
