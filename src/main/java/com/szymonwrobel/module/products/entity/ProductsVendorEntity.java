package com.szymonwrobel.module.products.entity;

import javax.persistence.*;

@Entity
@Table(name = "vendors")
public class ProductsVendorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Country country;
}
