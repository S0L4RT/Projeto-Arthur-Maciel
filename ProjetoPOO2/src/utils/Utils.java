/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class Utils {
    public static String calcularMD5(String senha){
        String hashMD5 = "";
        try{
            // Crie uma instância do MessageDigest com o algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Atualize o digest com os bytes do texto
            md.update(senha.getBytes());
            
            // Calcule hash MD5
            byte[] digest = md.digest();
            
            // Converta o hash de bytes para uma representação hexadecimal
            StringBuilder sb = new StringBuilder();
            for(byte b : digest){
                sb .append(String.format("%02x", b));
            }
            hashMD5 = sb.toString();
        }catch(NoSuchAlgorithmException e){
            System.err.println("Algoritmo MD5 não encontrado");
        }
        return hashMD5;
    }
    
    public static Date converterStringToDate(String texto){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        
        try{
            data = formato.parse(texto);
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conevrter a data");
        }
        return data;
    }
}
