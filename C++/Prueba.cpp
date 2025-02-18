#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// a) Estructura para guardar la información de los partidos
typedef struct {
	char *equipo1;
	char *equipo2;
	char resultado[5]; // Formato: "2-1"
	char fecha[11];    // Formato: "YYYY-MM-DD"
} Partido;

// b) Función para crear un partido (reserva dinámica de memoria)
Partido* crear_partido(const char *equipo1, const char *equipo2, const char *resultado, const char *fecha) {
	Partido *partido = (Partido*)malloc(sizeof(Partido));
	partido->equipo1 = (char*)malloc(strlen(equipo1) + 1);
	partido->equipo2 = (char*)malloc(strlen(equipo2) + 1);
	strcpy(partido->equipo1, equipo1);
	strcpy(partido->equipo2, equipo2);
	strncpy(partido->resultado, resultado, sizeof(partido->resultado) - 1);
	strncpy(partido->fecha, fecha, sizeof(partido->fecha) - 1);
	return partido;
}

// c) Función para mostrar los partidos por pantalla
void mostrar_partidos(Partido *partidos[], int num_partidos) {
	for (int i = 0; i < num_partidos; i++) {
		printf("Partido %d:\n", i + 1);
		printf("  Equipo 1: %s\n", partidos[i]->equipo1);
		printf("  Equipo 2: %s\n", partidos[i]->equipo2);
		printf("  Resultado: %s\n", partidos[i]->resultado);
		printf("  Fecha: %s\n", partidos[i]->fecha);
		printf("\n");
	}
}

// d) Función que recibe un partido y devuelve 1, X, 2
char predecir_resultado(const Partido *partido) {
	int goles1 = atoi(&partido->resultado[0]);
	int goles2 = atoi(&partido->resultado[2]);

	if (goles1 > goles2) return '1';
	else if (goles1 < goles2) return '2';
	else return 'X';
}

// e) Liberar memoria dinámica
void liberar_partido(Partido *partido) {
	free(partido->equipo1);
	free(partido->equipo2);
	free(partido);
}

int main() {
	int num_partidos;
	printf("Cuantos partidos deseas ingresar? ");
	scanf("%d", &num_partidos);
	getchar(); // Limpiar el buffer del salto de línea

	Partido *partidos[num_partidos];

	// Ingresar los datos de los partidos
	for (int i = 0; i < num_partidos; i++) {
		char equipo1[100], equipo2[100], resultado[5], fecha[11];

		printf("\nIngrese los datos del partido %d:\n", i + 1);
		printf("  Nombre del equipo 1: ");
		fgets(equipo1, sizeof(equipo1), stdin);
		equipo1[strcspn(equipo1, "\n")] = '\0'; // Eliminar el salto de línea

		printf("  Nombre del equipo 2: ");
		fgets(equipo2, sizeof(equipo2), stdin);
		equipo2[strcspn(equipo2, "\n")] = '\0'; // Eliminar el salto de línea

		printf("  Resultado (formato '2-1'): ");
		fgets(resultado, sizeof(resultado), stdin);
		resultado[strcspn(resultado, "\n")] = '\0'; // Eliminar el salto de línea

		printf("  Fecha (formato 'YYYY-MM-DD'): ");
		fgets(fecha, sizeof(fecha), stdin);
		fecha[strcspn(fecha, "\n")] = '\0'; // Eliminar el salto de línea

		// Crear el partido con los datos ingresados
		partidos[i] = crear_partido(equipo1, equipo2, resultado, fecha);
	}

	// c) Mostrar los partidos por pantalla
	printf("\n--- Informacion de los partidos ---\n");
	mostrar_partidos(partidos, num_partidos);

	// d) Predecir resultados
	printf("\n--- Predicciones de los partidos ---\n");
	for (int i = 0; i < num_partidos; i++) {
		char resultado = predecir_resultado(partidos[i]);
		printf("Prediccion del partido %d (%s vs %s): %c\n", i + 1, partidos[i]->equipo1, partidos[i]->equipo2, resultado);
	}

	// e) Liberar memoria dinámica
	for (int i = 0; i < num_partidos; i++) {
		liberar_partido(partidos[i]);
	}

	return 0;
}