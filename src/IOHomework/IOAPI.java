package IOHomework;

import java.io.*;
import java.util.Objects;

public class IOAPI {

    //get file extension
    public static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

    // get a list of all file/directory names from the given directory.
    public static StringBuilder getAllFilesFromDir(File directory) throws NullPointerException {
        if (directory == null) {
            throw new NullPointerException();
        }

        String[] fileList = directory.list();
        StringBuilder allNames = new StringBuilder();
        for (String name : Objects.requireNonNull(fileList)) {
            allNames.append(name).append(" ");

        }
        return allNames;
    }

    //get specific files by extensions from a specified directory

    public static StringBuilder getFilesByExtension(File directory, String extension) throws NullPointerException
    {
        if (directory == null || extension == null) {
            throw new NullPointerException();
        }
        String[] fileList = directory.list();
        StringBuilder allNames = new StringBuilder();
        for (String name : Objects.requireNonNull(fileList)) {
            if (name.contains(extension)) {
                allNames.append(name).append(" ");
            }

        }
        return allNames;
    }

    //check if a file or directory specified by pathname exists or not
    public static boolean fileExists(String path) throws NullPointerException {
        if (path == null) {
            throw new NullPointerException();
        }
        File fileName = new File(path);
        return fileName.exists();
    }

    //check if a file has read and write permission or not
    public static boolean canReadAndWrite(File file) throws NullPointerException {
        if (file == null) {
            throw new NullPointerException();
        }
        return file.canRead() && file.canWrite();
    }

    //get file size in bytes, kb, mb
    public static StringBuilder fileSize(File file) throws NullPointerException {
        if (file == null) {
            throw new NullPointerException();
        }
        StringBuilder fileSize = new StringBuilder();

        double sizeBytes = file.length();
        double sizeKB = sizeBytes / 1024;
        double sizeMB = sizeKB / 1024;
        fileSize.append("File size in Bytes ").append(sizeBytes).append(" File size in KB ").append(sizeKB).append(" File size in MB ").append(sizeMB);
        return fileSize;


    }

    //store text file content line by line into an array
    public static String[] fileContent(File file) throws FileNotFoundException {
        if (file == null) {
            throw new FileNotFoundException();
        }
        StringBuilder allContent = new StringBuilder();
        if (getFileExtension(file).contains("txt") || getFileExtension(file).contains("doc")) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader reader = new BufferedReader(fileReader)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    allContent.append(line).append(",");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (allContent.length() != 0) {
            return allContent.toString().split(",");
        } else return null;

    }

    public static int lineCount(File file) throws NullPointerException {
        if (file == null) {
            throw new NullPointerException();
        }
        int counter = 0;
        if (getFileExtension(file).contains("txt") || getFileExtension(file).contains("doc")) {

            try (FileReader fileReader = new FileReader(file);
                 BufferedReader reader = new BufferedReader(fileReader)) {
                String line;

                while ((line = reader.readLine()) != null) {
                    counter++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return counter;

    }

    public static File fromFileToFile(File file) throws NullPointerException {
        if (file == null) {
            throw new NullPointerException();
        }
        File newFile = new File("resIO/file3.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(newFile);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            String line;

            while ((line = reader.readLine()) != null) {

                writer.write(line);
                writer.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFile;
    }

    public static boolean copyAndDelete(File file) throws FileNotFoundException {
        if (file == null)
            throw new FileNotFoundException();
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(file.getPath() + " copy." + getFileExtension(file));
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                writer.write(line);
                writer.newLine();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return file.delete();

    }

    public static boolean countWord(File file, String word) throws NullPointerException {
        if (file == null || word== null) {
            throw new NullPointerException();
        }
        int counter = 0;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter("resIO/result.txt", true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    counter++;
                }

            }
            writer.write("For " + file.getName() + " -" + word + "- appears " + counter + " times");
            writer.newLine();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;

    }


}
