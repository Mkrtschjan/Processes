//package org.kodejava.example.management;

import java.io.File;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Scanner;

/**@author Raafat
 */
public class Process2 {

   // Java code illustrating destroy()  
// method for windows operating system 
    public static void main(String[] args)  
    { 
        try 
        { 
                // create a new process 
            System.out.println("Creating Process"); 
              
            ProcessBuilder builder = new ProcessBuilder("open", "/System/Applications/TextEdit.app"); 
            Process pro = builder.start(); 

          System.out.println("Waiting"); 
           Thread.sleep(100000); 
                     
            RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
          String jvmName = bean.getName();
        System.out.println("Name = " + jvmName);
                    long pid = Long.valueOf(jvmName.split("@")[0]);
        System.out.println("PID  = " + pid);
        pro.destroy(); 
            System.out.println("Process destroyed"); 
      
        }  
            catch (Exception ex)  
        { 
            ex.printStackTrace(); 
        } 
    } 
}
