package com.Ahtoh.company;

import java.sql.*;
import java.io.*;

public class Something {

    public static void main(String[] args) {

    }

    public void couldThrowAnException() throws IOException, SQLException {}

static void log(Exception e) { }

    public void rethrow() throws SQLException, IOException {
        try {
             couldThrowAnException();
             } catch (Exception e) { // watch out: this isn't really
             // catching all exception subclasses
             log(e);
             throw e; // note: won't compile in Java 6
             }
         }

}
