package com.boyer.challenge1.controllers;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//Build database to store contact information
//Build CRUD for said database
//Allow websockets to be opened
//Update database when device notifies socket

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@RequestMapping("/contactLocations")
	@ResponseBody
	public String getContactLocations() {
		return JSONObject.quote("Hello World");
	}
	
	@RequestMapping("/contactInformation")
	@ResponseBody
	public String getContactInformation(
		@RequestParam(value="id", required=true) String id
	){
		
		String[][] contactInformation = {
				{"Jack", "555-555-5555", "False"}
		};
		return JSONObject.quote(contactInformation.toString());
	}
	 
}
