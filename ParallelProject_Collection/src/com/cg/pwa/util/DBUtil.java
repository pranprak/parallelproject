package com.cg.pwa.util;

import java.util.ArrayList;
import java.util.List;
import com.cg.pwa.bean.BankDetails;
import com.cg.pwa.bean.CustomerDetails;

public class DBUtil {
static List<CustomerDetails> list=new ArrayList<>();
static List<BankDetails> list1=new ArrayList<BankDetails>();
static CustomerDetails customer=new CustomerDetails("Pranay",22,"rajendra path","male","Patna");
static BankDetails banker=new BankDetails(231223,2000, customer);
static
{
	list.add(customer);
	list1.add(banker);
}

public static void createAccount(CustomerDetails cd)
{
	list.add(cd);
}

public static int getCustomerInfo(BankDetails bank)
{
	list1.add(bank);
	return bank.getAccNum();
}
public static List<BankDetails> getAllBankAccount()
{
	return list1;
}

}
