import java.io.*;
// Implement Bellman-Ford
public class dvrouter {
//TODO create table object for each node

public dvrouter(String input) //, String changes, String message
{
	//TODO Handle input 
}

public static void main(String args[]) { 
	// declare string that will hold file contents
	String[] files = new String[3]; 
	 
	if (args.length != 3) {
		System.out.println("format should be: java dvrouter topofile changesfile messagefile");
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
	dvrouter one = new dvrouter(files[0]);
	dvrouter two = new dvrouter(files[1]);
	dvrouter three = new dvrouter(files[2]);
	
} 
}	// END CLASS













// --------------------------Scrap code--------------------------------------------------------


		//File[] files = new File[3]; 
		/*
		files[0] = new File(args[0]);
		files[1] = new File(args[1]);
		files[2] = new File(args[2]);
		*/
		/*
		for (String a : args) {
			System.out.println(a);	
		}
		*/	
		//System.out.print(files[0]);
		//System.out.print(files[1]);	
		//System.out.print(files[2]);
		/*
		BufferedReader br = new BufferedReader(files[0]);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.prinln(line);
		}
		*/

	//chat_client client = new chat_client(args[0], Integer.parseInt(args[1]));
