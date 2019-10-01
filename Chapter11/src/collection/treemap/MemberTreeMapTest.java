package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberPark = new Member(300, "Park");
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark2 = new Member(400, "Park");
				
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
				
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
		
	}

}
