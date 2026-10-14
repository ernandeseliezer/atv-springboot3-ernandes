package biblioteca.biblioteca.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@Table(name = "tb_livro")
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    @Column(name = "ds_isbn", nullable = false)
    @Id
    @JsonProperty("id")
    private String ISBN;

    @Column(name = "ds_titulo", nullable = false)
    @JsonProperty("titulo")
    private String titulo;

    @Column(name = "ds_ano", nullable = false)
    @JsonProperty("ano")
    private String ano;

    @Column(name = "ds_edicao", nullable = false)
    @JsonProperty("edicao")
    private String edicao;


    @Column(name = "ds_autor", nullable = false)
    @ManyToOne
    @JoinColumn()
    @JsonProperty("autor")
    private Autor autor;

}
