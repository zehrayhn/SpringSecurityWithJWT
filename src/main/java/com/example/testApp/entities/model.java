package com.example.testApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="_model")
public class model {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;

}
