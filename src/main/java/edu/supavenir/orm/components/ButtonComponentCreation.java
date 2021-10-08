package edu.supavenir.orm.components;

import java.io.IOException;

import io.github.jeemv.springboot.vuejs.components.VueComponent;

public class ButtonComponentCreation {

    public static void main(String[] ars) throws IOException {
	VueComponent button = new VueComponent("button-msg");
	button.addData("message", "Cliquer sur le bouton ...");
	button.addProp("type", "success");
	button.setDefaultTemplateFile();
	// button.createFile(false);

	VueComponent List = new VueComponent("list-item");
	List.addPropRaw("list", "[]");
	List.setDefaultTemplateFile();
	// List.createFile(false);
	VueComponent.globalJs("button-msg.js", "list-item.js");

    }
}
