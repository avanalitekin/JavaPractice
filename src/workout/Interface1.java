package workout;

interface Interface1 {

	void getName();
	default String setName() {
		return "name";
	}
}

interface Interface2 {
	void getAge();
}

interface Interface3 extends Interface1, Interface2{
	
}

class InterfaceTester implements Interface3{
	public void getName() {
		System.out.println("");
	}
		public void getAge() {
			System.out.println("");
		}
	}

