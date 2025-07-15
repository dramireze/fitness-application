package dev.dramireze.fitnessapplication.user;

public record User(
        Integer id,
        String name,
        String lastname,
        String username,
        String email,
        Address address,
        String phone,
        String website,
        Company company
) {
}