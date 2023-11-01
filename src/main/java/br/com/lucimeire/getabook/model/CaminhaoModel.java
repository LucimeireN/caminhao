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
@Table(name = "caminhao")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_book;

    @Column(name = "caminhao_modelo", nullable = false, length = 50)
    private String bookName;

    @Column(name = "marca", nullable = false, length = 50)
    private String authorName;

    @ManyToOne
    @JoinColumn(name="marca")
    private PublisherModel publisher;

}
