package logic;
import java.util.Random;
import java.util.*;   
import logic.conversione;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class orologio{
	public double cambioorario(double inp,double inp2) {
		double n;
		double n2;
		conversione conv = new conversione();
		n=conv.con(inp);
		n2=conv.con(inp2);
		return n+n2;

  }

}