//package com.example.fullstack_development.boot_bootique;
//
//import java.lang.Iterable;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Arrays;
//import java.util.Optional;
//
//import jdk.jshell.spi.ExecutionControl.NotImplementedException;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@RestController
//@RequestMapping("/api/v1/boots")
//public class BootController {
//
//    private BootRepository bootRepository;
//
//    public BootController(BootRepository bootRepository) {
//        this.bootRepository = bootRepository;
//    }
//
//    @GetMapping("/")
//    public Iterable<Boot> getAllBoots() throws NotImplementedException {
//        return this.bootRepository.findAll();
//    }
//
//    @GetMapping("/types")
//    public List<BootType> getBootTypes() {
//        return Arrays.asList(BootType.values());
//    }
//
//    @PostMapping("/")
//    public Boot addBoot(@RequestBody Boot boot) throws NotImplementedException {
//        this.bootRepository.save(boot);
//        return boot;
//    }
//
//    @DeleteMapping("/{id}")
//    public Boot deleteBoot(@PathVariable("id") Integer id) throws NotImplementedException {
//        Optional<Boot> optionalBootToUpdate = this.bootRepository.findById(id);
//        if(optionalBootToUpdate.isEmpty()){
//            return null;
//        }
//        Boot bootToUpdate = optionalBootToUpdate.get();
//        bootRepository.delete(bootToUpdate);
//        return bootToUpdate;
//    }
//
//    @PutMapping("/{id}/quantity/increment")
//    public Boot incrementQuantity(@PathVariable("id") Integer id) {
//        Optional<Boot> optionalBootToUpdate = this.bootRepository.findById(id);
//        if(optionalBootToUpdate.isEmpty()){
//            return null;
//        }
//        Boot bootToUpdate = optionalBootToUpdate.get();
//        Integer currentQuantity = bootToUpdate.getQuantity();
//        bootToUpdate.setQuantity(currentQuantity++);
//        bootRepository.save(bootToUpdate);
//        return bootToUpdate;
//    }
//
//    @PutMapping("/{id}/quantity/decrement")
//    public Boot decrementQuantity(@PathVariable("id") Integer id) throws NotImplementedException {
//        Optional<Boot> optionalBootToUpdate = this.bootRepository.findById(id);
//        if(optionalBootToUpdate.isEmpty()){
//            return null;
//        }
//        Boot bootToUpdate = optionalBootToUpdate.get();
//        Integer currentQuantity = bootToUpdate.getQuantity();
//        if(currentQuantity > 0){
//            bootToUpdate.setQuantity(currentQuantity--);
//        }
//        bootRepository.save(bootToUpdate);
//        return bootToUpdate;
//    }
//
//    @GetMapping("/search")
//    public List<Boot> searchBoots(@RequestParam(required = false) String material,
//        @RequestParam(required = false) BootType type, @RequestParam(required = false) Float size,
//        @RequestParam(required = false, name = "quantity") Integer minQuantity) {
//        if (Objects.nonNull(material)) {
//            if (Objects.nonNull(type) && Objects.nonNull(size) && Objects.nonNull(minQuantity)) {
//                // call the repository method that accepts a material, type, size, and minimum quantity
//
//            } else if (Objects.nonNull(type) && Objects.nonNull(size)) {
//                // call the repository method that accepts a material, size, and type
//
//            } else if (Objects.nonNull(type) && Objects.nonNull(minQuantity)) {
//                // call the repository method that accepts a material, a type, and a minimum quantity
//
//            } else if (Objects.nonNull(type)) {
//                // call the repository method that accepts a material and a type
//
//            } else {
//                // call the repository method that accepts only a material
//                this.bootRepository.findBootsByMaterial(material);
//            }
//        } else if (Objects.nonNull(type)) {
//            if (Objects.nonNull(size) && Objects.nonNull(minQuantity)) {
//                // call the repository method that accepts a type, size, and minimum quantity
//
//            } else if (Objects.nonNull(size)) {
//                // call the repository method that accepts a type and a size
//
//            } else if (Objects.nonNull(minQuantity)) {
//                // call the repository method that accepts a type and a minimum quantity
//
//            } else {
//                // call the repository method that accept only a type
//
//            }
//        } else if (Objects.nonNull(size)) {
//            if (Objects.nonNull(minQuantity)) {
//                // call the repository method that accepts a size and a minimum quantity
//
//            } else {
//                // call the repository method that accepts only a size
//
//            }
//        } else if (Objects.nonNull(minQuantity)) {
//            // call the repository method that accepts only a minimum quantity
//
//        } else {
//
//        }
//    }
//
//}
