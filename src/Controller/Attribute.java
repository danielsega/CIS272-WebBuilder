/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import cis272_project.Model.AttributeManager;

/**
 *
 * @author GW
 */
public class Attribute {
    private AttributeManager aManager;
    
    public Attribute(){
        aManager = new AttributeManager();
    }
    
    public String addSingleAttribute(String source, AttributeManager.Type type){
        return aManager.addSingleAttribute(source, type);
    }

}
