package com.bydan.framework.erp.util;

import java.io.*;
import java.util.*;
import javax.activation.*; 

@SuppressWarnings("unused")
public class BufferedDataSource implements DataSource {

    private byte[] _data;
    private java.lang.String _name;

    /**
    * Creates a DataSource from an array of bytes
    * @param data byte[] Array of bytes to convert into a DataSource
    * @param name String Name of the DataSource (ex: filename)
    */
    public BufferedDataSource(byte[] data, String name) {
        _data = data;
        _name = name;
    }

    /**
    * Returns the content-type information required by a DataSource
    * application/octet-stream in this case
    */
    public String getContentType() {
        return "application/octet-stream";
    }

    /**
    * Returns an InputStream from the DataSource
    * @returns InputStream Array of bytes converted into an InputStream
    */
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(_data);
    }

    /**
    * Returns the name of the DataSource
    * @returns String Name of the DataSource
    */
    public String getName() {
        return _name;
    }

    /**
    * Returns an OutputStream from the DataSource
    * @returns OutputStream Array of bytes converted into an OutputStream
    */
    public OutputStream getOutputStream() throws IOException {
        OutputStream out = new ByteArrayOutputStream();
        out.write(_data);
       
        return out;
    }
}
