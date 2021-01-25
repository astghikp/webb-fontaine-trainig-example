package IOHomework;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;

public class TestAPI {
    @BeforeTest
    public void createFilesForTest() {
        CreateFiles.createAndFillFiles();


    }

    @Test
    public void testGetAllFileNames() {
        File directory = new File("resIO");
        StringBuilder allNames = null;
        try {
            allNames = new StringBuilder(IOAPI.getAllFilesFromDir(directory));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assert allNames != null;
        Assert.assertEquals(allNames.toString(), "file1.txt file2.doc file3.txt file4.jpg nested ");

    }

    @Test
    public void testGetAllFileNamesEmptyDirectory() {
        File directory = new File("empty");
        StringBuilder allNames = null;
        try {
            allNames = new StringBuilder(IOAPI.getAllFilesFromDir(directory));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assert allNames != null;
        Assert.assertEquals(allNames.toString(), "");

    }

    @Test
    public void testGetAllFileNamesDirectoryNotExist() {
        File directory = new File("lalala");
        StringBuilder allNames = null;
        try {
            allNames = new StringBuilder(IOAPI.getAllFilesFromDir(directory));
            Assert.assertEquals(allNames.toString(), "file1.txt file2.doc file3.txt file4.jpg ");
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testGetAllFilesWithExtension() {
        File directory = new File("resIO");
        StringBuilder extensions = null;
        String ext = "txt";
        try {
            extensions = new StringBuilder(IOAPI.getFilesByExtension(directory, ext));
            Assert.assertEquals(extensions.toString(), "");
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testGetAllFilesWithExtensionNoFilesFound() {
        File directory = new File("resIO");
        StringBuilder extensions = null;
        String ext = "png";
        try {
            extensions = new StringBuilder(IOAPI.getFilesByExtension(directory, ext));
            Assert.assertEquals(extensions.toString(), "");
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testGetAllFilesWithExtensionNullCases() {
        File directory = new File("");
        StringBuilder extensions = null;
        String ext = "txt";
        try {
            extensions = new StringBuilder(IOAPI.getFilesByExtension(directory, ext));
            Assert.assertEquals(extensions.toString(), " ");
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileExists() {
        File file = new File("resIO/file1.txt");
        try {
            boolean exists = IOAPI.fileExists(file.getPath());
            Assert.assertTrue(exists);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileExistsWrongFile() {
        File file = new File("resIO/12file1.txt");
        try {
            boolean exists = IOAPI.fileExists(file.getPath());
            Assert.assertFalse(exists);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileCanReadAndWrite() {
        File file = new File("resIO/file1.txt");
        try {
            boolean exists = IOAPI.canReadAndWrite(file);
            Assert.assertTrue(exists);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileCanReadAndWriteNotExistingFile() {
        File file = new File("resIO/12file1.txt");
        try {
            boolean exists = IOAPI.canReadAndWrite(file);
            Assert.assertFalse(exists);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }
    }

    @Test
    public void testCheckFileSize() {
        File file = new File("resIO/file1.txt");
        try {
            StringBuilder fileSize = new StringBuilder(IOAPI.fileSize(file));
            Assert.assertEquals(fileSize, "");
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileContent() {
        File file = new File("resIO/file1.txt");
        try {
            String[] fileContent = IOAPI.fileContent(file);
            assert fileContent != null;
            Assert.assertEquals(fileContent[0], "test file 1 lorem ipsum");
            Assert.assertEquals(fileContent[1], "line 2");
            Assert.assertEquals(fileContent[2], "line 3");
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileContentEmptyFile() {
        File file = new File("resIO/nested");
        try {
            String[] fileContent = IOAPI.fileContent(file);
            assert fileContent != null;
            Assert.assertEquals(fileContent[0], "");
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileContentNotTextFile() {
        File file = new File("resIO/file4.jpg");
        try {
            String[] fileContent = IOAPI.fileContent(file);
            Assert.assertNull(fileContent, "null");
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileContentFileNotExist() {
        File file = new File("resIO/123file1.txt");
        try {
            String[] fileContent = IOAPI.fileContent(file);
            Assert.assertNull(fileContent, null);
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileLineCount() {
        File file = new File("resIO/file1.txt");
        try {
            int count = IOAPI.lineCount(file);
            Assert.assertEquals(count, 3);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileLineCountNoLines() {
        File file = new File("resIO/nested");
        try {
            int count = IOAPI.lineCount(file);
            Assert.assertEquals(count, 0);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFileLineCountFileNotExist() {
        File file = new File("resIO/nested121212");
        try {
            int count = IOAPI.lineCount(file);
            Assert.assertEquals(count, 0);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckFromFileToFile() {
        File file = new File("resIO/file1.txt");
        try {
            File copy = IOAPI.fromFileToFile(file);
            Assert.assertEquals(copy.getPath(), "resIO/file3.txt");
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckCopyAndDelete() {
        File file = new File("resIO/file3.txt");

        try {
            boolean copy = IOAPI.copyAndDelete(file);
            Assert.assertFalse(copy);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println(" File doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckCopyAndDeleteFileNotExist() {
        File file = new File("resIO/file33.txt");
        try {
            boolean copy = IOAPI.copyAndDelete(file);
            Assert.assertTrue(copy);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckCountWord() {
        File file = new File("resIO/file3.txt");
        try {
            boolean copy = IOAPI.countWord(file, "line");
            Assert.assertTrue(copy);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }

    @Test
    public void testCheckCountWordNotContain() {
        File file = new File("resIO/file3.txt");
        try {
            boolean copy = IOAPI.countWord(file, "girl");
            Assert.assertTrue(copy);
        } catch (NullPointerException e) {
            System.out.println(" Directory doesn't exist");
            e.printStackTrace();
        }

    }
}
