package SwitchX;

interface LibraryU{
	public void registeraccount();
	void requestbook(String booktype);
	void registeraccount(int age);
	public void requestbook();
}

class kidsuser implements LibraryU {

	@Override
	public void registeraccount(int age) {
		// TODO Auto-generated method stub
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestbook(String booktype) {
		// TODO Auto-generated method stub
		if(booktype ==("kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are alowed to take only kids books");
		}
	}


	class AdultUser implements LibraryU{
		int age;
		String booktype;


		@Override
		public void registeraccount(int age) {
			// TODO Auto-generated method stub
			if(age>12) {
				System.out.println("You have successfully registered under an Adult Account");
			}
			else {
				System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			}
		}
		@Override
		public void requestbook(String booktype) {
			// TODO Auto-generated method stub
			if(booktype==("fiction")) {
				System.out.println("Book Issued successfully, please return the book within 7 days");
			}
			else {
				System.out.println("Oops, you are allowed to take only adult Fiction books");
			}
		}
	}


	public class LibraryUser {
		public static void  main (String[] args) {

			Kidsuser k=new Kidsuser();
			k.registeraccount(10);
			k.registeraccount(18);

			k.requestbook("kids");
			k.requestbook("fiction");
			System.out.println();


			AdultUser a= new AdultUser();
			a.registeraccount(5);
			a.registeraccount(23);

			a.requestbook("kids");
			a.requestbook("fiction");
		}
	}
}
