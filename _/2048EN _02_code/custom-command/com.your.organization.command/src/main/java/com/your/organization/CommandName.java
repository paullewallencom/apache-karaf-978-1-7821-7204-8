package com.your.organization;

import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;


/**
 * Displays the last log entries
 */
@Command(scope = "LAK", name = "commandname", description = "This is a sample custom command.")
public class CommandName extends OsgiCommandSupport {

    protected Object doExecute() throws Exception {
         System.out.println("Executing command commandname");
         return null;
    }
}
