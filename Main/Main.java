package tp.p1.Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		if((args.length>1)||(args.length<3)) {
			LEVEL level;
			int seed;
			Scanner scanner=new Scanner(System.in);

			if(args[0].equals("EASY")) {
				level=LEVEL.EASY;
			}
			else if(args[0].equals("HARD")) {
				level=LEVEL.HARD;
			}
			else if(args[0].equals("INSANE")) {
				level=LEVEL.INSANE;
			}

			seed=Integer.parseInt(args[1]);

			Game game = new Game(level,seed);
			Controller controller = new Controller(game,scanner);
			controller.run();
		}	
	}

	}

}
