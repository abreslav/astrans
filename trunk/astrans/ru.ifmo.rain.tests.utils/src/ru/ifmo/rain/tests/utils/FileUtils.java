package ru.ifmo.rain.tests.utils;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
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

	public static void assertEqualFiles(String comment, String expectedFile, String resultFile) throws FileNotFoundException, IOException {
		Reader expectedTransformation = new FileReader(expectedFile);
		Reader result = new FileReader(resultFile);
		FileUtils.assertEqualReaders(comment, expectedTransformation, result);
	}

	public static void assertEqualReaders(String comment, Reader expected, Reader result) throws IOException {
		int i = 0;
		int resultC;
		int expectedC;
		do {
			expectedC = expected.read();
			resultC = result.read();
			assertEquals(comment + ": " + i, expectedC, resultC);
			if (expectedC == -1 || resultC == -1) {
				break;
			}
			i++;
		} while (expectedC != -1 || resultC != -1);
	}
}