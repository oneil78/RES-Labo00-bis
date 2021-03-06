/*
 * Christophe Peretti
 * RES Labo02
 */
package res;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileRecorder implements IRecorder{
	private String filename;
	private ISerializer serializer;
	private PrintStream ps;
	
	public FileRecorder(String filename, ISerializer serializer) throws FileNotFoundException{
		this.filename = filename;
		this.serializer = serializer;
		init();
	}
	public void init() throws FileNotFoundException{
		File outputFile = new File(this.filename);
		this.ps = new PrintStream(outputFile);
	}
	public void record(IData data){
		serializer.serialize(data, ps);
	}
}
