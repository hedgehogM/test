package test;


public class duotai{

	public static void main(String[] args) {
		
		duotaiAnimal dog = new duotaiDog();
		dog.sounds();
		duotaiAnimal cat = new duotaiCat();
		cat.sounds();
		
		duotaiCat cat2 = new duotaiCat();
		cat2.miao();
		
		duotaiAnimal animal = new duotaiAnimal();
		animal.sounds();
		
		
		
		
//		duotaiDog dog1 = (duotaiDog)new duotaiAnimal();
//		dog1.sounds();
	}

}
