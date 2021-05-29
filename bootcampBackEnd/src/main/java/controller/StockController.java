package controller;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.dto.StockDTO;

@RestController //fala que é um controller
@RequestMapping(value = "/stock")//vai acessar a url desse controller
public class StockController {
	//classe do spring response , vai responser o própio dto que a pessoa enviou
	//vai mandar com id que crio na base de dados com dto dizendo que deu tudo certo
	//pq ta inserindo algo e criando
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StockDTO> save(@RequestBody StockDTO  dto) {
		return ResponseEntity.ok(dto);
		
	} 
	//pq ta fazendo alteração, ta construindo um json e retornando um json
     @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)  
	public ResponseEntity<StockDTO> update(@RequestBody StockDTO dto) {
		return ResponseEntity.ok(dto);
	}
     
     //trazer tudo que tá cadastrado
     @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<List<StockDTO>> findAll(){//pega todo mundo e retorna
    	 
    	 List<StockDTO> list = new ArrayList<>();
    	 StockDTO dto = new StockDTO();
    	 dto.setId(1L);//L do lado pq é do tipo long
    	 dto.setName("magazine luiza");
    	 dto.setPrice(90.99);
    	 dto.setDate(LocalDate.now());//dia de agora atualmente
    	 list.add(dto); //adicionando a lista
		return ResponseEntity.ok(list);
				
    	 
     }
   //pegando algo getmapping//pega um id especifico 
 		@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)  
      public ResponseEntity<StockDTO> findById(@PathVariable Long id) {//responsavel pegar id
 			 List<StockDTO> list = new ArrayList<>();
 	    	 StockDTO stock1= new StockDTO();
 	    	stock1.setId(1L);//L do lado pq é do tipo long
 	    	stock1.setName("magazine luiza");
 	    	stock1.setPrice(90.99);
 	    	stock1.setDate(LocalDate.now());//dia de agora atualmente
 	    	 list.add(stock1); //adicionando a lista
 				
 			 
 	    	 StockDTO stock2 = new StockDTO();
 	    	stock2.setId(2L);//L do lado pq é do tipo long
 	    	stock2.setName("Ponto Frio");
 	    	stock2.setPrice(7000.00);
 	    	stock2.setDate(LocalDate.now());//dia de agora atualmente
 	    	 list.add(stock2); //adicionando a lista
 	    	 
 	    StockDTO dtoselect = list.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();
 	    return ResponseEntity.ok(dtoselect);
 			
    			 
    	 
     }

}
