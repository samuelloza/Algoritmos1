package ejemplos;

import java.io.File;
import java.util.Iterator;

public class folders_recursivo {

	public static void main(String[] args) {
		File root = new File("/tmp/dir0/");
		recursive_files(root, "|");
	}

	public static void recursive_files(File file, String indent) {

		// Caso base, si no es directorio
		if (!file.isDirectory()) {
			System.out.println(indent + "─" + file.getName());
			return;
		}

		System.out.println(indent + "" + file.getName());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				recursive_files(f, indent + "─");
			}
		}
	}
}
