package book;

public class AddressBook {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.setName ("Jimmy"); 
		System.out.println(b.getName());
		
		b.setAddress ("143 O casey ln"); 
		System.out.println(b.getAddress());
		
		b.setCity ("Alexandria "); 
		System.out.print(b.getCity());
		
		b.setState ("Virginia "); 
		System.out.print(b.getState());
		
		b.setZip ("20842 "); 
		System.out.println(b.getZip());
		
		b.setPhone ("301-225-9872"); 
		System.out.println(b.getPhone());
		
		b.setEmail ("lil_Chip94@gmail.com"); 
		System.out.println(b.getEmail());
		
		
		// The validation methods should be private in order to prevent random people from modifying personal information of others
			
	}

}
