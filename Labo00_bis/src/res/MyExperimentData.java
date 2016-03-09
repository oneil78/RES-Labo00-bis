/*
 * Christophe Peretti
 * RES Labo02
 */
package res;

import java.util.HashMap;

public class MyExperimentData implements IData{

	private HashMap<String, Object> myMap;
	public MyExperimentData(String operation,String strategy,int blockSize,long fileSizeInBytes,long durationInMs){
		myMap = new HashMap<String, Object>();
		myMap.put("operation", operation);
		myMap.put("strategy", strategy);
		myMap.put("blockSize", blockSize);
		myMap.put("fileSizeInBytes", fileSizeInBytes);
		myMap.put("durationInMs", durationInMs);
	}
	public String[] getKeys(){
		return new String[]{"operation","strategy", "blockSize", "fileSizeInBytes", "durationInMs"};
	}
	public Object getValue(String key){
		return myMap.get(key);
	}
	
}
