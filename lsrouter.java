import java.io.*;
// Implement dijkstra's

public class lsrouter {
//TODO create table object for each node

public lsrouter(String input) //String topo, String changes, String message
{ 
	//TODO Handle input 
}

public static void main(String args[]) { 
	String[] files = new String[3]; 
	 
	if (args.length != 3) {
		System.out.println("format should be: java lsrouter topofile changesfile messagefile");
	}
	else {
		try {
			InputStream is = new FileInputStream(args[0]);
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line = buf.readLine();
			StringBuilder sb = new StringBuilder();
			while(line != null){
			   sb.append(line).append("\n");
			   line = buf.readLine();
			}
			// String files[#] <- File contents  
			files[0] = sb.toString();
			//System.out.println(files[0]);
		} catch (IOException e) {
		}
		try {
			InputStream is = new FileInputStream(args[1]);
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line = buf.readLine();
			StringBuilder sb = new StringBuilder();
			while(line != null){
			   sb.append(line).append("\n");
			   line = buf.readLine();
			}
			// String files[#] <- File contents
			files[1] = sb.toString();
			//System.out.println(files[1]);
		} catch (IOException e) {
		}
		try {
			InputStream is = new FileInputStream(args[2]);
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line = buf.readLine();
			StringBuilder sb = new StringBuilder();
			while(line != null){
			   sb.append(line).append("\n");
			   line = buf.readLine();
			}
			// String files[#] <- File contents
			files[2] = sb.toString();
			//System.out.println(files[2]);
		} catch (IOException e) {
		}
	}
	// TODO intitialize object to handle file input and make changes to overall graphs
	lsrouter one = new lsrouter(files[0]);
	lsrouter two = new lsrouter(files[1]);
	lsrouter three = new lsrouter(files[2]);
	
} 
}// END CLASS
