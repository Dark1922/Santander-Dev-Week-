package controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

}
