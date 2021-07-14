public class AddressBookApp {
    public static void main(String[] args) {
        AddressBook myAddressBook = new AddressBook();
        myAddressBook.setName("David");
        myAddressBook.setAddress("5353 Some Street Name");
        myAddressBook.setCity("Montgomery");
        myAddressBook.setState("MD");
        myAddressBook.setZip("22015");
        myAddressBook.setEmail("someemail@domain.com");
        myAddressBook.setPhone("(703)-551-2535");

        System.out.printf("Name: %s \nAddress: %s \nCity: %s \nState: %s \nZip: %s \nEmail: %s \nPhone: %s",
                myAddressBook.getName(), myAddressBook.getAddress(), myAddressBook.getCity(), myAddressBook.getState(),
                myAddressBook.getZip(), myAddressBook.getEmail(), myAddressBook.getPhone());
    }
}

