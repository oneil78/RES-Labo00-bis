/*
 * Christophe Peretti
 * RES Labo02
 */
package res;

import java.io.PrintStream;

public class CsvSerializer implements ISerializer{
	private String delimitter;
	public CsvSerializer(String delimitter){
		this.delimitter = delimitter;
	}
	public void serialize(IData data, PrintStream ps){
		String csv = "";
		for(String key: data.getKeys()){
			csv += data.getValue(key) + delimitter;
		}
		csv.replace(csv.substring(csv.length() - 1), "");
		ps.println(csv);
	}
}
