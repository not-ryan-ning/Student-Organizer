/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrganizer;

import java.util.ArrayList;

/**
 *
 * @author ryan
 */
public class ClassGroup {
    private String className;
    private ArrayList<String> activities;
    
    public ClassGroup(String className, ArrayList<String> activities){
        this.className = className; 
        this.activities = activities;
    }
    
    public ClassGroup() {
        
    }

    public String getClassName() {
        return className;
    }

    public ArrayList<String> getActivities() {
        return activities;
    }
    
    public int getActivitiesNumber() {
        return activities.size();   
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setActivities(ArrayList<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "ClassGroup{" + "className=" + className + ", activities=" + activities + '}';
    }
    
    
    
    
}
