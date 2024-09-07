package org.nachc.tools.polites.util.action;

import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExecutePolitesGoActionForPostgres {
	
	public static void exec(ArrayList<String> sel, String cdmVersion) {
		String msg = "";
		msg += "\n* * *";
		msg += "\n*";
		msg += "\n* Executing action for POSTGRES";
		msg += "\n*";
		msg += "\n* * *";
		log.info("\n" + msg + "\n");
	}

}
