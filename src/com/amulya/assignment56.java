package com.amulya;
import javax.swing.*;
class program{
    String FirstName;
    String LastName;
    int hours;
    float services;
    float options;
    float items;

    int smallBoxes;
    int largeBoxes;
    char pack;
    double totalcost;

    program()
    {
        FirstName = "Amulya";
        LastName = "Baddam";
        hours = 24;
        pack = 'A';
        smallBoxes = 12;
        largeBoxes = 12;
    }
    program(String fName, String lName, int hoursTaken, char pack, int nlargeBoxes, int nsmallBoxes)
    {
        setFName(fName);
        setLName(lName);
        setHoursTaken(hoursTaken);
        setPack(pack);
        setSmallBoxes(nsmallBoxes);
        setLargeBoxes(nlargeBoxes);

    }
    public float getServicesCost()
    {
        if (pack == 'A')
            services = 100 * hours;
        if (pack == 'B')
            services = 150 * hours;
        return services;
    }
    public float getOptionsCost()
    {
        options = (8.0f + 20.11f) * hours/24;
        return options;
    }
    public float getItemsCost()
    {
        items = 2.50f * smallBoxes + 4.50f * largeBoxes;
        return items;
    }
    public double getTotalcost()
    {
        totalcost = getServicesCost() + getItemsCost() + getOptionsCost();
        return totalcost;
    }
    public void setHoursTaken(int hoursTaken) {
        this.hours = hoursTaken;
    }
    public void setFName(String fName) {
        this.FirstName = fName;
    }
    public void setLName(String lName){
        this.LastName = lName;
    }
    public void setSmallBoxes(int nsmallBoxes){
        this.smallBoxes = nsmallBoxes;
    }
    public void setLargeBoxes(int nlargeBoxes){
        this.largeBoxes = nlargeBoxes;
    }
    public void setPack(char pack){
        this.pack = pack;
    }
    public String getData()
    {
        String s = "Customer : "+FirstName+" " +LastName;
        s += "\nServices Cost : "+getServicesCost();
        s += "\nnOptions Cost : "+getOptionsCost();
        s += "\nItems Cost : "+getItemsCost();
        s += "\nTotal Cost : "+getTotalcost();

        return s;
    }

}


public class assignment56 {
    public static void main(String[] args) {
        String userName = "Will1234";
        String password = "Will1234";
        int tries = 0;
        String un = JOptionPane.showInputDialog("Enter Username: ");
        String pass = JOptionPane.showInputDialog("Enter Password:");
        while (!(un.equals(userName) && pass.equals(password)) && tries < 2) {
            tries++;
            JOptionPane.showMessageDialog(null, "Inncorrect Credentials!\nenter Again..");
            un = JOptionPane.showInputDialog("Enter  the userName:");
            pass = JOptionPane.showInputDialog("Enter the Password :");
        }
        if (tries >= 2) {
            JOptionPane.showMessageDialog(null, "You've exceeded your try's \nGood Bye!");
            System.exit(1);
        }
        try {
            String fName = JOptionPane.showInputDialog("Enter the Customers FirstName :");
            String lName = JOptionPane.showInputDialog("Enter the Customers LastName :");
            char pack = Character.toUpperCase(JOptionPane.showInputDialog("Enter the package selected (A or B): \n").charAt(0));
            if (pack != 'A' && pack != 'B')
                throw new Exception();
            int hoursTaken = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours taken :\n"));
            int nsmallBoxes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of small Boxes :\n"));
            int nlargeBoxes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of large Boxes :\n"));

            com.amulya.program p = new
                    com.amulya.program(fName, lName, hoursTaken, pack, nlargeBoxes, nsmallBoxes);
            JOptionPane.showMessageDialog(null, p.getData());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong input, Exiting...!");
            System.exit(1);
        }
    }
}


