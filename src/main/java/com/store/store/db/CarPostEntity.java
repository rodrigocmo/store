package com.store.store.db;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "car_post")
public class CarPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "car_model")
    private String model;

    @Column(name = "car_brand")
    private String brand;

    @Column(name = "car_price")
    private Double price;

    @Column(name = "car_description")
    private String description;

    @Column(name = "car_engine")
    private String engineVersion;

    @Column(name = "car_city")
    private String city;

    @Column(name = "car_created")
    private String createdDate;

    @Column(name = "car_post_contact")
    private String contact;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_post_ID", nullable = false, referencedColumnName = "id")
    private OwnerPostEntity ownerPost;

}
