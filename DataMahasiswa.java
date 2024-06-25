import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class DataMahasiswa {
    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Lms-IMWI-CLONE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Membuat panel utama dengan layout BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Status user online
        JLabel userStatusLabel = new JLabel("Agus Sastrawan (Online)");
        userStatusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userStatusLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Membuat judul navigasi
        JLabel navigationLabel = new JLabel("Navigasi");
        navigationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        navigationLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Data untuk sidebar menu
        String[] menuItems = {"Course Section", "Participants", "Badges", "Competencies", "Grades"};
        JList<String> menuList = new JList<>(menuItems);

        // Membuat panel untuk sidebar dan menambahkannya ke sisi kiri (WEST)
        JPanel sidebarPanel = new JPanel(new BorderLayout());
        JPanel navigationPanel = new JPanel(new BorderLayout());
        navigationPanel.add(navigationLabel, BorderLayout.NORTH);
        navigationPanel.add(new JScrollPane(menuList), BorderLayout.CENTER);

        sidebarPanel.add(userStatusLabel, BorderLayout.NORTH);
        sidebarPanel.add(navigationPanel, BorderLayout.CENTER);
        sidebarPanel.setPreferredSize(new Dimension(200, 0)); // Lebar tetap untuk sidebar

        // Membuat judul untuk tabel mahasiswa
        JLabel tableTitleLabel = new JLabel("Data Mahasiswa");
        tableTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tableTitleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Data untuk tabel mahasiswa
        String[] columnNames = {"ID", "Nama", "Jurusan", "Semester"};
        Object[][] studentData = {
            {"1", "Agnes Monica", "Sistem Informasi", "6"},
            {"2", "Cakra Khan", "Manajemen Bisnis", "4"},
            {"3", "Angelina Jolie", "Sistem Informasi", "2"},
            {"4", "Dewi Persik", "Sistem Informasi", "8"},
            {"5", "Dedy Corbouser", "Manajemen Bisnis", "6"}
        };

        // Membuat tabel untuk data mahasiswa
        DefaultTableModel model = new DefaultTableModel(studentData, columnNames);
        JTable studentTable = new JTable(model);
        JScrollPane tableScrollPane = new JScrollPane(studentTable);

        // Mengatur warna latar belakang header tabel
        JTableHeader tableHeader = studentTable.getTableHeader();
        tableHeader.setBackground(Color.GREEN);
        tableHeader.setForeground(Color.BLACK);
        tableHeader.setFont(new Font("Arial", Font.BOLD, 12));

        // Mengatur renderer untuk header tabel
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) studentTable.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Membuat panel untuk judul dan tabel
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.add(tableTitleLabel, BorderLayout.NORTH);
        tablePanel.add(tableScrollPane, BorderLayout.CENTER);

        // Menambahkan sidebarPanel ke sisi kiri dan tablePanel ke bagian tengah
        mainPanel.add(sidebarPanel, BorderLayout.WEST);
        mainPanel.add(tablePanel, BorderLayout.CENTER);

        // Menambahkan panel utama ke frame
        frame.add(mainPanel);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
