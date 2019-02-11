package abcd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class client {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	
		char ch;
		do {
			System.out.println("Enter Your choice\n" + "1: Add a Student\n" + "2: View all Students\n"
					+ "3: Add a Teacher\n" + "4: View all Teachers\n" + "5: Delete student\n" + "6: Delete teacher");
			int choice = scn.nextInt();
			if (choice == 1) {
			
				String content = new String(Files.readAllBytes(Paths.get("./src/abcd", "./students")));
				System.out.println("Enter name of the student");
				String name = scn.next();

				System.out.println("Enter email of the student");
				String email = scn.next();

				System.out.println("Enter age of the student");
				int age = scn.nextInt();

				System.out.println("Enter roll of the student");
				String roll = scn.next();

				System.out.println("Enter branch of the student(COE/IT/ME)");
				String branch = scn.next();

				System.out.println("Enter section of the student)");
				String section = scn.next();

				Student student = new Student(name, email, age, roll, branch, section);
				Files.write(Paths.get("./src/abcd", "students"),
					(content + student.toString() + "\n_______________________________\n").getBytes());
			}

			if (choice == 2) {
				String[] content = new String(Files.readAllBytes(Paths.get("./src/abcd", "students")))
						.split("_______________________________");
				for (String s : content) {
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					System.out.println(s);
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				}

			}

			if (choice == 3) {
				String content = new String(Files.readAllBytes(Paths.get("./src/abcd", "teachers")));
				System.out.println("Enter name of the teaher");
				String name = scn.next();

				System.out.println("Enter email of the teacher");
				String email = scn.next();

				System.out.println("Enter age of the teacher");
				int age = scn.nextInt();

				System.out.println("Enter department of the teacher");
				String department = scn.next();

				System.out.println("Enter subject of the teacher");
				String subject = scn.next();

				Teacher teacher = new Teacher(name, email, age, department, subject);
				Files.write(Paths.get("./src/abcd", "teachers"),
						(content + teacher.toString() + "\n_______________________________\n").getBytes());
			}

			if (choice == 4) {
				String[] content = new String(Files.readAllBytes(Paths.get("./src/abcd", "teachers")))
						.split("_______________________________");
				for (String t : content) {
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					System.out.println(t);
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				}
			}

			if (choice == 5) {
                System.out.println("Enter the name of the student you want to delete");
                String name = scn.next();
                String[] content = new String(Files.readAllBytes(Paths.get("./src/abcd", "students"))).split("_______________________________");
                Files.write(Paths.get("./src/abcd", "students"), "".getBytes());
                for (String s : content) {
                    int count = 0;
                    while( count!=s.length() && s.charAt(count)=='\n')
                        count++;
                    if(count==s.length()){
                        break;
                    }
                    if (s.substring(count + 7, count + 7 + name.length()).equals(name)) {
                        continue;
                    } else {
                        String prev = new String(Files.readAllBytes(Paths.get("./src/abcd", "students")));
                        Files.write(Paths.get("./src/abcd", "students"), (prev + s.toString() + "\n_______________________________\n").getBytes());
                    }
                }

            }
			
			if (choice == 6) {
                System.out.println("Enter the name of the teacher you want to delete");
                String name = scn.next();
                String[] content = new String(Files.readAllBytes(Paths.get("./src/abcd", "teachers"))).split("_______________________________");
                Files.write(Paths.get("./src/abcd", "teachers"), "".getBytes());
                for (String s : content) {
                    int count = 0;
                    while( count!=s.length() && s.charAt(count)=='\n')
                        count++;
                    if(count==s.length()){
                        break;
                    }
                    if (s.substring(count + 7, count + 7 + name.length()).equals(name)) {
                        continue;
                    } else {
                        String prev = new String(Files.readAllBytes(Paths.get("./src/abcd", "teachers")));
                        Files.write(Paths.get("./src/abcd", "teachers"), (prev + s.toString() + "\n_______________________________\n").getBytes());
                    }
                }

            }

			System.out.println("\n Do you want to continue ? Y / N");
			ch = scn.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}

}
