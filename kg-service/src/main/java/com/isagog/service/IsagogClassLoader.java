package com.isagog.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class IsagogClassLoader extends URLClassLoader {

    static {
        registerAsParallelCapable();
    }

    /*
    public IsagogClassLoader(String name, ClassLoader parent) {
        super(new URL[0], parent);
        //super(name, new URL[0], parent);
    }

     */

    /*
     * Required when this classloader is used as the system classloader
     */
    public IsagogClassLoader(ClassLoader parent) {
        super(new URL[0], parent);
    }



    public IsagogClassLoader() {
        this(Thread.currentThread().getContextClassLoader());
    }

    void add(URL url) {
        addURL(url);
    }

    public void add(String baseDir, String jarPath) throws MalformedURLException {
        URL url = new URL("file:///" + baseDir + java.io.File.separator +jarPath);
        addURL(url);

    }



    @Override
    public java.io.InputStream getResourceAsStream(String name) {
        for (URL url : getURLs()) {
            try {
                JarFile jarFile = new JarFile(new File(url.toURI()));
                final Enumeration<JarEntry> entries = jarFile.entries();
                while (entries.hasMoreElements()) {
                    final JarEntry entry = entries.nextElement();
                    if (entry.getName().equals(name)) {
                        JarEntry fileEntry = jarFile.getJarEntry(entry.getName());
                        return jarFile.getInputStream(fileEntry);
                    }
                }
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return super.getResourceAsStream(name);
    }

    public static IsagogClassLoader findAncestor(ClassLoader cl) {
        do {

            if (cl instanceof IsagogClassLoader)
                return (IsagogClassLoader) cl;

            cl = cl.getParent();
        } while (cl != null);

        return null;
    }

    /*
     *  Required for Java Agents when this classloader is used as the system classloader
     */
    @SuppressWarnings("unused")
    private void appendToClassPathForInstrumentation(String jarfile) throws IOException {
        add(Paths.get(jarfile).toRealPath().toUri().toURL());
    }
}