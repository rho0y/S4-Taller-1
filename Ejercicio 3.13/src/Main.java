import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();

        int opc;
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1. Agregar empleado y sueldo");
            System.out.println("2. Agregar aumento");
            System.out.println("3. Mostrar datos empleados");
            System.out.println("4. Salir");
            System.out.print(">> ");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:"));
            switch (opc) {
                case 1:
                    System.out.println("Seleccione el empleado para agregar: ");
                    System.out.println("1. Empleado 1");
                    System.out.println("2. Empleado 2");
                    System.out.print(">> ");
                    int opc2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el empleado para agregar:\n1. Empleado 1\n2. Empleado 2"));
                    if (opc2 == 1) {
                        String nm1 = JOptionPane.showInputDialog("Ingrese el primer nombre del empleado " + opc2 + ":");
                        String ap1 = JOptionPane.showInputDialog("Ingrese el primer apellido de " + nm1 + ":");
                        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo de " + nm1 + " " + ap1 + ":"));
                        emp1.setPrimerN(nm1);
                        emp1.setApellidoP(ap1);
                        emp1.setSalario(salario1);
                        emp1.imprimirDatos();
                    } else if (opc2 == 2) {
                        String nm2 = JOptionPane.showInputDialog("Ingrese el primer nombre del empleado " + opc2 + ":");
                        String ap2 = JOptionPane.showInputDialog("Ingrese el primer apellido de " + nm2 + ":");
                        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo de " + nm2 + " " + ap2 + ":"));
                        emp2.setPrimerN(nm2);
                        emp2.setApellidoP(ap2);
                        emp2.setSalario(salario2);
                        emp2.imprimirDatos();
                    } else {
                        System.out.println("Valor incorrecto");
                    }
                    break;
                case 2:
                    System.out.println("Seleccione el empleado para agregar aumento del 10%: ");
                    System.out.println("1. Empleado 1");
                    System.out.println("2. Empleado 2");
                    int opc3 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el empleado para agregar aumento del 10%:\n1. Empleado 1\n2. Empleado 2"));
                    if (opc3 == 1) {
                        emp1.aumento();
                    } else if (opc3 == 2) {
                        emp2.aumento();
                    }
                    break;
                case 3:
                    emp1.imprimirDatos();
                    emp2.imprimirDatos();
            }
        } while(opc != 4);

    }
}
