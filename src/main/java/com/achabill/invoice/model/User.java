package com.achabill.invoice.model;

import com.mongodb.lang.Nullable;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User extends AbstractDocument{
    @NotNull
    String name;
    @NotNull
    @Indexed(unique = true)
    String username;
    @NotNull
    String email;
    @Min(value = 4)
    String password;
    @NotNull
    Address address;
    @NotNull
    String phone;

    public User(String name, String email, String password, Address address, String phone, String username) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
