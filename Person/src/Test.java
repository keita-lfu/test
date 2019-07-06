
public class Test {

	public static void main(String[]args) {

		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-0909-0909";
		taro.address = "東京都北区11-1";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person ziro = new Person();
		ziro.name = "木村次郎";
		ziro.age = 18;
		ziro.phoneNumber = "080-0808-0808";
		ziro.address = "東京都東区22~2";
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);
		ziro.talk();
		ziro.walk();
		ziro.run();

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "070-07070-0707";
		hanako.address = "東京都南区33−3";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person keita = new Person();
		keita.name = "佐藤敬太";
		keita.age = 26;
		keita.phoneNumber = "060-0606-0606";
		keita.address = "東京都西区44−4";
		System.out.println(keita.name);
		System.out.println(keita.age);
		System.out.println(keita.phoneNumber);
		System.out.println(keita.address);
		keita.talk();
		keita.walk();
		keita.run();



		Person aibo = new Person();
		aibo.name = "aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Person asimo = new Person();
		asimo.name = "asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Person pepper = new Person();
		pepper.name = "pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
