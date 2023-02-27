package ads5.integrador.famous.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id")
    private Long cli_id;
    

    @Column(name = "cli_nome")
    private String cli_nome;

    @Column(name = "cli_cpf")
    private String cli_cpf;

    @Column(name = "cli_email")
    private String cli_email;

    @Column(name = "cli_dataNacimento")
    private String cli_dataNacimento;

    @Column(name = "cli_genero")
    private String cli_genero;

    @Column(name = "cli_telefone")
    private String cli_telefone;


    
 
}
