package ReflectionAnnotation.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Scanner scan = new Scanner(System.in);
		RichSoilLand land = new RichSoilLand();
		Field[] fields = land.getClass().getDeclaredFields();

		String type = scan.nextLine();

		while (!type.equals("HARVEST")) {
			if (!type.equals("all")) {
				for (Field f : fields) {
					if (Modifier.toString(f.getModifiers()).equals(type)) {
						System.out.println(type + " " + f.getType().getSimpleName() + " " + f.getName());
					}
				}
			} else {
				for (Field f : fields) {

					System.out.println(Modifier.toString(f.getModifiers()) + " " + f.getType().getSimpleName() + " " + f.getName());

				}

			}

			type = scan.nextLine();


		}
	}
}
