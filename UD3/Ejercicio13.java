package actividadesUD3;

public class Ejercicio13 {

	public static void main(String[] args) {
		System.out.println("========= EXPRESIÓN 1 =========");
        System.out.println("Expresión: 10 + 5 * 2 > 20 && 4 == 4");

        // Evaluación
        boolean r1 = 10 + 5 * 2 > 20 && 4 == 4;

        System.out.println("Resultado: " + r1);
        System.out.println("Explicación:");
        System.out.println("1) 5 * 2 = 10 (multiplicación tiene prioridad)");
        System.out.println("2) 10 + 10 = 20 (suma)");
        System.out.println("3) 20 > 20 = false (comparación)");
        System.out.println("4) 4 == 4 = true");
        System.out.println("5) false && true = false");



        System.out.println("\n========= EXPRESIÓN 2 =========");
        System.out.println("Expresión: !(7 + 3 > 10) || 3 * 2 <= 6");

        boolean r2 = !(7 + 3 > 10) || 3 * 2 <= 6;

        System.out.println("Resultado: " + r2);
        System.out.println("Explicación:");
        System.out.println("1) 7 + 3 = 10");
        System.out.println("2) 10 > 10 = false");
        System.out.println("3) !(false) = true (negación tiene prioridad)");
        System.out.println("4) 3 * 2 = 6");
        System.out.println("5) 6 <= 6 = true");
        System.out.println("6) true || true = true");



        System.out.println("\n========= EXPRESIÓN 3 =========");
        System.out.println("Expresión: 10 / 2 + 3 * 5 == 19 && true");

        boolean r3 = 10 / 2 + 3 * 5 == 19 && true;

        System.out.println("Resultado: " + r3);
        System.out.println("Explicación:");
        System.out.println("1) 10 / 2 = 5 (división)");
        System.out.println("2) 3 * 5 = 15 (multiplicación)");
        System.out.println("3) 5 + 15 = 20 (suma)");
        System.out.println("4) 20 == 19 = false");
        System.out.println("5) false && true = false");



        System.out.println("\n========= EXPRESIÓN 4 =========");
        System.out.println("Expresión: int x = 5; x += 3 * 2;");

        int x = 5;
        x += 3 * 2;

        System.out.println("Resultado final de x: " + x);
        System.out.println("Explicación:");
        System.out.println("1) 3 * 2 = 6");
        System.out.println("2) x += 6 → x = 5 + 6 = 11");



        System.out.println("\n========= EXPRESIÓN 5 =========");
        System.out.println("Expresión: boolean b = false; b = !b || 7 % 2 == 1;");

        boolean b = false;
        b = !b || 7 % 2 == 1;

        System.out.println("Resultado final de b: " + b);
        System.out.println("Explicación:");
        System.out.println("1) !b → !false = true");
        System.out.println("2) 7 % 2 = 1");
        System.out.println("3) 1 == 1 = true");
        System.out.println("4) true || true = true");
    }
}
