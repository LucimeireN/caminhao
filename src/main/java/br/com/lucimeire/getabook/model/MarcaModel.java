package br.com.lucimeire.batista.getabook.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "publishers")
public class PublisherModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_publisher;

    @Column(name = "caminhao_modelo", nullable = false, length = 50)
    private String modelo;

    @Column(nullable = false, length = 20)
    private String contact;

    @Column(name = "marca", nullable = false)
    private int marca;

}
