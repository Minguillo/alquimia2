/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.alquimia.curp;

/**
 *
 * @author beltr
 */
public class Conversion {
   
    /**
     * 
     * @param apellidoPaterno es el apellido que ingreso en la caja de texto
     * @return La primera letra del apellido paterno
     */
    public static char primerLetraPaterno(String apellidoPaterno){
        
            return apellidoPaterno.charAt(0);
    }
    
    /**
     * 
     * @param apellidoPaterno es el apellido que ingreso en la caja de texto
     * @return La primera Vocal Interna del apellido paterno
     */
    public static char primerVocalPaterno(String apellidoPaterno){
        
        String primerVocal = apellidoPaterno.toUpperCase().trim().replace("Á","A").replace("É", "E")
                .replace("Í", "I").replace("Ó", "O").replace("Ú", "U");
        String vocales = "AEIOU";
        
        for(int i = 1; i < primerVocal.length(); i++){
            if(vocales.contains(String.valueOf(primerVocal.charAt(i)))){
               return primerVocal.charAt(i); 
            }  
        }
        return ' ';
        
    }
    /**
     * 
     * @param apellidoPaterno es el apellido que ingreso en la caja de texto
     * @return La union de la primera letra y la primera vocal del apellido paterno
     */
    public static String clavePaterno(String apellidoPaterno){
        char[] letra = {apellidoPaterno.toUpperCase().charAt(0), primerVocalPaterno(apellidoPaterno)};
        
        return new String(letra);
                
         
    }
    
    /**
     * 
     * @param apellidoMaterno es el apellido que ingreso en la caja de texto
     * @return retorna x si el apellido materno esta vacio o la primera letra del apellido materno
     */
    public static char primerLetraApellidoMaterno(String apellidoMaterno){
       if(apellidoMaterno.equals("")){
           return 'X';
       }
       else{
           return apellidoMaterno.charAt(0);
       }
        
    }
    public void obtenerFechaNacimiento(String mes){
        String digitoMes = "";
       if(mes.equals("enero")){
           digitoMes =  "01";
       }             
       else if (mes.equals("febrero")){
           digitoMes = "02";
       }
       else if (mes.equals("marzo")){
           digitoMes = "03";
       }
       else if (mes.equals("abril")){
           digitoMes = "04";
       }
       else if (mes.equals("mayo")){
           digitoMes = "05";
       }
       else if (mes.equals("junio")){
           digitoMes = "06";
       }
       else if (mes.equals("julio")){
           digitoMes = "07";
       }
       else if (mes.equals("agosto")){
           digitoMes = "08";
       }
       else if (mes.equals("septiembre")){
           digitoMes = "09";
       }
       else if (mes.equals("octubre")){
           digitoMes = "10";
       }
       else if (mes.equals("noviembre")){
           digitoMes = "11";
       }
       else if (mes.equals("diciembre")){
           digitoMes = "12";
       }
       
       
    }
    
    public static String obtenerSexo(String sexo){
        switch (sexo){
            case "Hombre":
                    return "H";
            default:
                return "M";
                    
        }
      
    } 
    
    /**
     * 
     * @param apellidoPaterno es el apellido que ingreso en la caja de texto
     * @return Retorna la primera consonante no inicial del apellido Paterno
     */
    public static char primeraConsonanteApellidoPaterno(String apellidoPaterno){
        String primerConsonante = apellidoPaterno.toUpperCase().trim();
        String consonantes = "BCDFGHJKLMNÑPQRSTVXZWY";
        
        for(int i = 1; i < primerConsonante.length(); i++){
            if(consonantes.contains(String.valueOf(primerConsonante.charAt(i)))){
                return primerConsonante.charAt(i);
            }
        }
        return ' ';
    }
    
    public static char primerConsonanteApellidoMaterno(String apellidoMaterno){
        String primerConsonante = apellidoMaterno.toUpperCase().trim();
        String consonantes = "BCDFGHJKLMNÑPQRSTVXZWY";
        
        if(primerConsonante.equals("")){
            return 'X';
        }
        else{
           for(int i = 1; i <primerConsonante.length(); i++){
               if(consonantes.contains(String.valueOf(primerConsonante.charAt(i)))){
                   return primerConsonante.charAt(i);
               }
           } 
        }
       return ' ';
    }
    
    
}
