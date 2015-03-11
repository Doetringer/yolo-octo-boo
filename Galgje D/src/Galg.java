import java.util.ArrayList;

public class Galg {
	public WoordLezer woordlezer;
	public StringBuilder word;
	public StringBuilder puntjeswoord;
	public int lifes;
	public ArrayList<Character> wrong = new ArrayList<Character>();
	public boolean geraden;

	public Galg() {
		this.woordlezer = new WoordLezer("woorden.txt");
		this.word = new StringBuilder(woordlezer.geefWoord());
		this.lifes = 10;
		setupPuntjeswoord();
	}

	public void setupPuntjeswoord() {
		this.puntjeswoord = new StringBuilder(word.length());
		for (int i = 0; i < word.length(); i++) {
			this.puntjeswoord.append('.');
		}
	}

	public boolean geraden() {
		for (int i = 0; i < this.puntjeswoord.length(); i++) {
			if (this.puntjeswoord.charAt(i) == '.') {
				return false;
			}
		}
		return true;
	}

	public void controle(String a) {
		if (a.length() == 1) {
			boolean found = false;
			for (int i = 0; i < word.length() && !found; i++) {
				if (this.word.charAt(i) == a.charAt(0)) {
					found = true;
				}
			}
			if (found) {
				vulInChar(a.charAt(0));
			} else {
				this.lifes--;
				wrong.add(a.charAt(0));
			}
		} else {
			if (a.equals(this.word.toString())) {
				vulInString(a);
			} else {
				this.lifes--;
			}
		}
	}

	public void vulInChar(char a) {
		for (int i = 0; i < word.length(); i++) {
			if (this.word.charAt(i) == a) {
				this.puntjeswoord.setCharAt(i, a);
			}
		}
	}

	public void vulInString(String a) {
		for (int i = 0; i < word.length(); i++) {
			this.puntjeswoord.setCharAt(i, a.charAt(i));
		}
	}

	public void print() {
		System.out.println("levens: " + lifes);
		System.out.println("woord: " + this.puntjeswoord);
		System.out.println("fout geraden: " + this.wrong);
	}
}
