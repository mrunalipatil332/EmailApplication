package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Sheeteej", "Bhau");

		em1.setAlternateEmail("b5@gmail.com");
		System.out.println(em1.getAlternateEmail());

		System.out.println(em1.showInfo());

	}

}
