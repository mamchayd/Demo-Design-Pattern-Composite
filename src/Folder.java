import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

	private List<Component> components=new ArrayList<>(); 
	
	public Folder(String n) {
		super(n);
	}


	@Override
	public void view() {
		String tab=indentation();
		System.out.println(tab+"Folder : "+name);
		for(Component c:components) {
			c.view();
		}
	}
	
	
	public Component addComponent(Component component) {
		component.level=this.level+1;
		this.components.add(component);
		return component;
	}

}
