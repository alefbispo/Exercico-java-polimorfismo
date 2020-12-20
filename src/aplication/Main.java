package aplication;

import aplication.entites.ImportedProduct;
import aplication.entites.Product;
import aplication.entites.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scan.next().charAt(0);
            scan.nextLine();

            System.out.print("Name: ");
            String name = scan.nextLine();

            System.out.print("Price: ");
            double price = scan.nextDouble();

            if (ch == 'c'){

                Product product = new Product(name,price);
                list.add(product);

            }else if (ch == 'u'){

                System.out.print("Manufacture date (DD/MM/YYYY): : ");
                Date date = sdf.parse(scan.next());

                Product product = new UsedProduct(name,price,date);
                list.add(product);
            }else {

                System.out.print("Customs free: ");
                double custom = scan.nextDouble();

                Product product = new ImportedProduct(name, price, custom);
                list.add(product);
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product x : list) {
            System.out.println(x.priceTag());
        }
        scan.close();
    }
}
