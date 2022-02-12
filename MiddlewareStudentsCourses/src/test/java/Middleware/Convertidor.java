/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Middleware;

import org.json.JSONObject;
import org.json.XML;

/**
 *
 * @author boble
 */
public class Convertidor {

    public Convertidor() {
    }
    
    JSONObject convertirXMLaJSON(String xml){
        JSONObject json = XML.toJSONObject(xml);
        return json;
    }
    
    String convertirJSONaXML(String jsonString){
        JSONObject json = new JSONObject(jsonString);
        String xml = XML.toString(json);
        return xml;
    }
}
