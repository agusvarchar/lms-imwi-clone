import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DataMahasiswaApp {
    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Aplikasi Data Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        // Membuat panel utama dengan layout BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Status user online
        JLabel userStatusLabel = new JLabel("User: John Doe (Online)");
        userStatusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userStatusLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Data untuk sidebar menu
        String[] menuItems = {"Course Section", "Participants", "Badges", "Competencies", "Grades"};
        JList<String> menuList = new JList<>(menuItems);
        
        // Membuat panel untuk sidebar dan menambahkannya ke sisi kiri (WEST)
        JPanel sidebarPanel = new JPanel(new BorderLayout());
        sidebarPanel.add(userStatusLabel, BorderLayout.NORTH);
        sidebarPanel.add(new JScrollPane(menuList), BorderLayout.CENTER);
        sidebarPanel.setPreferredSize(new Dimension(200, 0)); // Lebar tetap untuk sidebar
        
        // Data untuk tabel mahasiswa
        String[] columnNames = {"ID", "Nama", "Jurusan", "Semester"};
        Object[][] studentData = {
            {"1", "Andi", "Informatika", "6"},
            {"2", "Budi", "Matematika", "4"},
            {"3", "Citra", "Fisika", "2"},
            {"4", "Dewi", "Kimia", "8"},
            {"5", "Eko", "Biologi", "6"}
        };
        
        // Membuat tabel untuk data mahasiswa
        JTable studentTable = new JTable(new DefaultTableModel(studentData, columnNames));
        JScrollPane tableScrollPane = new JScrollPane(studentTable);
        
        // Menambahkan sidebarPanel ke sisi kiri dan tableScrollPane ke bagian tengah
        mainPanel.add(sidebarPanel, BorderLayout.WEST);
        mainPanel.add(tableScrollPane, BorderLayout.CENTER);
        
        // Menambahkan panel utama ke frame
        frame.add(mainPanel);
        
        // Menampilkan frame
        frame.setVisible(true);
    }
}
