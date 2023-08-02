package com.devsuperior.dscatalog.v2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_category")
public class Category {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
}
