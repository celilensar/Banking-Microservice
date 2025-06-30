package com.celilensar.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@MappedSuperclass  // Bir sınıfı @MappedSuperclass ile işaretlersen, bu sınıfın alanları (fields) alt sınıflara miras kalır ve veritabanı tablolarına o alt sınıflar tarafından dahil edilir. Ancak bu sınıfın kendisi veritabanında tablo olarak oluşturulmaz.
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter @ToString
public class BaseEntity {
    @CreatedDate
    @Column(updatable = false)   //@Column ,Java'daki bir field'ı (özelliği), veritabanındaki bir sütunla (column) eşleştirmek için kullanılan bir JPA anotasyonudur.
    private LocalDateTime createdAt;
    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    @LastModifiedDate
    private LocalDateTime updatedAt;
    @LastModifiedBy
    @Column(updatable = false)
    private String updatedBy;
}
