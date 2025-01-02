<h1 align="Center">Chapter One Notes:</h1>
<br>
<br>

## More about Classloader:

**JVM** first loads the bytecode of the class to memory using a program called the **class loader**. If the program uses other classes, the class loader dynamically loads them just before they are needed. After a class is loaded, the JVM uses a program called **bytecode varifier** to check the validity of the bytecode and to ensure that the bytecode doesn't voilate Java's security restrictions. Java enforcces strict security to make sure Java class files are not tampered with and do not harm your computer. 

<br>

## More about java launcher: 

We don't use the extension .class in the command line when executing a program. We use java ClassName to run the program. If we use java ClassName.class in the command line, the system will attempt to fetch ClassName.class.class

In **JDK 11** and onwards we can use the java ClassName.java to compile and run a single-file source code program. This command combines compiling and running in one command. A single-file source code program contains only one class in the file. This is the case of all of our programs in the first eight chapters. 

<br>

## More about Block Styles: 

A block is a group of statements surrounded by braces. There are two popular styles, next-line style and end-of-line style:

#### Next-Line Style: The next-line style aligns braces vertically and makes program easy to read.


```
public class Test 
{
    public static void main(String[] args)
    {
        System.out.println("Block Style")
    }
}
```

#### End-Of-Line Style: The end-of-line style saves space and may help avoid some subtle programming errors.

```
public class Test{
    public static void main(String[] args){
        System.out.println("End-Of-Line Style.")
    }
}
```
