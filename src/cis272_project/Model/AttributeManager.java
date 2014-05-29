/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cis272_project.Model;

/**
 *
 * @author GW
 */
public class AttributeManager {
    
    public enum Type{
        id,
        name,
        href,
        src,
        alt,
        width,
        height,
        value
    }
    
    public String addSingleAttribute(String source, Type type){
        String element = type.name();
        
        String result = " " + element + "= \""+ source +" \" ";
        return result;
    }
}
