package br.andrade.vpd.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.andrade.vpd.model.Funcionario;

@Transactional
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	
	Funcionario findByCpf(String cpf);
	
	Funcionario findByEmail(String email);
	
	Funcionario findByCpfOrEmail(String cpf, String email);

}
