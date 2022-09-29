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
            apellidoPaterno = apellidoPaterno.toUpperCase().trim();
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
       apellidoMaterno = apellidoMaterno.toUpperCase().trim();
        
        if(apellidoMaterno.equals("")){
           return 'X';
       }
       else{
           return apellidoMaterno.charAt(0);
       }
        
    }
    
    public static char primerLetraNombre(String nombre){
        nombre = nombre.toUpperCase().trim();
        String primerLetra;
        char trozo;
        String[] partes = nombre.split(" ");
        if(partes[0].contains("JOSE")){
            primerLetra = partes[1].substring(0,1);
            trozo = primerLetra.charAt(0);
            return trozo;
        }
        else if(partes[0].contains("MARIA")){
            primerLetra = partes[1].substring(0,1);
            trozo = primerLetra.charAt(0); 
            return trozo;
        }
        else{
            nombre = nombre.toUpperCase().trim();
            return nombre.charAt(0);
        } 
    }
    
    public static String obtenerAño(String año){
       return año.substring(2,4);
       
    }
    
    
    
    public static String obtenerFechaNacimiento(String mes){
        
       switch (mes){
          case "1":
                    return "01";
                    
          case "2":
                    return "02";
                    
          case "3":
                    return "03";
          
          case "4":
                    return"04";
          case "5":
                    return "05";
          case "6":
                    return "06";
          case "7":
              return "07";
          case "8":
              return "08";
          case "9":
              return "09";
          default:
              return "";
       }  
       
       
    }
    
    public void obtenerDia(String dia){
        String digitodia = "";
       if(dia.equals('1')){
           digitodia =  "01";
       }             
       else if (dia.equals('2')){
           digitodia = "02";
       }
       else if (dia.equals('3')){
           digitodia = "03";
       }
       else if (dia.equals('4')){
           digitodia = "04";
       }
       else if (dia.equals('5')){
           digitodia = "05";
       }
       else if (dia.equals('6')){
           digitodia = "06";
       }
       else if (dia.equals('7')){
           digitodia = "07";
       }
       else if (dia.equals('8')){
           digitodia = "08";
       }
       else if (dia.equals('9')){
           digitodia = "09";
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
    
    public static String obtenerEntidad(String entidad){
      switch (entidad){
          case "Aguas Calientes":
                    return "AS";
                    
          case "Baja California":
                    return "BC";
                    
          case "Baja California Sur":
                    return "BS";
          
          case "Campeche":
                    return "CC";
          case "Coahuila de Zaragoza":
                    return "CL";
          case "Colima":
                    return "CM";
          case "Chiapas":
                    return "CS";
          case "Chihuahua":
                    return "CH";
          case "Distrito Federal":
                    return "DF";
          case "Durango":
                    return "DG";
          case "Guajanto":
                    return "GT";  
          case "Guerrero":
                    return "GR";
          case "Hidalgo":
                    return "HG";
          case "Jalisco":
                    return "JC";
          case "Mexico":
                    return "MC";
          case "Michoacan de Ocampo":
                    return "MN";
          case "Morelos":
                    return "MS";
          case "Nayarit":
                    return "NT";
          case "Nuevo Leon":
                    return "NL";
          case "Oaxaca":
                    return "OC";
          case "Puebla":
                    return "PL";
          case "Queretaro":
                    return "QT";
          case "Quintana Roo":
                    return "QR";
          case "San Luis Potosi":
                    return "SP";
          case "Sinaloa":
                    return "SL";
          case "Sonora":
                    return "SR";
          case "Tabasco":
                    return "TC";
          case "Tamaulipas":
                    return "TS";
          case "Tlaxcala":
                    return "TL";
          case "Veracruz de Ignacio de la Llave":
                    return "VZ";
          case "Yucatan":
                    return "YN";
          case "Zacatecas":
                    return "ZS";
          case "Nacido en el Extranjero":
                    return "NE";
          default:
                    return "";
                    
               
                    
                    
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
    
    public static char primerConsonanteNombre(String nombre){
        String primerConsonante = nombre.toUpperCase().trim();
        String consonantes = "BCDFGHJKLMNÑPQRSTVXZWY";
        
        for(int i = 1; i < primerConsonante.length(); i++){
            if(consonantes.contains(String.valueOf(primerConsonante.charAt(i))))
                return primerConsonante.charAt(i);
        }
        return ' ';
    }
    
    public static char digitoAño (String año){
        int años = Integer.parseInt(año);
        if(años < 1999){
            return '0';
        }
        else{
            return 'A';
        }
    }
    
}
