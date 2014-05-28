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
public class ElementManager {
    
    public enum Type{
        h1,h2,h3,h4,h5,h6,
        p, 
        a,
        img,
        form,
        div,
        span,
        ul,
        li,
        table,
        tr,
        td,
        iframe,
        title
    }
    
    public String addSingleElements(String source, Type type){
        String main = source;
        String element = type.name();
        
        String result = "<" + element + ">" + source + "</" + element + ">";
        return result;
    }
}
