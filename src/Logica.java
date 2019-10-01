import javax.swing.JOptionPane;
public class Logica {

	private char[][] tablero = new char[8][8];
	private int contador = 0;
	boolean negra=false;
	boolean blanca=false;
	public void iniciar() {
		tablero[3][3] = 'b';
		tablero[4][4] = 'b';
		tablero[3][4] = 'n';
		tablero[4][3] = 'n';

	}

	public void llenar1() {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				tablero[i][j] = '.';
			}
		}
	}

	public void mostrar() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

	public void captura() {
		int x, y;
		if (contador < 60) {
			do {
			x = Integer.parseInt(JOptionPane.showInputDialog("Ingresar x"));
			y = Integer.parseInt(JOptionPane.showInputDialog("Ingresar y"));
			}while(x<8 != x>=0 != y<8 != y>=0);
			if ((x<8)&& (y<8) && tablero[x][y] == '.') {
				
				Switch_blanca(x, y);
				tablero[x][y] = 'b';
				blanca=true;
			} else {
				System.out.print("No ingreso unas coordenadas correctas");

			}
		} else {
			System.out.print("Fin del juego");
		}
	}
	public void captura2() {
		int x, y;
		
		if (contador < 60) {
			do {
			x = Integer.parseInt(JOptionPane.showInputDialog("Ingresar x"));
			y = Integer.parseInt(JOptionPane.showInputDialog("Ingresar y"));
			}while(x<8 != x>=0 != y<8 != y>=0);
			if ((x<8)&& (y<8) && tablero[x][y] == '.') {
				Switch_negra(x, y);
				tablero[x][y] = 'n';
				negra=true;
			} else {
				System.out.print("No ingreso unas coordenadas correctas");
       
			}
		} else {
			System.out.print("Fin del juego");
		}
	}

	public void validar(int x, int y, int contador) {

		if ((contador % 2) == 0) {
			for (int i = (x + 1); i < 8; i++) {// revisar el alrededor de la casilla
				for (int j = (y + 1); j < 8; j++) {// el color diferente al que esta jugando
					if (tablero[i][j] != 'b') {
						BuscaBlancas(i, j, x, y);
					}
				}
			}

		} else {
			for (int i = (x + 1); i < 8; i++) {// revisar el alrededor de la casilla
				for (int j = (y + 1); j < 8; j++) {// el color diferente al que esta jugando
					if (tablero[i][j] == 'n') {
						BuscaNegras(i, j, x, y, tablero);
					}
				}
			}

		}

	}

	public void BuscaBlancas(int a, int b, int x, int y) {
		if (tablero[a][b] == 'b') {
			int w = a;
			int z = b;
			while (tablero[w][z] == 'b') {
				w = w + (a - x);
				z = z + (b - y);

			}
		}
	}

	public void BuscaNegras(int a, int b, int x, int y, char tablero[][]) {
		if (tablero[a][b] == 'n') {
			int w = a;
			int z = b;
			while (tablero[w][z] == 'n') {
				w = w + (a - x);
				z = z + (b - y);
			}
		}
	}


	public char[][] getTablero() {
		return tablero;
	}

	public void setTablero(char[][] c) {
		this.tablero = c;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	public void Switch_negra(int a, int b){

		if(negra==true) {
			if (a +1 < 8) {
				for (int i = 0; i < 6;i++) { // abajo
					if((getTablero()[a + 1][b] == 'b') && (getTablero()[a + 2][b] =='n')){
						getTablero()[a + 1][b] = 'n';
						
						a++;
					}
					
				}
			}
			if (a - 1 < 8) {
				for (int i = getTablero().length; i == 0; i--) { // arriba
					while ((getTablero()[a - 1][b] == 'b') & (getTablero()[a - 2][b] == 'n')) {
						getTablero()[a - 1][b] = 'n';
					}

				}
			}
			if (b + 1 < 8) { // derecha
				for (int i = 0; b < 6; b++) {
					while ((getTablero()[a][b + 1] == 'b') & (getTablero()[a][b + 2] == 'n')) {
						getTablero()[a][b + 1] = 'n';
					}

				}
			}
			if (b - 1 < 8) { // izquierda
				for (int i = getTablero().length; b == 0; b--) {
					while ((getTablero()[a][b - 1] == 'b') & (getTablero()[a][b - 2] == 'n')) {
						getTablero()[a][b - 1] = 'n';
					}

				}
			}
			if (a + 1 < 8 & b + 1 < 8) { // diagonal inferior derecha
				for (int i = 0; i < 6; i++) {
					for (b = 0; b < 8; b++) {
						while ((getTablero()[a + 1][b + 1] == 'b') & (getTablero()[a + 2][b + 2] == 'n')) {
							getTablero()[a + 1][b + 1] = 'n';
						}
					}
				}
			}
			if (a + 1 < 8 & b - 1 < 8) { // diagonal inferior izquierda
				for (int i = 0; i < 6; i++) {
					for (b = getTablero().length; b <= 0; b--) {
						while ((getTablero()[a + 1][b - 1] == 'b') & (getTablero()[a + 2][b - 2] == 'n')) {
							getTablero()[a + 1][b - 1] = 'n';
						}
					}

				}
			}
			if (a - 1 < 1 & b - 1 < 1) { // diagonal superior izquierda
				for (int i = getTablero().length; i == 0; i--) {
					for (b = getTablero().length; b ==0; b--) {
						while ((getTablero()[a - 1][b - 1] == 'b') & (getTablero()[a - 2][b - 2] == 'n')) {
							getTablero()[a - 1][b - 1] = 'n';
						}
					}
				}
			}
			if (a - 1 < 1 & b + 1 < 8) { // diagonal superior derecha
				for (int i =getTablero().length; i == 0; i--) {
					for (b = 0; b < 6; b++) {
						while ((getTablero()[a - 1][b + 1] == 'b') & (getTablero()[a - 2][b + 2] == 'n')) {
							getTablero()[a - 1][b + 1] = 'n';
						}
					}

				}
			}
		}
		}
	public void Switch_blanca(int a, int b) {
		if(blanca==true) {
			if (a < 8) {
				for (int i = 0; i < 6; i++) { // abajo
					while ((getTablero()[a + 1][b] == 'n') & (getTablero()[a + 2][b] == 'b')) {
						getTablero()[a + 1][b] = 'b';
					}

				}
			}
			if (a - 1 < 8) {
				for (int i = getTablero().length; i ==0; i--) { // arriba
					while ((getTablero()[a - 1][b] == 'n') & (getTablero()[a - 2][b] == 'b')) {
						getTablero()[a - 1][b] = 'b';
					}

				}
			}
			if (b + 1 < 8) { // derecha
				for (int j = 0; j < 6; j++) {
					while ((getTablero()[a][b + 1] == 'n') & (getTablero()[a][b + 2] == 'b')) {
						getTablero()[a][b + 1] = 'b';
					}

				}
			}
			if (b - 1 < 8) { // izquierda
				for (int j = getTablero().length; j ==0; j--) {
					while ((getTablero()[a][b - 1] == 'n') & (getTablero()[a][b - 2] == 'b')) {
						getTablero()[a][b - 1] = 'b';
					}

				}
			}
			if (a + 1 < 8 & b + 1 < 8) { // diagonal inferior derecha
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 6; j++) {
						while ((getTablero()[a + 1][b + 1] == 'n') & (getTablero()[a + 2][b + 2] == 'b')) {
							getTablero()[a + 1][b + 1] = 'b';
						}
					}
				}
			}
			if (a + 1 < 8 & b - 1 < 8) { // diagonal inferior izquierda
				for (int i = 0; i < 6; i++) {
					for (int j = getTablero().length; j ==0; j--) {
						while ((getTablero()[a + 1][b - 1] == 'n') & (getTablero()[a + 2][b - 2] == 'b')) {
							getTablero()[a + 1][b - 1] = 'b';
						}
					}

				}
			}
			if (a - 1 < 1 & b - 1 < 1) { // diagonal superior izquierda
				for (int i = getTablero().length; i ==0; i--) {
					for (int j = getTablero().length; j ==0; j--) {
						while ((getTablero()[a - 1][b - 1] == 'n') & (getTablero()[a - 2][b - 2] == 'b')) {
							getTablero()[a - 1][b - 1] = 'b';
						}
					}
				}
			}
			if (a - 1 < 1 & b + 1 < 8) { // diagonal superior derecha
				for (int i = getTablero().length; i ==0; i--) {
					for (int j = 0; j < 6; j++) {
						while ((getTablero()[a - 1][b + 1] == 'n') & (getTablero()[a - 2][b + 2] == 'b')) {
							getTablero()[a - 1][b + 1] = 'b';
						}
					}

				}
			}
		}
	

}
}
