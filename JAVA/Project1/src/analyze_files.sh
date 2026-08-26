#!/usr/bin/env bash

#Shell script to analyze the text files of put in a certain directory.

class_name="FileAnalyzer"
dir_name="TextFiles"
if [ ! -d "$dir_name" ]; then
    echo "Directory not found"
    exit 1
fi

#compile the java program written in the class_name
javac "$class_name".java

if [ $? -ne 0 ]; then
    echo "Error:Compilation error."
    exit 1
fi

#command line argument
java "$class_name" "$dir_name"

rm "$class_name".class




