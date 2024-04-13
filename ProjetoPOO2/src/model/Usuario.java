/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {
    private long pkUsuario;
    private String nome;
    private String email;
    private String senha;
    private Date dataNasc;
    private boolean ativo;
    private Icon imagem;

    public Icon getImagem() {
        return imagem;
    }

    public void setImagem(Icon imagem) {
        this.imagem = imagem;
    }
    
    public Usuario(){};

    public Usuario(long pkUsuario, String nome, String email, String senha, Date daatNasc, boolean ativo) {
        this.pkUsuario = pkUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNasc = daatNasc;
        this.ativo = ativo;
    }

    public long getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(long pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date daatNasc) {
        this.dataNasc = daatNasc;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public String ativoToString(){
        if(ativo == true){
            return "Ativo";
        }else{
            return "Inativo";
        }
    }
}
