/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import cis272_project.Model.ElementManager;

/**
 *
 * @author GW
 */
public class Element {
    private ElementManager eManager;
    
    public Element(){
        eManager = new ElementManager();
    }
    
    public String addSingleElements(String source, ElementManager.Type type){
        return eManager.addSingleElements(source, type);
    }

}
