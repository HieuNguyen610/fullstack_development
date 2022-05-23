package com.example.fullstack_development.boot_bootique;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "BOOTS")
public class Boot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private BootType type;

    @Column(name = "size")
    private Float size;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "material")
    private String material;
}
