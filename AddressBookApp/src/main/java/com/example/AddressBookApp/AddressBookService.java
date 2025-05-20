package com.example.AddressBookApp;

import java.util.List;

public interface AddressBookService {
    AddressBookDTO addContact(AddressBookDTO contactDTO);
    AddressBookDTO updateContact(Long id, AddressBookDTO contactDTO);
    AddressBookDTO getContactById(long id);
    AddressBookDTO getContactByFirstName(String firstName);
    List<AddressBookDTO> getAllContact();
    void deleteContact(long id);
}

/*public interface AddressBookService {
    AddressBook addContact(AddressBookDTO contactDTO);
    AddressBook updateContact(Long id, AddressBookDTO contactDTO);
    AddressBook getContactById(long id);
    Optional<AddressBook> getContactByFirstName(String firstName);
    List<AddressBook> getAllContact();
    void deleteContact(long id);
}*/



