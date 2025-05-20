package com.example.AddressBookApp;

public class AddressBookMapper {

    // Convert DTO to Entity
    public static AddressBook toEntity(AddressBookDTO dto) {
        if (dto == null) return null;

        return new AddressBook(
                dto.getFirstName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhoneNumber(),
                dto.getAddress()
        );
    }

    // Convert Entity to DTO
    public static AddressBookDTO toDTO(AddressBook entity) {
        if (entity == null) return null;

        return new AddressBookDTO(
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getPhoneNumber(),
                entity.getAddress()
        );
    }
}
