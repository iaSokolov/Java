package vtb.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phone) {
        ArrayList<String> phones = this.phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        this.phoneBook.put(name, phones);
    }

    public ArrayList<String> get(String name){
        return this.phoneBook.getOrDefault(name, new ArrayList<String>());
    }
}
