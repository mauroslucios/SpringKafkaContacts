package com.residencia.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.contatos.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
