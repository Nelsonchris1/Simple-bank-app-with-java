/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerAcctpack.Model;

/**
 *
 * @author User
 */
public class Transaction {
    private int AcctNo;
      private double amount;
    private String amountInwords;
    private String TransType;
    
    public Transaction(){}

    /**
     * @return the AcctNo
     */
    public int getAcctNo() {
        return AcctNo;
    }

    /**
     * @param AcctNo the AcctNo to set
     */
    public void setAcctNo(int AcctNo) {
        this.AcctNo = AcctNo;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the amountInwords
     */
    public String getAmountInwords() {
        return amountInwords;
    }

    /**
     * @param amountInwords the amountInwords to set
     */
    public void setAmountInwords(String amountInwords) {
        this.amountInwords = amountInwords;
    }

    /**
     * @return the TransType
     */
    public String getTransType() {
        return TransType;
    }

    /**
     * @param TransType the TransType to set
     */
    public void setTransType(String TransType) {
        this.TransType = TransType;
    }
    
    
}
