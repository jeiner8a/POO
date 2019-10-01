public class Fichas {
	Logica objLogica= new Logica();
	int i=0, j=0;
	public void Switch_negra(){

		if(objLogica.negra==true) {
			if (i + 1 < 8) {
				for (i = 0; i < 8;i++) { // abajo
					while ((objLogica.getTablero()[i + 1][j] == 'b') & (objLogica.getTablero()[i + 2][j] == 'n')) {
						objLogica.getTablero()[i + 1][j] = 'n';
					}

				}
			}
			if (i - 1 < 8) {
				for (i = objLogica.getTablero().length; i <= 0; i--) { // arriba
					while ((objLogica.getTablero()[i - 1][j] == 'b') & (objLogica.getTablero()[i - 2][j] == 'n')) {
						objLogica.getTablero()[i - 1][j] = 'n';
					}

				}
			}
			if (j + 1 < 8) { // derecha
				for (j = 0; j < 8; j++) {
					while ((objLogica.getTablero()[i][j + 1] == 'b') & (objLogica.getTablero()[i][j + 2] == 'n')) {
						objLogica.getTablero()[i][j + 1] = 'n';
					}

				}
			}
			if (j - 1 < 8) { // izquierda
				for (j = objLogica.getTablero().length; j <= 0; j--) {
					while ((objLogica.getTablero()[i][j - 1] == 'b') & (objLogica.getTablero()[i][j - 2] == 'n')) {
						objLogica.getTablero()[i][j - 1] = 'n';
					}

				}
			}
			if (i + 1 < 8 & j + 1 < 8) { // diagonal inferior derecha
				for (i = 0; i < 8; i++) {
					for (j = 0; j < 8; j++) {
						while ((objLogica.getTablero()[i + 1][j + 1] == 'b') & (objLogica.getTablero()[i + 2][j + 2] == 'n')) {
							objLogica.getTablero()[i + 1][j + 1] = 'n';
						}
					}
				}
			}
			if (i + 1 < 8 & j - 1 < 8) { // diagonal inferior izquierda
				for (i = 0; i < 8; i++) {
					for (j = objLogica.getTablero().length; j <= 0; j--) {
						while ((objLogica.getTablero()[i + 1][j - 1] == 'b') & (objLogica.getTablero()[i + 2][j - 2] == 'n')) {
							objLogica.getTablero()[i + 1][j - 1] = 'n';
						}
					}

				}
			}
			if (i - 1 < 1 & j - 1 < 1) { // diagonal superior izquierda
				for (i = objLogica.getTablero().length; i <= 0; i--) {
					for (j = objLogica.getTablero().length; j <=0; j--) {
						while ((objLogica.getTablero()[i - 1][j - 1] == 'b') & (objLogica.getTablero()[i - 2][j - 2] == 'n')) {
							objLogica.getTablero()[i - 1][j - 1] = 'n';
						}
					}
				}
			}
			if (i - 1 < 1 & j + 1 < 8) { // diagonal superior derecha
				for (i =objLogica.getTablero().length; i <= 0; i--) {
					for (j = 0; j < 8; j++) {
						while ((objLogica.getTablero()[i - 1][j + 1] == 'b') & (objLogica.getTablero()[i - 2][j + 2] == 'n')) {
							objLogica.getTablero()[i - 1][j + 1] = 'n';
						}
					}

				}
			}
		}
		}
	public void Switch_blanca() {
		if(objLogica.blanca==true) {
			if (i + 1 < 8) {
				for (i = 0; i < 8; i++) { // abajo
					while ((objLogica.getTablero()[i + 1][j] == 'n') & (objLogica.getTablero()[i + 2][j] == 'b')) {
						objLogica.getTablero()[i + 1][j] = 'b';
					}

				}
			}
			if (i - 1 < 8) {
				for (i = objLogica.getTablero().length; i <=0; i--) { // arriba
					while ((objLogica.getTablero()[i - 1][j] == 'n') & (objLogica.getTablero()[i - 2][j] == 'b')) {
						objLogica.getTablero()[i - 1][j] = 'b';
					}

				}
			}
			if (j + 1 < 8) { // derecha
				for (j = 0; j < 8; j++) {
					while ((objLogica.getTablero()[i][j + 1] == 'n') & (objLogica.getTablero()[i][j + 2] == 'b')) {
						objLogica.getTablero()[i][j + 1] = 'b';
					}

				}
			}
			if (j - 1 < 8) { // izquierda
				for (j = objLogica.getTablero().length; j <=0; j--) {
					while ((objLogica.getTablero()[i][j - 1] == 'n') & (objLogica.getTablero()[i][j - 2] == 'b')) {
						objLogica.getTablero()[i][j - 1] = 'b';
					}

				}
			}
			if (i + 1 < 8 & j + 1 < 8) { // diagonal inferior derecha
				for (i = 0; i < 8; i++) {
					for (j = 0; j < 8; j++) {
						while ((objLogica.getTablero()[i + 1][j + 1] == 'n') & (objLogica.getTablero()[i + 2][j + 2] == 'b')) {
							objLogica.getTablero()[i + 1][j + 1] = 'b';
						}
					}
				}
			}
			if (i + 1 < 8 & j - 1 < 8) { // diagonal inferior izquierda
				for (i = 0; i < 8; i++) {
					for (j = objLogica.getTablero().length; j <=0; j--) {
						while ((objLogica.getTablero()[i + 1][j - 1] == 'n') & (objLogica.getTablero()[i + 2][j - 2] == 'b')) {
							objLogica.getTablero()[i + 1][j - 1] = 'b';
						}
					}

				}
			}
			if (i - 1 < 1 & j - 1 < 1) { // diagonal superior izquierda
				for (i = objLogica.getTablero().length; i <=0; i--) {
					for (j = objLogica.getTablero().length; j <=0; j--) {
						while ((objLogica.getTablero()[i - 1][j - 1] == 'n') & (objLogica.getTablero()[i - 2][j - 2] == 'b')) {
							objLogica.getTablero()[i - 1][j - 1] = 'b';
						}
					}
				}
			}
			if (i - 1 < 1 & j + 1 < 8) { // diagonal superior derecha
				for (i = objLogica.getTablero().length; i <=0; i--) {
					for (j = 0; j < 8; j++) {
						while ((objLogica.getTablero()[i - 1][j + 1] == 'n') & (objLogica.getTablero()[i - 2][j + 2] == 'b')) {
							objLogica.getTablero()[i - 1][j + 1] = 'b';
						}
					}

				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
