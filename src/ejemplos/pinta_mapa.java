package ejemplos;

public class pinta_mapa {
	public static void printMapa(String[][] mapa) {
		for (int i = 0; i < mapa.length; i++) {
			System.out.print('"');
			for (int j = 0; j < mapa[0].length; j++) {
				System.out.print(mapa[i][j]);
			}
			System.out.print('"' + ",");
			System.out.println();
		}
	}

	public static String[][] pinta_ruta(String[][] mapa, int i, int j, String camino_libre, String caracterRelleno) {
		// Caso base si estamos fuera de los limites del mapa, no se hace nada
		if (i < 0 || j < 0 || i >= mapa.length || j >= mapa[0].length) {
			return mapa;
		}

		// Caso base si la celda actual no es igual al caracter que estamos buscando, no
		// hacemos nada
		if (!mapa[i][j].equals(camino_libre)) {
			return mapa;
		}

		// Se marca la celda actual
		mapa[i][j] = caracterRelleno;

		int i_pos[] = { -1, 1, 0, 0 };
		int j_pos[] = { 0, 0, 1, -1 };

		// Recorre todas las direcciones, arriba, abajo, derecha, izquierda
		for (int k = 0; k < 4; k++) {
			int ii_new = i + i_pos[k];
			int jj_new = j + j_pos[k];

			pinta_ruta(mapa, ii_new, jj_new, camino_libre, caracterRelleno);
		}

		return mapa;
	}

	public static void main(String[] args) {
		String[][] mapa = {
				{ ".", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" },
				{ ".", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "#" },
				{ "#", ".", "#", ".", "#", ".", "#", "#", "#", ".", "#", ".", "#", "#", "#", ".", "#", ".", ".", "#" },
				{ "#", ".", "#", ".", ".", ".", ".", "#", ".", ".", ".", ".", "#", ".", ".", ".", "#", ".", ".", "#" },
				{ "#", "#", "#", "#", "#", "#", ".", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", ".", "#", "#" },
				{ "#", ".", ".", ".", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", ".", ".", "#", ".", ".", "#" },
				{ "#", "#", "#", "#", "#", "#", ".", "#", "#", "#", "#", "#", ".", "#", "#", "#", "#", ".", ".", "#" },
				{ "#", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", "#", ".", ".", ".", ".", ".", ".", ".", "#" },
				{ "#", "#", "#", ".", "#", "#", "#", "#", ".", ".", "#", "#", "#", "#", "#", "#", ".", "#", "#", "#" },
				{ "#", "#", "#", "#", "#", "#", "#", "E", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#" } };

		System.out.println("Mapa Original");
		printMapa(mapa);
		System.out.println();
		System.out.println("Mapa Pintado");
		String[][] mapa2 = pinta_ruta(mapa, 0, 0, ".", "R");
		printMapa(mapa2);
	}
}
