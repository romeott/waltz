package com.khartec.waltz.common;

import org.junit.Test;
import org.springframework.core.io.Resource;

import java.io.IOException;

import static org.junit.Assert.*;
import static sun.text.normalizer.ICUData.getStream;

public class IOUtilities_getFileResource {
    @Test
    public void canGetFileResource() throws IOException {
        Resource file = IOUtilities.getFileResource("lines.txt");
        assertTrue(file.exists());
        assertNotEquals(0, file.contentLength());
    }


    @Test
    public void canGetEmptyFileResource() throws IOException {
        Resource file = IOUtilities.getFileResource("empty.txt");
        assertTrue(file.exists());
        assertEquals(0, file.contentLength());
    }

    @Test
    public void cannotGetNonExistingFile() throws IOException {
        Resource file = IOUtilities.getFileResource("myFile.txt");
        assertFalse(file.exists());
    }


    @Test(expected = IllegalArgumentException.class)
    public void nullNameThrowsException() throws IOException {
        IOUtilities.getFileResource(null);
    }
}
