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
    public static String obtenerSexo(String sexo){
        switch (sexo){
            case "Hombre":
                    return "H";
            default:
                return "M";
                    
        }
      
    } 
    String curp = "";
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
}
