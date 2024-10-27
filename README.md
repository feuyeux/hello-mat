# Hello MAT

This is a simple example of Eclipse **M**emory **A**nalyzer **T**ool. 

## MemoryAnalyzer

### Installation

<https://www.eclipse.org/mat/downloads.php>

- [Windows (x86_64)](https://www.eclipse.org/downloads/download.php?file=/mat/1.15.0/rcp/MemoryAnalyzer-1.15.0.20231206-win32.win32.x86_64.zip)
- [Mac OSX (Mac/Cocoa/x86_64)](https://www.eclipse.org/downloads/download.php?file=/mat/1.15.0/rcp/MemoryAnalyzer-1.15.0.20231206-macosx.cocoa.x86_64.dmg)
- [Linux (x86_64/GTK+)](https://www.eclipse.org/downloads/download.php?file=/mat/1.15.0/rcp/MemoryAnalyzer-1.15.0.20231206-linux.gtk.x86_64.zip)

### Documentation

https://help.eclipse.org/latest/index.jsp?topic=/org.eclipse.mat.ui.help/welcome.html

## Demo

run.sh

```sh
java -Xms10m -Xmx10m \
  -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=$DUMP_PATH \
  -jar target/hello-mat.jar
```

```sh
sh build.sh && sh run.sh
```

Check **Leak Suspects**, if there's a memory leak

![Leak Suspects](images/leak-suspects.png)

Check **Histogram**, **Dominator Tree**, and **thread**, to see the big object

![Histogram](images/histogram.png)

![Dominator_Tree](images/dominator-tree.png)

![Thread_Overview](images/thread-overview.png)


