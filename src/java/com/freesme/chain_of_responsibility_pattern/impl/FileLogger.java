package com.freesme.chain_of_responsibility_pattern.impl;

import com.freesme.chain_of_responsibility_pattern.AbstractLogger;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::logger: " + message);
    }
}
