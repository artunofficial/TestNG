package com.automation.Day9_Jan_16_.CssSelectorcopy;

public class Introduction_CSSelector {

	public static void main(String[] args) {
		//html[@attribute = 'value']
		//////html[attribute = value]
		
		//if there is id attribute then cssSelector then we can use # symbol
		//html#idattributevalue - this one is more recommended because it has a higher chance of 1 of 1
		//#idattributevalue - this is risky
		
		//input#login1
		
		//what if there is a class ?? Then we use a symbol
		//html.classattributevalue
		
		//cssSelectors are move convenient to use if it is a compound class
		//html.value1.value2.value3.value4.value5.valuen
		//div.hidden-sm.hidden-md.hidden-lg.col-xs-12.form-group.remove-padding.ng-star-inserted
		
		//cssSelectors you can not travel from bottom to top. That is only possible in xpath
		//how to traverse between siblings
		//in cssSelector to traverse between siblings you have to use + symbol
		//in cssSelector to traverse between grandparent > parent > child - exactly family, you have to use > symbol
		//a parent can have multiple kids. Sometimes kids of the same html tag type
		//kids of the same type are known as nth-of-type(1)
		//total kids are represented by nth-child(4)
		
		//signin rediff
		////p#signin_info>a:nth-child(1)
		////p#signin_info>a:nth-of-type(1)
		
		////p#signin_info>br:nth-child(2)
		//create account
		////p#signin_info>a:nth-child(3)
		////p#signin_info>a:nth-of-type(3)
		////p#signin_info>a + br + a
		////p#signin_info>nth-child(1) + br + a
		////p#signin_info>nth-child(1) + br:nth-child(2) + a
		////p#signin_info>nth-child(1) + br:nth-child(2) + a:nth-child(3)
		
		//input#OAS_subsection+div.logobar>div.table>div:nth-of-type(3)>p#signin_info>a:nth-child(3)
	}

}
