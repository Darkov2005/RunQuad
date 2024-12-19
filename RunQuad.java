import java.util.Scanner;

// This is the base class
class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

// While this is the derived classes
class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 2 pairs of parallel sides");
    }
}

class Rectangle extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}

class Rhombus extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 congruent sides");
    }
}

class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 1 pair of parallel sides");
    }
}

// This is the main class
public class RunQuad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        System.out.print("Your choice: ");
        String choice = sc.nextLine().toUpperCase();
        
        switch (choice) {
            case "R":
                Rectangle r = new Rectangle();
                System.out.println("A rectangle:");
                r.showDescription();
                break;
            case "S":
                Square s = new Square();
                System.out.println("A square:");
                s.showDescription();
                break;
            case "P":
                Parallelogram p = new Parallelogram();
                System.out.println("A parallelogram:");
                p.showDescription();
                break;
            case "H":
                Rhombus h = new Rhombus();
                System.out.println("A rhombus:");
                h.showDescription();
                break;
            case "T":
                Trapezoid t = new Trapezoid();
                System.out.println("A trapezoid:");
                t.showDescription();
                break;
            default:
                System.out.println("Invalid choice! Please select R, S, P, H, or T.");
        }
    }
}
