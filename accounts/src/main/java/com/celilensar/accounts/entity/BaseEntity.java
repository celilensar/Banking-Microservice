package com.celilensar.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@MappedSuperclass  // Bir sınıfı @MappedSuperclass ile işaretlersen, bu sınıfın alanları (fields) alt sınıflara miras kalır ve veritabanı tablolarına o alt sınıflar tarafından dahil edilir. Ancak bu sınıfın kendisi veritabanında tablo olarak oluşturulmaz.
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false)   //@Column ,Java'daki bir field'ı (özelliği), veritabanındaki bir sütunla (column) eşleştirmek için kullanılan bir JPA anotasyonudur.
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @Column(updatable = false)
    private String updatedBy;
}
