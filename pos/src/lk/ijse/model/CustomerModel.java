/*---------------------------------------------------------------------------------------------
 *  Copyright (c) shamal iroshan. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package lk.ijse.model;

/**
 *
 * @author <shamaliroshan.online@gmail.com>shamal iroshan
 */
public class CustomerModel {
    private String Id;
    private String Name;
    private String Address;
    private double Salary;

    public CustomerModel() {
    }

    public CustomerModel(String Id, String Name, String Address, double Salary) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.Salary = Salary;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Salary
     */
    public double getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
   
}
