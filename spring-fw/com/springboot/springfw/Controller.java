package com.springboot.springfw;
//sending responce in right format

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @Autowired
     private BusinessService businessService
    //".sum"=>100
    @GetMapping("/sum")
    public long displaySum(){
        return businessService.calculateSum();
    }

}
// business logic
@Component
class BusinessService{
    @Autowired
    private DataService dataService;
public long calculateSum(){
    List<Integer> data = dataService.retrieveData();
    return data.stream().reduce(Integer::sum).get();
}
        }
        //Getting data
@Component
class DataService{
public List<Integer> retrieveData(){
    return Arrays.asList(12,34,56,98);
}
}
// send  request to the web by opening the browser and typing the url which is localhost:8080/sum (url we gave /sum).search this no in console log tomcat web server port