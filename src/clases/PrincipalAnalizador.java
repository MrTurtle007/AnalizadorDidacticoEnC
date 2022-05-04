/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Mr.Turtle007
 */
public class PrincipalAnalizador {
    public static void main(String[] args) throws Exception{
        String path1 = "C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/src/clases/Lexer.flex";
        String path2 = "C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/src/clases/LexerCup.flex";
        String[] rutaSintaxis = {"-parser", "Sintax", "C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/src/clases/Sintax.cup"};
        
        generar(path1, path2, rutaSintaxis);
    }
    
    public static void generar(String path1, String path2, String[] rutaSintaxis) throws IOException, Exception{
        File archivo;
        archivo = new File(path1);
        JFlex.Main.generate(archivo);
        archivo = new File(path2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaSintaxis);
        
        Path rutaSym = Paths.get("C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/src/clases/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/sym.java"), 
                Paths.get("C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/src/clases/sym.java")
        );
        Path rutaSin = Paths.get("C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/src/clases/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/Sintax.java"), 
                Paths.get("C:/Users/Usuario/Documents/NetBeansProjects/AnalizadorDeCodigoC_V1/src/clases/Sintax.java")
        );
    }
}
