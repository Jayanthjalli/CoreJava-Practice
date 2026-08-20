package com.DSAPrograms;
import java.sql.*;
import java.util.Scanner;

public class MoneyTransfer {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/checked";
        String username = "root";
        String password = "root";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sender account ID: ");
        int fromAccount = sc.nextInt();

        System.out.print("Enter receiver account ID: ");
        int toAccount = sc.nextInt();

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        try {
            // Establish database connection
            Connection con = DriverManager.getConnection(
                    url, username, password);

            // Call stored procedure
            CallableStatement cstmt =
                    con.prepareCall("{call transfer_money(?, ?, ?)}");

            // Set procedure parameters
            cstmt.setInt(1, fromAccount);
            cstmt.setInt(2, toAccount);
            cstmt.setDouble(3, amount);

            // Execute procedure
            cstmt.execute();

            System.out.println("Money transferred successfully.");

            cstmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }

        sc.close();
    }
}
/*
use checked;
CREATE TABLE account ( account_id INT PRIMARY KEY, account_holder VARCHAR(100), balance DECIMAL(10,2) );
select * from account;
call transfer_money(12345,54321,2000);
insert into account values(122,54321,1000);


CREATE DEFINER=`root`@`localhost` PROCEDURE `transfer_money`( IN from_account INT, IN to_account INT, IN amount DECIMAL(10,2) )
BEGIN DECLARE sender_balance DECIMAL(10,2); 
-- Get sender's balance 
SELECT balance INTO sender_balance FROM account WHERE account_id = from_account; 
-- Check sufficient balance
 IF sender_balance < amount THEN SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insufficient balance';
 ELSE 
 UPDATE account SET balance = balance - amount WHERE account_id = from_account; 
UPDATE account SET balance = balance + amount WHERE account_id = to_account; 
END IF; 
END
*/