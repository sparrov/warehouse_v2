package com.szymonwrobel.module.products.entity;

import javax.persistence.*;

@Entity
@Table(name = "models")
public class ProductsVendorsModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Type type;
    @OneToOne
    @JoinColumn(name="vendor_id", referencedColumnName = "id")
    private ProductsVendorEntity vendor;
    private String model;
}
