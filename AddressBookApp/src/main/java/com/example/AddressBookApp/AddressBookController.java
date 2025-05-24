package com.example.AddressBookApp;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @PostMapping("/add")
    public AddressBookDTO addContact(@RequestBody @Valid AddressBookDTO contactDTO) {
        return addressBookService.addContact(contactDTO);
    }

    @PutMapping("/update/{id}")
    public AddressBookDTO updateContact(@PathVariable Long id, @RequestBody @Valid AddressBookDTO contactDTO) {
        return addressBookService.updateContact(id, contactDTO);
    }

    @GetMapping("/getById/{id}")
    public AddressBookDTO getContactById(@PathVariable Long id) {
        return addressBookService.getContactById(id);
    }

    @GetMapping("/getByFirstName/{firstName}")
    public AddressBookDTO getContactByFirstName(@PathVariable String firstName) {
        return addressBookService.getContactByFirstName(firstName);
    }

    @GetMapping("/all")
    public List<AddressBookDTO> getAllContacts() {
        return addressBookService.getAllContact();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable Long id) {
        addressBookService.deleteContact(id);
        return "Contact deleted successfully";
    }
}
