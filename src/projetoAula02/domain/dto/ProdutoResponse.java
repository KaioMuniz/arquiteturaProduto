package projetoAula02.domain.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record ProdutoResponse(UUID id, String nome, double preco, int quantidade, LocalDateTime dataHoraCriacao) {
}
