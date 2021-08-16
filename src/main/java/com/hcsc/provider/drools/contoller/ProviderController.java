package com.hcsc.provider.drools.contoller;

import com.hcsc.provider.drools.domain.Provider;
import com.hcsc.provider.drools.main.StatelessProviderValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(path = "/validateProvider")
public class ProviderController {

    @Autowired
    private Provider provider;

    @RequestMapping(
            value = "/process",
            method = RequestMethod.POST,
            consumes = "application/json")
    public Provider process(@RequestBody Provider provider) throws Exception {

        return StatelessProviderValidation.execute(provider);

    }

//    @GetMapping(
//            path = "/",
//            produces = "application/json")
//
//    public Provider read(Provider provider) {
//        return provider;
//    }
//
//    @PostMapping(
//            path = "/",
//            consumes = "application/json",
//            produces = "application/json")
//    public ResponseEntity<Provider> create(@RequestBody Provider provider)
//            throws URISyntaxException {
//
//        if (provider == null) {
//            return ResponseEntity.notFound().build();
//        } else {
//            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//                    .path("/{id}")
//                    .buildAndExpand(createdStudent.getId())
//                    .toUri();
//
//            return ResponseEntity.created(uri)
//                    .body(createdStudent);
//        }
//    }
//
//    @GetMapping("/")
//    public ResponseEntity<Provider> read(Provider provider) {
//        if (provider == null) {
//            return ResponseEntity.notFound().build();
//        } else {
//            return ResponseEntity.ok(foundStudent);
//        }
//    }
}