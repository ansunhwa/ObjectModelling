package _02_Builder3_solution;

public class T01_SubwayBuilder {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder()
				.setBread("통밀")
				.setCheese("모짜렐라")
				.setSize(15)
				.build();  //마지막은 build로 끝나야함
		
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder()
				.setBread("밀")
				.setSize(15)
				.setVagetable(true)
				.setExtraTopping("토마토")
				.build();
		System.out.println(menu2);
		
		
		

	}

}
