import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Employee merepresentasikan seorang karyawan dengan atribut nama, umur, dan departemen.
 */
class Employee {
    String name;
    int age;
    String department;

    /**
     * Konstruktor untuk membuat objek Employee baru.
     *
     * @param name       Nama karyawan
     * @param age        Umur karyawan
     * @param department Departemen tempat karyawan bekerja
     */
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    /**
     * Mengembalikan representasi String dari objek Employee.
     *
     * @return String yang merepresentasikan objek Employee
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Department: " + department;
    }
}

/**
 * Kelas EmployeeManager digunakan untuk mengelola daftar karyawan, termasuk menambah, menghapus,
 * dan menampilkan karyawan.
 */
class EmployeeManager {
    private List<Employee> employees;

    /**
     * Konstruktor untuk membuat objek EmployeeManager dengan inisialisasi daftar karyawan kosong.
     */
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Menambahkan karyawan baru ke dalam daftar karyawan.
     *
     * @param name       Nama karyawan
     * @param age        Umur karyawan
     * @param department Departemen tempat karyawan bekerja
     */
    public void addEmployee(String name, int age, String department) {
        employees.add(new Employee(name, age, department));
    }

    /**
     * Menghapus karyawan dari daftar berdasarkan nama.
     *
     * @param name Nama karyawan yang ingin dihapus dari daftar
     */
    public void removeEmployee(String name) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).name.equals(name)) {
                employees.remove(i);
                break;
            }
        }
    }

    /**
     * Menampilkan daftar karyawan yang ada dalam sistem ke output.
     */
    public void displayEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

}
public class Main {

    /**
     * Metode utama untuk menjalankan contoh penggunaan EmployeeManager.
     *
     * @param args Argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John", 30, "IT");
        manager.addEmployee("Jane", 25, "HR");
        manager.displayEmployees();
        manager.removeEmployee("John");
        manager.displayEmployees();
    }
}
