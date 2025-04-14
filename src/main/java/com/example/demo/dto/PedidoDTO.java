package com.example.demo.dto;


import lombok.Data;

import java.util.List;

@Data
public class PedidoDTO {
    private Long clienteId;
    private List<Long> produtoIds;
}
