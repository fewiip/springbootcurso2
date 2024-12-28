package br.com.cursofelipefood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursofelipefood.model.Pagamento;
import lombok.Data;

@Data
public interface PagamentosRepository extends JpaRepository<Pagamento, Long> {

	private Long id;

	private BigDecimal valor;

	private String nome;

	private String numero;

	private String expiracao;

	private String codigo;

	private Status status;

	private Long pedidoId;

	private Long formaDePagamentoId;

}
