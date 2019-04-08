/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import javax.swing.JOptionPane;
/**
 *
 * @author Jhose
 */
public class DocumentacionHtml extends Documentacion {

    @Override
    public void agregaDocumento(String documento) {
        if(documento.startsWith("<HTML>")){
            contenido.add(documento);
        }
    }

    @Override
    public void imprime() {
        JOptionPane.showMessageDialog(null, "Documentacion HTML");
        for(String s : contenido){
            JOptionPane.showMessageDialog(null, s);
        }
    }
    
}
