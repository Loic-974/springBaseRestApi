package com.baseRestApi.springjwt.models.unitTest;



import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.baseRestApi.springjwt.models.ERole;
import com.baseRestApi.springjwt.models.Role;
import com.baseRestApi.springjwt.models.User;


@SpringBootTest
public class UserModelTest {
	
	
	User utilisateur;
		
			@Test
	       public static void main(String[] args){
		   UserModelTest tester = new UserModelTest();
		      tester.setUp();
		      System.out.println(tester.testMarketValue()?"pass":"fail");
		   }
	       
	       
	       public void setUp(){
	    	      //Create a portfolio object which is to be tested		
	    	     utilisateur = new User("toto", "toto@gmail.com", "azerty");		
	    	  
	    	      //Create the mock object of stock service
	    	      Role roleMock = mock(Role.class);		
	    	  
	    	      Set<Role> roleSet = new HashSet<Role>();
	    	      roleMock.setName(ERole.ROLE_MODERATOR);
	    	      roleSet.add(roleMock);
	    	      //set the stockService to the portfolio
	    	      utilisateur.setRoles(roleSet);
	    	   }
	       
	       
	       public boolean testMarketValue(){
	    	      Set<Role> roleFromUser = utilisateur.getRoles();		
	    	      return roleFromUser.contains(ERole.ROLE_MODERATOR);
	    	   }

}
