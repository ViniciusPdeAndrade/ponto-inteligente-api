package br.andrade.vpd.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.andrade.vpd.model.Empresa;
@Transactional
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	//@Transactional(readOnly = true) não precisa bloquear o banco, ajuda performace aplicação
	Empresa findByCnpj(String cnpj);

}
