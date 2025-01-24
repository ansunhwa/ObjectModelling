package _02_Builder4_solution;

public class T01_SubwayBuilder {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder(15, "통밀", "올리브오일")  //반드시 넣어야 할 것들은 개체생성 하면서 바로 넣어주기
				.setCheese("모짜렐라")
				.build();  //마지막은 build로 끝나야함
		
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder(15, "밀", "소금")
				.setVagetable(true)
				.setExtraTopping("토마토")
				.build();
		System.out.println(menu2);
		
		
		
		
		

	}

}
