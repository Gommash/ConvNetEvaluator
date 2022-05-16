package consolecommunicator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import rx.Observable;

public class ConsoleCommunicator {

	public static void invokePythonScript(String[] program) {
		try {			
			ProcessBuilder processBuilder = new ProcessBuilder(program);
		    processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
		    readProcessOutput(process.getInputStream());
		    
		    int exitCode = process.waitFor();
		    System.out.println("processes exited with code: "+exitCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    private static void readProcessOutput(InputStream inputStream) throws IOException {
        try (BufferedReader output = new BufferedReader(new InputStreamReader(inputStream))) {
        	Iterable<String> iterable = new Iterable<String>() {
        	    @Override
        	    public Iterator<String> iterator() {
        	        return output.lines().iterator();
        	    }
        	};
        	Observable.from(iterable).subscribe(s->{
        		System.out.println(s);
        	});
      
        }
    }
}
