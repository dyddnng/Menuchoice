package choice;

public class Food {
	private String name;  //음식이름
 	private String flavor; //음식 맛
	private String size;   //사이즈 : 대/중/소
	private int num; //랜덤할때 비교해서 쓰려고
	
	
	public Food(String name, String flavor, String size, int num) {
		super();
		this.name = name;
		this.flavor = flavor;
		this.size = size;
		this.num = num;
	}
	
	
	@Override
	public String toString() {
		return "음식이름은 : " + name + ", 음식맛은 :" + flavor + " 음식 양은 : " + size;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	
	
	
}
