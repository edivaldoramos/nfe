package com.fincatto.documentofiscal.cte200.classes.cte;

import org.simpleframework.xml.Element;

import com.fincatto.documentofiscal.DFBase;

public class CTInfoModalRodoviarioPedagio extends DFBase {

    @Element(name = "CNPJForn")
    private String cnpjFornecedora;

    @Element(name = "nCompra")
    private String numeroComprovante;

    @Element(name = "CNPJPg", required = false)
    private String cnpjPagadora;

    @Element(name = "vValePed")
    private String valor;

    public String getCnpjFornecedora() {
        return this.cnpjFornecedora;
    }

    public void setCnpjFornecedora(final String cnpjFornecedora) {
        this.cnpjFornecedora = cnpjFornecedora;
    }

    public String getNumeroComprovante() {
        return this.numeroComprovante;
    }

    public void setNumeroComprovante(final String numeroComprovante) {
        this.numeroComprovante = numeroComprovante;
    }

    public String getCnpjPagadora() {
        return this.cnpjPagadora;
    }

    public void setCnpjPagadora(final String cnpjPagadora) {
        this.cnpjPagadora = cnpjPagadora;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(final String valor) {
        this.valor = valor;
    }

}
