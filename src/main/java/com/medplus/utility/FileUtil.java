package com.medplus.utility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtil {
    private static final Logger LOGGER = Logger.getLogger(FileUtil.class.getName());

    public static List<String> getFileData(String fileName) {
        File file = new File(fileName);
        if(!file.exists())
        {
            System.out.println(file.getAbsoluteFile());
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.err.println("Error while creating file");
                Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        FileReader fr = null;
        BufferedReader br = null;
        List<String> data = new ArrayList<String>();
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();
                data.add(line);
            }
        }
        catch(Exception e) {
            LOGGER.log(Level.SEVERE,"Exception while reading the file",e);
        }
        finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE,"Exception while closing the file",e);
                e.printStackTrace();
            }
        }
        return data;
    }

    public static BufferedReader getFileReader(String filename) {
        File f  = new File(filename);
        if(!f.exists()) {
            try {
                f.createNewFile();
            }
            catch(Exception e) {
                LOGGER.log(Level.SEVERE,"Exception while creating the file",e);
            }
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return br;
    }

    public static void removeEntryInFile(String fileName, String lineData)
    {
        FileReader fin = null;
        BufferedReader bin = null;
        FileWriter fout = null;
        BufferedWriter bout = null;

        String tempFileName = fileName + "temp";
        try {
            fin = new FileReader(fileName);
            bin = new BufferedReader(fin);
            fout = new FileWriter(tempFileName);
            bout = new BufferedWriter(fout);

            while(bin.ready()){
                String currentLine = bin.readLine();
                if(!currentLine.equals(lineData)){
                    bout.write(currentLine+"\n");
                }
            }
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "error while reading the file", ex);
        } finally {
            try {
                if (bin != null) {
                    bin.close();
                }
                if (fin != null) {
                    fin.close();
                }
                if (bout != null) {
                    bout.close();
                }
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, "erroe while closing the file", ex);
            }
        }
        new File(tempFileName).renameTo(new File(fileName));
    }

    public static void modifyEntryInFile(String fileName, String oldData, String newData)
    {
        FileReader fin = null;
        BufferedReader bin = null;
        FileWriter fout = null;
        BufferedWriter bout = null;

        String tempFileName = fileName + "temp";
        try {
            fin = new FileReader(fileName);
            bin = new BufferedReader(fin);
            fout = new FileWriter(tempFileName);
            bout = new BufferedWriter(fout);

            while(bin.ready()){
                String currentLine = bin.readLine();
                if(currentLine.equals(oldData)){
                    bout.write(newData+"\n");
                }
                else{
                    bout.write(currentLine+"\n");
                }
            }
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "error while reading the file", ex);
        } finally {
            try {
                if (bin != null) {
                    bin.close();
                }
                if (fin != null) {
                    fin.close();
                }
                if (bout != null) {
                    bout.close();
                }
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, "erroe while closing the file", ex);
            }
        }

        new File(tempFileName).renameTo(new File(fileName));
    }
}
