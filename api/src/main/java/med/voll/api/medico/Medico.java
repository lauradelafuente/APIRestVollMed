package med.voll.api.medico;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;

@Table(name="medicos")
@Entity(name="Medico")
@Getter //lombok gera os getters
@NoArgsConstructor //lombok cria o construtor DEFAULT sem argumentos
@AllArgsConstructor //cria o construtor que recebe todos os campos 
@EqualsAndHashCode(of = "id") //gera o hashcode em cima do id
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String crm;
	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;
	//para nao fazer relacionamento de tabelas, fica em classes separadas, mas entra na tabela de médicos
	@Embedded 
	private Endereco endereco;

}
