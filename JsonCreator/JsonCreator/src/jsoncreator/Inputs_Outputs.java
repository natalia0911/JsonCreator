/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoncreator;

/**
 *
 * @author Natalia Vargas Reyes
 */
public class Inputs_Outputs {
    private String name;
    private String type;

    public Inputs_Outputs(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Inputs_Outputs() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
