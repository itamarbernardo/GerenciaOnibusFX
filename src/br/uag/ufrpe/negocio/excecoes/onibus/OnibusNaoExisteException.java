/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uag.ufrpe.negocio.excecoes.onibus;

/**
 *
 * @author EMily SAntos
 */
public class OnibusNaoExisteException extends Exception {
    
    public OnibusNaoExisteException(){
        super("O ônibus não existe no repositório");
    }
    
}
