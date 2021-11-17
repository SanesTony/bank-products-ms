package com.bank.products.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.bank.products.client.Transaction;
//import com.bank.products.document.Credit;
//import com.bank.products.document.Debit;
//import com.bank.products.document.Product;
//import com.bank.products.document.VirtualWallet;
//import com.bank.products.service.ProductService;
//
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;


//@RestController
//@RequestMapping("/api/v1/products")
public class ProductController {
//	@Autowired
//	private ProductService productService;
//	
//	//****************************************Product: Debit********************************************//
//	
//	/***
//	 * 
//	 * @return List<Debit>
//	 */
//	@GetMapping(value = "/debits")
//	Flux<Debit> getDebits(){
//		return productService.getDebits();
//	}
//	
//	/***
//	 * 
//	 * @param id
//	 * @return Debit
//	 */
//	@GetMapping(value = "/debits/ids/{id}")
//	@ResponseBody Mono<Debit> getDebitByProductId(@RequestBody String id){
//		return productService.getDebitByProductId(id);
//	}
//	
//	/***
//	 * 
//	 * @param productType
//	 * @return List<Debit>
//	 */
//	@GetMapping(value = "/debits/types/{productType}")
//	@ResponseBody Flux<Debit> getDebitsByProductType(@RequestBody String productType){
//		return productService.getDebitsByProductType(productType);
//	}
//	
//	/***
//	 * 
//	 * @param productName
//	 * @return List<Debit>
//	 */
//	@GetMapping(value = "/debits/names/{productName}")
//	@ResponseBody Flux<Debit> getDebitsByProductName(@RequestBody String productName){
//		return productService.getDebitsByProductName(productName);
//	}
//	
//	/***
//	 * 
//	 * @param customerId
//	 * @return List<Debit>
//	 */
//	@GetMapping(value = "/debits/customers/{customerId}")
//	@ResponseBody Flux<Debit> getDebitsByCustomerId(@PathVariable String customerId){
//		return productService.getDebitsByCustomerId(customerId);
//	}
//	
//	/***
//	 * 
//	 * @param debit
//	 * @return Debit
//	 */
//	@PostMapping(value = "/debits")
//	@ResponseBody Mono<Debit> addDebit(@RequestBody Debit debit){
//		return productService.addDebit(debit);
//	}
//	
//	/***
//	 * 
//	 * @param debit
//	 * @return Debit
//	 */
//	@PutMapping(value = "/debits")
//	@ResponseBody Mono<Debit> editDebit(@RequestBody Debit debit){
//		return productService.addDebit(debit);
//	}
//	
//	/***
//	 * 
//	 * @param id
//	 * @return Void
//	 */
//	@DeleteMapping(value = "/debits/{id}")
//	Mono<ResponseEntity<Debit>> deletedDebit(@PathVariable String id){
//		return productService.getDebitByProductId(id).flatMap(debit -> productService.deleteDebit(debit))
//				.map(c -> ResponseEntity
//						.noContent().build());
//	}
//	
//	
//	//****************************************Product: Credit********************************************//
//	
//	/***
//	 * 
//	 * @return List<Credit>
//	 */
//	@GetMapping(value = "/credits")
//	Flux<Credit> getCredits(){
//		return productService.getCredits();
//	}
//	
//	/***
//	 * 
//	 * @param id
//	 * @return List<Credit>
//	 */
//	@GetMapping(value = "/credits/ids/{id}")
//	@ResponseBody Mono<Credit> getCreditByProductId(@PathVariable String id){
//		return productService.getCreditByProductId(id);
//	}
//	
//	/***
//	 * 
//	 * @param productType
//	 * @return List<Credit>
//	 */
//	@GetMapping(value = "/credits/types/{productType}")
//	@ResponseBody Flux<Credit> getCreditByProductType(@PathVariable String productType){
//		return productService.getCreditsByProductType(productType);
//	}
//	
//	/***
//	 * 
//	 * @param productName
//	 * @return List<Credit>
//	 */
//	@GetMapping(value = "/credits/names/{productName}")
//	@ResponseBody Flux<Credit> getCreditsByProductName(@PathVariable String productName){
//		return productService.getCreditsByProductName(productName);
//	}
//	
//	/***
//	 * 
//	 * @param customerId
//	 * @return List<Credit>
//	 */
//	@GetMapping(value = "/credits/customers/{customerId}")
//	@ResponseBody Flux<Credit> getCreditsByCustomerId(@PathVariable String customerId){
//		return productService.getCreditsByCustomerId(customerId);
//	}
//	
//	/***
//	 * 
//	 * @param credit
//	 * @return Credit
//	 */
//	@PostMapping(value = "/credits")
//	@ResponseBody Mono<Credit> addCredit(@RequestBody Credit credit){
//		return productService.addCredit(credit);
//	}
//	
//	/***
//	 * 
//	 * @param credit
//	 * @return Credit
//	 */
//	@PutMapping(value = "/credits")
//	@ResponseBody Mono<Credit> editCredit(@RequestBody Credit credit){
//		return productService.addCredit(credit);
//	}
//	
//	/***
//	 * 
//	 * @param id
//	 * @return void
//	 */
//	@DeleteMapping(value = "/credits/{id}")
//	Mono<ResponseEntity<Credit>> deletedCredit(@PathVariable String id){
//		return productService.getCreditByProductId(id).flatMap(credit -> productService.deleteCredit(credit))
//				.map(c -> ResponseEntity
//						.noContent().build());
//	}
//	
//	//****************************************Product: Debit********************************************//
//	
//	/**
//	 * 
//	 * @return List<VirtualWallet>
//	 */
//	@GetMapping(value = "/wallets")
//	Flux<VirtualWallet> getVirtualWallets(){
//		return productService.getVirtualWallets();
//	}
//	
//	/***
//	 * 
//	 * @param id
//	 * @return VirtualWallet
//	 */
//	@GetMapping(value = "/wallets/ids/{id}")
//	@ResponseBody Mono<VirtualWallet> getVirtualWalletByProductId(@RequestBody String id){
//		return productService.getVirtualWalletByProductId(id);
//	}
//
//	/***
//	 * 
//	 * @param productType
//	 * @return List<VirtualWallet>
//	 */
//	@GetMapping(value = "/wallets/types/{productType}")
//	@ResponseBody Flux<VirtualWallet> getVirtualWalletsByProductType(@RequestBody String productType){
//		return productService.getVirtualWalletsProductType(productType);
//	}
//	
//	/***
//	 * 
//	 * @param productName
//	 * @return List<VirtualWallet>
//	 */
//	@GetMapping(value = "/wallets/names/{productName}")
//	@ResponseBody Flux<VirtualWallet> getVirtualWalletsByProductName(@RequestBody String productName){
//		return productService.getVirtualWalletsByProductName(productName);
//	}
//	
//	/***
//	 * 
//	 * @param customerId
//	 * @return List<VirtualWallet>
//	 */
//	@GetMapping(value = "/wallets/customers/{customerId}")
//	@ResponseBody Flux<VirtualWallet> getVirtualWalletsByCustomerId(@PathVariable String customerId){
//		return productService.getVirtualWalletsByCustomerId(customerId);
//	}
//	
//	/***
//	 * 
//	 * @param virtualWallet
//	 * @return VirtualWallet
//	 */
//	@PostMapping(value = "/wallets")
//	@ResponseBody Mono<VirtualWallet> addVirtualWallet(@RequestBody VirtualWallet virtualWallet){
//		return productService.addVirtualWallet(virtualWallet);
//	}
//	
//	/***
//	 * 
//	 * @param virtualWallet
//	 * @return VirtualWallet
//	 */
//	@PutMapping(value = "/wallets")
//	@ResponseBody Mono<VirtualWallet> editDebit(@RequestBody VirtualWallet virtualWallet){
//		return productService.addVirtualWallet(virtualWallet);
//	}
//	
//	/***
//	 * 
//	 * @param id
//	 * @return Void
//	 */
//	@DeleteMapping(value = "/wallets/{id}")
//	Mono<ResponseEntity<VirtualWallet>> deletedVirtualWallet(@PathVariable String id){
//		return productService.getVirtualWalletByProductId(id).flatMap(virtualWallet -> productService.deleteVirtualWallet(virtualWallet))
//				.map(c -> ResponseEntity
//						.noContent().build());
//	}
//	
//	//***********************************Reports*****************************************//
//	
//	/***
//	 * 
//	 * @param id
//	 * @return List<Product>
//	 */
//	@GetMapping(value = "/customers/{id}")
//	Flux<Product> getProductsByCustomerId(@PathVariable String id){ // report 1
//		return productService.getProductsByCustomerId(id);
//	}
//	
//	/***
//	 * 
//	 * @param id
//	 * @return List<Product>
//	 */
//	@GetMapping(value = "/customers/{id}/transactions")
//	Flux<Transaction> getTransactionsByCustomerId(@PathVariable String id){ // report 3 
//		return productService.getTransactionsByCustomerId(id);
//	}
}
