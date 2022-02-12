/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Middleware;

/**
 *
 * @author boble
 */
public class Middleware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertidor convertidor = new Convertidor();
        
        String xmlStr = "<student>\r\n"
                + "	<firstName>John</firstName>\r\n"
                + "	<id>1</id>\r\n"
                + "	<lastName>Smith</lastName>\r\n"
                + "</student>";
        
        System.out.println(convertidor.convertirXMLaJSON(xmlStr));
        
        String jsonStr = "{\r\n"
                + "	employee : {\r\n"
                + "		\"emp_id\":1,\r\n"
                + "		\"name\":\"John\",\r\n"
                + "		\"cmpName\":\"TATA\"\r\n"
                + "	}\r\n"
                + "}";
        
        System.out.println(convertidor.convertirJSONaXML(jsonStr));

    }
    
}
