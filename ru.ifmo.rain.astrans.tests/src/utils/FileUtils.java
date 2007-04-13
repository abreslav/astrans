package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class FileUtils {
	public static Collection<Object[]> processDirectory(String dataDir,
			IFileProcessor fileProcessor) {
		File dir = new File(dataDir);
		File[] files = dir.listFiles();
		Collection<Object[]> result = new ArrayList<Object[]>();
		for (File file : files) {
			if (file.isDirectory() && !file.isHidden()) {
				result.add(fileProcessor.process(file));
			}
		}
		return result;
	}
}