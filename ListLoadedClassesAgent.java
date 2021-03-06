package classloaders;

import java.lang.instrument.Instrumentation;

public class ListLoadedClassesAgent {

	private static Instrumentation instrumentation;

	public static void premain(String agentArgs, Instrumentation instrumentation) {
		ListLoadedClassesAgent.instrumentation = instrumentation;
	}

	public static Class<?>[] listLoadedClasses(String classLoaderType) {
		return instrumentation.getInitiatedClasses(getClassLoader(classLoaderType));
	}

	private static ClassLoader getClassLoader(String classLoaderType) {
		ClassLoader classLoader = null;
		switch (classLoaderType) {
		case "SYSTEM":
			classLoader = ClassLoader.getSystemClassLoader();
			break;
		case "EXTENSION":
			classLoader = ClassLoader.getSystemClassLoader().getParent();
			break;
		case "BOOTSTRAP":
			break;
		case "PLATFORM":
			classLoader = ClassLoader.getPlatformClassLoader();
			break;
		default:
			break;
		}
		return classLoader;
	}
}