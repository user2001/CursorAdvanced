package HW_1.Task1;

public class MainDepartment {
    public static void main(String[] args) {
        FireDepartment fireDepartment = new FireDepartment();
        Thread thread1 = new Thread(fireDepartment);
        thread1.setName("LivDepartment");
        Thread thread2 = new Thread(fireDepartment);
        thread2.setName("KyivDepartment");
        thread1.start();
        thread2.start();
    }
}
