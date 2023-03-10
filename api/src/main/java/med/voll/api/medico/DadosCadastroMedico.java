package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

//utilizando record para deixar o código enxuto e o Spring criar os getters, setters e construtores automaticamente - classe DTO (Data Transfer Object)
public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {

}
