package com.example.SpringRevisionGothrough.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSampleController {

	@PostMapping("test")
	public ResponseEntity<String> testApi(@RequestParam String input) {
		return new ResponseEntity<String>(input, HttpStatus.ACCEPTED);

	}

//	public List<EmployeeDto> sortedEmployeeDetails (){
//		
//		
//		
//		
//		List<EmployeeDto> employeeList = 
//				new ArrayList<>(Arrays.asList(new EmployeeDto("Aravind", 9),
//						new EmployeeDto("Sample", 8),
//						new EmployeeDto("Test", 9)));
//		
////		employeeList.stream().sorted(Comparator.comparingInt(EmployeeDto:: getRating)
////				.reversed()
////				.C
//				
//		
//		Map<String,Integer> map = new HashMap<>();
//		
//		map.put("key", 1);
//		map.put("key1", 2);
//		map.put("key3", 3);
//		
//		Set<Entry<String,Integer>> entries =map.entrySet();
//		
//		
//		for(Entry e : map.entrySet()) {
//			System.out.println("key :" + "" +e.getKey());
//		}
//				
//	}
//	
//	
//
}
