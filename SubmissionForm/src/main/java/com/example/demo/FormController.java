package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	
	@Autowired
	CustomerRepo repo;
	@RequestMapping("/")
	public String cspl() {
		return "cspl";
	}
	@RequestMapping("/details")
	public String details(Customers customers) {
		repo.save(customers);
		return "cspl";
	}
	@RequestMapping("/getdetails")
	public String getdetails() {
		return "ViewCustomers";
	}
@PostMapping("/getdetails")
public ModelAndView getdetails(@RequestParam int cid) {
	ModelAndView mv=new ModelAndView("Retrieve");
	Customers customers=repo.findById(cid).orElse(null);
	mv.addObject(customers);
	return mv;
	
}
//public String viewdetails(@RequestParam("cid")String cid,
//		@RequestParam("cname")String cname,
//		@RequestParam("cemail")String cemail, ModelMap modelMap){
//	modelMap.put("cid",cid);
//	modelMap.put("cname", cname);
//	modelMap.put("cemail", cemail);
//	return "ViewCustomers";
//}
//@RequestMapping("/customers")
//@ResponseBody
//public String getCustomers() {
//	return repo.findAll().toString();
//}
@RequestMapping("/customers")
@ResponseBody
public List<Customers> getCustomers() {
	return repo.findAll();
}
@RequestMapping("/customers/{cid}")
@ResponseBody
public Optional<Customers> getCustomeryById(@PathVariable("cid") int cid) 
{
	return repo.findById(cid);
}

@PostMapping("/customers")
@ResponseBody
public Customers getCustomers3(@RequestBody Customers customers ) {
	repo.save(customers);
	return customers; 
}
@DeleteMapping("/customers/{cid}")
public Customers deleteCustomer(@PathVariable("cid") int cid) {
	Customers cust=repo.getOne(cid);
	repo.delete(cust);
	return cust;
}
@PutMapping(path="/customers",consumes= {"application/json"})
public Customers updateCustomer(@RequestBody Customers customers) {
//	Customers cust=repo.getOne(cid);
	repo.save(customers);
	return customers;
}
}
