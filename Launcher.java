package classloaders;

import java.util.Arrays;

public class Launcher {

	public static void main(String[] args) {
		printClassesLoadedBy("BOOTSTRAP");
		printClassesLoadedBy("SYSTEM");
		printClassesLoadedBy("EXTENSION");
	}

	private static void printClassesLoadedBy(String classLoaderType) {
		System.out.println(classLoaderType + " ClassLoader : ");
	}
}
