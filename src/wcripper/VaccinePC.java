
package wcripper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VaccinePC {
    public static void ExecCure(String command){
        
        try{
           //String command = "powershell.exe  your command";
            //Getting the version
            
             
            Process powerShellProcess = Runtime.getRuntime().exec(command);
            powerShellProcess.getOutputStream().close();
            String line;
            
            System.out.println("Standard Output:");
            BufferedReader stdout = new BufferedReader(new InputStreamReader(
            powerShellProcess.getInputStream()));
            
            while ((line = stdout.readLine()) != null) {
             System.out.println(line);
             }
             stdout.close();
             System.out.println("Standard Error:");
            BufferedReader stderr = new BufferedReader(new InputStreamReader(
             powerShellProcess.getErrorStream()));
            while ((line = stderr.readLine()) != null) {
             System.out.println(line);
             }
            stderr.close();
            System.out.println("Done");
             }catch(IOException ioe){
        
             }
    }  
}
