package com.example.AddressBookApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressBookServiceImp implements AddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Override
    public AddressBookDTO addContact(AddressBookDTO contactDTO) {
        AddressBook addressBook = AddressBookMapper.toEntity(contactDTO);
        AddressBook savedContact = addressBookRepository.save(addressBook);
        return AddressBookMapper.toDTO(savedContact);
    }

    @Override
    public AddressBookDTO updateContact(Long id, AddressBookDTO contactDTO) {
        Optional<AddressBook> optionalContact = addressBookRepository.findById(id);
        if (optionalContact.isPresent()) {
            AddressBook existed = optionalContact.get();
            existed.setFirstName(contactDTO.getFirstName());
            existed.setLastName(contactDTO.getLastName());
            existed.setEmail(contactDTO.getEmail());
            existed.setPhoneNumber(contactDTO.getPhoneNumber());
            existed.setAddress(contactDTO.getAddress());

            AddressBook updatedContact = addressBookRepository.save(existed);
            return AddressBookMapper.toDTO(updatedContact);
        }
        return null;
    }

    @Override
    public AddressBookDTO getContactById(long id) {
        Optional<AddressBook> contact = addressBookRepository.findById(id);
        /*if (contact.isPresent()) {
            return AddressBookMapper.toDTO(contact.get());
        }
        return null;*/
        return contact.map(AddressBookMapper::toDTO).orElse(null);
    }

    @Override
    public AddressBookDTO getContactByFirstName(String firstName) {
        Optional<AddressBook> contact = addressBookRepository.findByFirstName(firstName);
        /*if (contact.isPresent()) {
            return AddressBookMapper.toDTO(contact.get());
        }
        return null;*/
        return contact.map(AddressBookMapper::toDTO).orElse(null);
    }

    @Override
    public List<AddressBookDTO> getAllContact() {
        List<AddressBook> addressBooks = addressBookRepository.findAll();
        List<AddressBookDTO> dtoList = new ArrayList<AddressBookDTO>();
        /*for (int i = 0; i < addressBooks.size(); i++) {
            AddressBookDTO dto = AddressBookMapper.toDTO(addressBooks.get(i));
            dtoList.add(dto);
        }*/
        for (AddressBook addressBook : addressBooks) {
            AddressBookDTO dto = AddressBookMapper.toDTO(addressBook);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public void deleteContact(long id) {
        addressBookRepository.deleteById(id);
    }
}




/*package com.example.AddressBookApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressBookServiceImp implements AddressBookService{

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Override
    public AddressBook addContact(AddressBookDTO contactDTO) {
        AddressBook addressBook = new AddressBook(contactDTO.getFirstName(), contactDTO.getLastName(),
                contactDTO.getEmail(), contactDTO.getPhoneNumber(), contactDTO.getAddress());
        return addressBookRepository.save(addressBook);
    }

    @Override
    public AddressBook updateContact(Long id, AddressBookDTO contactDTO) {
         AddressBook existed = addressBookRepository.findById(id).orElse(null);
         if(existed!=null){
             existed.setFirstName(contactDTO.getFirstName());
             existed.setLastName(contactDTO.getLastName());
             existed.setEmail(contactDTO.getEmail());
             existed.setPhoneNumber(contactDTO.getPhoneNumber());
             existed.setAddress(contactDTO.getAddress());
             existed.setPhoneNumber(contactDTO.getPhoneNumber());
             return addressBookRepository.save(existed);
         }
        return null;
    }

    @Override
    public AddressBook getContactById(long id) {
        return addressBookRepository.findById(id).orElse(null);
    }

    @Override
    public Optional<AddressBook> getContactByFirstName(String firstName) {
        return addressBookRepository.findByFirstName(firstName);
    }

    @Override
    public List<AddressBook> getAllContact() {
        return addressBookRepository.findAll();
    }

    @Override
    public void deleteContact(long id) {
        addressBookRepository.deleteById(id);
    }
}*/


