package com.celilensar.accounts.repository;

import com.celilensar.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    Optional<Customer> findByMobileNumber(String mobileNumber);

}

//1. @Repository
//Bu anotasyon, Spring’e bu arayüzün veri erişim katmanı (DAO/Repository) olduğunu bildirir.
//
//Spring, bu sayede istisnaları (exceptions) Spring’in veri katmanı istisnalarına çevirir.
//
//Ancak, Spring Data JPA’da genellikle @Repository koymaya gerek kalmaz çünkü JpaRepository otomatik olarak bunu içerir.
//2. public interface CustomerRepository
//Bu bir interface yani soyut arayüzdür.
//
//Kendisi herhangi bir metot yazmadan bile, JpaRepository’den miras aldığı metotlarla çalışır.
//
//Böylece CRUD (Create, Read, Update, Delete) işlemleri için hazır fonksiyonlara sahip olur.
//
//3. extends JpaRepository<Customer, Long>
//Buradaki JpaRepository şu anlama gelir:
//
//Parametre	Açıklama
//Customer	Bu repository’nin çalışacağı Entity sınıfı
//Long	Entity’nin ID’sinin (primary key) tipi
//
//JpaRepository neler sağlar?
//Temel CRUD metotları:
//
//save()
//
//findById()
//
//findAll()
//
//deleteById()
//
//existsById()
//
//Sayfalama (pagination) ve sıralama (sorting) işlemleri için fonksiyonlar.
//
//Ayrıca, Spring Data JPA sayesinde arayüze yeni sorgular için sadece metot isimleriyle sorgu tanımlanabilir (method naming convention).