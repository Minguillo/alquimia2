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
         * Agarra la primer letra del apellido
         * @param apellidoPaterno es el apellido que ingreso en la caja de texto
         * @return La primera letra del apellido paterno
         */
        public static char primerLetraPaterno(String apellidoPaterno){
                apellidoPaterno = apellidoPaterno.toUpperCase().trim();
                return apellidoPaterno.charAt(0);
        }

        /**
         * Agarra la primera vocal interna del apellido
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
         * Se unen la primera letra del apellido y la primer vocal interna del mismo
         * @param apellidoPaterno es el apellido que ingreso en la caja de texto
         * @return La union de la primera letra y la primera vocal del apellido paterno
         */
        public static String clavePaterno(String apellidoPaterno){
            char[] letra = {apellidoPaterno.toUpperCase().charAt(0), primerVocalPaterno(apellidoPaterno)};

            return new String(letra);


        }

        /**
         * Agarra la primer letra del segundo apellido
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
        
        /**
         * Agarra la primera letra del nombre 
         * @param nombre Es el nombre que ingreso en la caja de texto
         * @return retorna la primera letra del nombre
         */
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
        
        /**
         * Agarra los ultimos 2 digitos del año
         * @param año Es el año que ingreso en la caja de texto
         * @return Retorna los ultimos 2 digitos del año
         */
        public static String obtenerAño(String año){
           return año.substring(2,4);

        }
        
        /**
         * Agarra el numero de mes que ingreso en la caja de texto
         * @param mes es el mes que ingreso en la caja de texto
         * @return retorna el numero en 2 digitos del mes 
         */
        public static String obtenerFechaNacimiento(String mes){
            int meses = Integer.parseInt(mes);

            if(mes.equals("1")){
               return "01";
           }  
           else if(mes.equals("2")){
               return "02";
           }
           else if(mes.equals("3")){
               return "03";
           }
           else if(mes.equals("4")){
               return "04";
           }
           else if(mes.equals("5")){
               return "05";
           }
            else if(mes.equals("6")){
               return "06";
           }
           else if(mes.equals("7")){
               return "07";
           }
            else if(mes.equals("8")){
               return "08";
           }
           else if(mes.equals("9")){
               return "09";
           }
           else{
               return mes;
           }


        }
        
        /**
         * Agarra el numero de dia que ingreso en la caja de texto
         * @param dia es el dia que ingreso en la caja de texto
         * @return Retorna el dia en 2 digitos 
         */
        public static String obtenerDia(String dia){
           if(dia.equals("1")){
               return "01";
           }  
           else if(dia.equals("2")){
               return "02";
           }
           else if(dia.equals("3")){
               return "03";
           }
           else if(dia.equals("4")){
               return "04";
           }
           else if(dia.equals("5")){
               return "05";
           }
            else if(dia.equals("6")){
               return "06";
           }
           else if(dia.equals("7")){
               return "07";
           }
            else if(dia.equals("8")){
               return "08";
           }
           else if(dia.equals("9")){
               return "09";
           }
           else{
               return dia;
           }
        }
        
        /**
         * Agarra el valor del sexo que se ingresa en la combo box
         * @param sexo es el valor que se elige en la combo box
         * @return Retorna el valor abreviado del sexo 
         */
        public static String obtenerSexo(String sexo){
            switch (sexo){
                case "Hombre":
                        return "H";
                default:
                    return "M";

            }
        } 
        
        /**
         * Agarra la clave de la entidad federativa
         * @param entidad son las entidades federativas 
         * @return Las claves de las entidades federativas
         */
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
        
        /**
         * Agarra la primera consonante no principal del segundo apellido
         * @param apellidoMaterno Es el segundo apellido que ingreso en la caja de texto
         * @return Retorna la consonante del segundo apellido o si no tiene retorna una X
         */
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
        
        /**
         * Agarra la primera consonante no principal del nombre
         * @param nombre Es el nombre que ingreso en la caja de texto
         * @return Agarra la primera consonante no principal del nombre
         */
        public static char primerConsonanteNombre(String nombre){
            String primerConsonante = nombre.toUpperCase().trim();
            String consonantes = "BCDFGHJKLMNÑPQRSTVXZWY";

            for(int i = 1; i < primerConsonante.length(); i++){
                if(consonantes.contains(String.valueOf(primerConsonante.charAt(i))))
                    return primerConsonante.charAt(i);
            }
            return ' ';
        }
        
        /**
         * Agrega un valor dependiendo del año en que nacio
         * @param año Es el año que ingreso en la caja de texto
         * @return Retorna un valor dependiendo del año en el que ingreso
         */
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
