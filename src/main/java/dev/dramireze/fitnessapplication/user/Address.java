package dev.dramireze.fitnessapplication.user;

public record Address(
        String street,
        String suite,
        String city,
        String zipcode,
        Geo geo,
        String country
) {
}