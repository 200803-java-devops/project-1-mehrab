package com.revature;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MonitorService {
    public String service(String command) throws Exception {
        ProcessBuilder pBuilder = new ProcessBuilder();
        pBuilder.command("bash", "-c", command);
        Process process = pBuilder.start();
        StringBuilder output = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine())!= null) {
            output.append(line + "\n");
        }
        int exitCode = process.waitFor();
        if (exitCode == 0) {
            return output.toString();
        } else {
            return "failure";
        }
    }
}