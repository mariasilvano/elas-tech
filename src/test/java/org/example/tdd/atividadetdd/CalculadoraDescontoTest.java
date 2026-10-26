package org.example.tdd.atividadetdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTest {
    private CalculadoraDesconto calculadoraDesconto;

    @BeforeEach
    void criarObjeto() {

        calculadoraDesconto = new CalculadoraDesconto();
    }

    @Test
    void clienteComumECompraMenorQueCemSemDesconto() {
        assertEquals(50.00, calculadoraDesconto.aplicarDesconto(50.00, false));
    }
    @Test
    void clienteVipTemDezPorCentoDesconto() {
        assertEquals(180.00, calculadoraDesconto.aplicarDesconto(200.00, true));
    }

    @Test
    void clienteComumCompraDeCemSemDesconto(){
        assertEquals(100.00, calculadoraDesconto.aplicarDesconto(100.00, false));
    }

    @Test
    void deveLancarErroSeValorCompraForNegativoVip() {
        assertThrows(IllegalArgumentException.class, () -> calculadoraDesconto.aplicarDesconto(-10.00, true));
    }

    @Test
    void deveLancarErroSeValorCompraForNegativoNaoVip() {
        assertThrows(IllegalArgumentException.class, () -> calculadoraDesconto.aplicarDesconto(-10.0, false));
    }

    @Test
    void deveLancarErroSeValorCompraForZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadoraDesconto.aplicarDesconto(0.00, false));
    }

}