import java.util.Scanner;

public class View {
	boolean play = true;
	Scanner sc;
	Galg galg;

	public View() {
		this.sc = new Scanner(System.in);
		while (play) {
			this.galg = new Galg();
			this.playGame(galg);
			this.play = this.playAgain();
		}
		System.out.println("Byebye");
	}

	public boolean playAgain() {
		System.out.println("Wil je nog een keer spelen? (j/n)");
		String a = sc.next();
		while (!(a.equals("j") || a.equals("n"))) {
			System.out.println("Error: geef een correcte invoer (j/n)");
			a = sc.next();
		}
		if (a.equals("j")) {
			return true;
		} else {
			return false;
		}
	}

	public void playGame(Galg galg) {
		while (!galg.geraden() && galg.lifes > 0) {
			galg.print();
			System.out.println("Geef een letter");
			galg.controle(sc.next());
		}
		if (galg.lifes != 0) {
			System.out.println("Gefeliciteerd, je hebt het woord geraden: "
					+ galg.word);
		} else {
			System.out.println("Jammer, het woord was: " + galg.word);
		}
	}
}
