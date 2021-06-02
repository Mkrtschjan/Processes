//package org.kodejava.example.management;
// @author Raafat Elfouly and edited by Taline Mkrtschjan

import java.io.File;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.util.Date;
import java.util.Scanner;


public class Process1 {

   // Java code illustrating destroy()  
// method for windows operating system 
    public static void main(String[] args)  
    { 
        try 
        { 
                // create a new process 
            System.out.println("Creating Process"); 
              
            ProcessBuilder builder = new ProcessBuilder("open", "/Applications/Google Chrome.app"); 
            Process pro = builder.start();    
      
            System.out.println("Waiting"); 
            Thread.sleep(10000); 
                     
            RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
            String jvmName = bean.getName();
            System.out.println("Name = " + jvmName);
                    long pid = Long.valueOf(jvmName.split("@")[0]);
            System.out.println("PID  = " + pid);
            
            System.out.println("\nCreating new Process"); 
 
            ProcessBuilder builder1 = new ProcessBuilder("open", "/Users/mkrtschjan/CSCI435-Lab2.txt");
            
            Process pro1 = builder1.start();
            
            System.out.println(pro1);
            System.out.println("Waiting"); 
            Thread.sleep(10000);
                     
            RuntimeMXBean bean1 = ManagementFactory.getRuntimeMXBean();
            String jvmName1 = bean1.getName();
            System.out.println("Name = " + jvmName1);
            long pid1 = Long.valueOf(jvmName1.split("@")[0]);
            System.out.println("PID  = " + pid1);
            
            System.out.println("\nCreating new Process"); 
            
            ProcessBuilder builder2 = new ProcessBuilder("open", "http://www.ric.edu/"); 
            Process pro2 = builder2.start();    
      
            System.out.println("Waiting"); 
            Thread.sleep(10000); 
                     
            RuntimeMXBean bean2 = ManagementFactory.getRuntimeMXBean();
            String jvmName2 = bean2.getName();
            System.out.println("Name = " + jvmName2);
            long pid2 = Long.valueOf(jvmName2.split("@")[0]);
            System.out.println("PID  = " + pid2);
            
            OperatingSystemMXBean bean3 = ManagementFactory.getOperatingSystemMXBean();
            String osName = bean3.getName();
            String osVersion = bean3.getVersion();
            String architecture = bean3.getArch();
            System.out.println("Name of operating system is: " + osName);
            System.out.println("The operating system's version is: " + osVersion);
            System.out.println("The operating system's architecture is: " + architecture);
            long pid3 = Long.valueOf(jvmName2.split("@")[0]);
                        
            System.out.println("PID  = " + pid3);
            System.out.println();
            
            long currentTIme = System.currentTimeMillis();
            Date currentDate = new Date(currentTIme);
            System.out.println("The current time and date is " + currentDate+ "\n");
            
            
            pro.destroy(); 
            System.out.println("Process 1 destroyed"); 
            
            pro1.destroy(); 
            System.out.println("Process 2 destroyed"); 
            
            pro2.destroy(); 
            System.out.println("Process 3 destroyed"); 
      
        }  
            catch (Exception ex)  
        { 
            ex.printStackTrace(); 
        } 
    } 
}
