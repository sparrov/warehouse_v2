package com.szymonwrobel.module.products.entity;

import javax.persistence.*;

@Entity
@Table(name="products")
public class ProductsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Type type;
    @OneToOne
    @JoinColumn(name="vendor_id", referencedColumnName = "id")
    private ProductsVendorEntity vendor;
    @OneToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private ProductsVendorsModelEntity model;
    private String serialNumber;

}
