package application;

import entities.Invoice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Invoice> list = new ArrayList<>();

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "How many items to register? "));


        try {
            double invoiceTotal = 0.00;
            for (int i = 1; i <= n; i++) {

                int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Item #" + i + "\n Enter item number: "));
                String name = JOptionPane.showInputDialog(null, "Item #" + i + "\n Enter item description: ");
                int amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Item #" + i + "\n Enter the amount: "));
                double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Item #" + i + "\n Enter price item"));

                Invoice invoice = new Invoice(number, name, amount, price);

                invoiceTotal += invoice.getInvoiceAmount();
                list.add(invoice);


            }
            for (Invoice i : list){
                JOptionPane.showMessageDialog(null, i);
            }
            JOptionPane.showMessageDialog(null,"Total Invoice: " + String.format("%.2f", invoiceTotal));


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }
}
