package ru.ifmo.rain.tests.utils;
import java.io.File;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class DirectoryBasedTest {

	protected static String getTestRoot() {
		return "tests";
	}
	
	@Parameters
	public static Collection<Object[]> parameters() {
		return FileUtils.processDirectory(getTestRoot(), new IFileProcessor() {

			public Object[] process(File file) {
				return new Object[] {file};
			}
			
		});
	}
	
	private final File testDir;

	public DirectoryBasedTest(final File testDir) {
		super();
		this.testDir = testDir;
	}
	
	protected String getPath(String file) {
		return new File(testDir, file).getPath();
	}
	
	public File getTestDir() {
		return testDir;
	}
}
