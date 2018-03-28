package kolekcje;
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Stream1 {

	public static void main(String[] args) throws IOException{
    Stream <String>rows=Files.lines(Paths.get("wiersz.txt"));
int countRows=(int)rows
.map(x->x.split(","))
.filter(x->x.length==3)
.count();
System.out.println(rows);
System.out.println();
System.err.println("gdzie wydrukujeszz i w jakim kolorze");
	}

}
