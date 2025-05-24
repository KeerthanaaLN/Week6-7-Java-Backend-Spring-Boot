package com.example.AddressBookApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook,Integer> {
    Optional<AddressBook> findByFirstName(String firstName);
    Optional<AddressBook> findById(Long id);
    void deleteById(Long id);
}
