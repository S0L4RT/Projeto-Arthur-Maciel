/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
    
    public static String converterDateToString(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String texto = "";
        
        try{
            texto = formato.format(data);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao converter data");
        }
        return texto;
    }
    
    public static Icon fileParaIcon(File file){
        ImageIcon icon = new ImageIcon(file.getAbsolutePath());
        return icon;
    }
    
    public static ImageIcon redimensionarIcon(Icon originalIcon, int largura, int altura){
        Image imagemOriginal = ((ImageIcon) originalIcon).getImage();
        Image novaImagem = imagemOriginal.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        return new ImageIcon(novaImagem);
    }
    
    public static byte[] iconToBytes(Icon icon) throws IOException{
        BufferedImage image = new BufferedImage(
            icon.getIconWidth(),
            icon.getIconHeight(),
            BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();
        
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        ImageIO.write(image, "png", byteArray);
        return byteArray.toByteArray();
    }
}
