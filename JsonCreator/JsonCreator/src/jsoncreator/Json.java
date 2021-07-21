/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsoncreator;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Natalia Vargas Reyes
 */
public class Json {
    private String code;
    private String name;
    private String level;
    private String creator;
    private String created;
    private String call;
    private String section;
    private String details;
    private String call1;
    private String result1;
    private String comment1;
    private String call2;
    private String result2;
    private String comment2;
    private String call3;
    private String result3;
    private String comment3;
    private String programCode;
    private ArrayList<Inputs_Outputs> inputs;
    private ArrayList<Inputs_Outputs> outputs;

    public Json() {}

    public Json(String code, String name, String level, String creator, String created,
            String call, String section, String details, String call1, String result1,
            String comment1, String call2, String result2, String comment2, String call3,
            String result3, String comment3, String programCode, ArrayList<Inputs_Outputs> inputs,
            ArrayList<Inputs_Outputs> outputs) {
        this.code = code;
        this.name = name;
        this.level = level;
        this.creator = creator;
        this.created = created;
        this.call = call;
        this.section = section;
        this.details = details;
        this.call1 = call1;
        this.result1 = result1;
        this.comment1 = comment1;
        this.call2 = call2;
        this.result2 = result2;
        this.comment2 = comment2;
        this.call3 = call3;
        this.result3 = result3;
        this.comment3 = comment3;
        this.programCode = programCode;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCall1() {
        return call1;
    }

    public void setCall1(String call1) {
        this.call1 = call1;
    }

    public String getResult1() {
        return result1;
    }

    public void setResult1(String result1) {
        this.result1 = result1;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getCall2() {
        return call2;
    }

    public void setCall2(String call2) {
        this.call2 = call2;
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getCall3() {
        return call3;
    }

    public void setCall3(String call3) {
        this.call3 = call3;
    }

    public String getResult3() {
        return result3;
    }

    public void setResult3(String result3) {
        this.result3 = result3;
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public ArrayList<Inputs_Outputs> getInputs() {
        return inputs;
    }

    public void setInputs(ArrayList<Inputs_Outputs> inputs) {
        this.inputs = inputs;
    }

    public ArrayList<Inputs_Outputs> getOutputs() {
        return outputs;
    }

    public void setOutputs(ArrayList<Inputs_Outputs> outputs) {
        this.outputs = outputs;
    }

    @Override
    public String toString() {
        return "Json{" + "code=" + code + ", name=" + name + ", level=" + level + ", creator=" + creator + ", created=" + created + ", call=" + call + ", section=" + section + ", details=" + details + ", call1=" + call1 + ", result1=" + result1 + ", comment1=" + comment1 + ", call2=" + call2 + ", result2=" + result2 + ", comment2=" + comment2 + ", call3=" + call3 + ", result3=" + result3 + ", comment3=" + comment3 + ", programCode=" + programCode + ", inputs=" + inputs + ", outputs=" + outputs + '}';
    }
    
    
    public boolean generateJson(){
        
        JSONObject obj = new JSONObject();
        //array of objects call
	JSONArray examples = new JSONArray();
	JSONObject call1 = new JSONObject();
            call1.put("call", this.call1);
            call1.put("result", this.result1);
            call1.put("comment", this.comment1);
        JSONObject call2 = new JSONObject();
            call2.put("call", this.call2);
            call2.put("result", this.result2);
            call2.put("comment", this.comment2);
        JSONObject call3 = new JSONObject();
            call3.put("call", this.call3);
            call3.put("result", this.result3);
            call3.put("comment", this.comment3);
        examples.add(call1);
        examples.add(call2);
        examples.add(call3);
	//object with arrays
	JSONObject solution = new JSONObject();
        JSONArray inputs = new JSONArray();
        JSONArray outputs = new JSONArray();
        for (int i=0;i<this.inputs.size();i++){
	    JSONObject input = new JSONObject();
            input.put("name", this.inputs.get(i).getName());
            input.put("type", this.inputs.get(i).getType());
            inputs.add(input);
        }
        for (int i=0;i<this.outputs.size();i++){
	    JSONObject output = new JSONObject();
            output.put("name", this.outputs.get(i).getName());
            output.put("type", this.outputs.get(i).getType());
            outputs.add(output);
        }
        solution.put("inputs",inputs);
        solution.put("outputs",outputs);
        solution.put("code",this.programCode);
        
        obj.put("code", this.code);
	obj.put("name", this.name);
	obj.put("level", this.level);
        obj.put("creator", this.creator);
        obj.put("created", this.created);
        obj.put("call", this.call);
        obj.put("section", this.section);
        obj.put("details", this.details);
	obj.put("examples", examples);
        obj.put("solution", solution);
        
        System.out.println(obj);
	try {
            FileWriter file = new FileWriter("d:\\JSONS\\arboles\\"+this.code+".json");  //Cambiar por la ruta donde se necesite
	    file.write(obj.toJSONString());
	    file.flush();
	    file.close();

	} catch (IOException e) {
            return false;
	}

        return true;
    
    }
    
    
    
}
