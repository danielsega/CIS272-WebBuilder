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
public interface Command {
    void execute();
    void undo();
}
