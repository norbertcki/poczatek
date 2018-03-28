package kolekcje;
import java.util.stream.Stream.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Stream {

	public static void main(String[] args) throws IOException{
   Stream<String>rows=Files.lines(Paths.get("wiersz.txt"));
int countRows=(int)rows
.map(x->x.split(","))
.filter(x->x.lenght==3)
.count();
System.out.println(rows);

	}

}
