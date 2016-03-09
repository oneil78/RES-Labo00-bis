/*
 * Christophe Peretti
 * RES Labo02
 */
package res;

import java.io.PrintStream;

public interface ISerializer {
	public void serialize(IData data, PrintStream ps);
}
