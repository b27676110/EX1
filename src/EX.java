
public class EX {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff [] staf = new Staff[3];
		staf [0] = new Staff("Jack",1234,"Chairman");
		staf [1] = new Staff("Mike",4321,"Supervisor");
		staf [2] = new Staff("Jason",9453,"Assistant");
		for(int i = 0;i<3;i++){
			staf[i].showAll();
		}
		System.out.println("---------------------");

	}

}

class Staff {
	private String name,title;
	private int id;
	public Staff(String name1,int id1,String title1){
		name = name1;
		id = id1;
		title = title1;
	}
	public void setName(String name2){
		name = name2;
	}
	public void setId(int id2){
		id = id2;
	}
	public void setTitle(String title2){
		title = title2;
	}
	public String getName(){return name;}
	public int getId(){return id;}
	public String getTitle(){return title;}
	
	
	
	public void showAll(){
		System.out.println("name:"+this.getName());
		System.out.println("id:"+this.getId());
		System.out.println("title:"+this.getTitle());
		System.out.println();
	}
	
	

}
