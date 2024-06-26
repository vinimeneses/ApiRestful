package net.javaguides.springboot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController  {

    private UserService userService;

    // Build Create User REST API

    @Operation(
             summary = "Create new User",
             description = "This API creates a new User")
    @ApiResponse(responseCode = "201", description = "HTTP status code 201 CREATED")
    @PostMapping
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto user) {
        UserDto savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

   // Build getUser REST API

    @Operation(summary = "Get User by Id",
            description = "This API retrieves a User by Id")
    @ApiResponse(responseCode = "200", description = "HTTP status code 200 OK")
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {
        UserDto user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // Build getAllUsers REST API

    @Operation(summary = "Get all Users",
        description = "This API retrieves all Users")
    @ApiResponse(responseCode = "200", description = "HTTP status code 200 OK")
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Build update User REST API

    @Operation(summary = "Update User by Id",
            description = "This APIs updates a User by Id")
    @ApiResponse(responseCode = "200", description = "HTTP status code 200 OK")
    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,
                                              @RequestBody @Valid UserDto user) {
        user.setId(userId);
        UserDto updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // Build delete User REST API

    @Operation(summary = "Delete User by Id",
            description = "This APIs deletes a User by Id")
    @ApiResponse(responseCode = "200", description = "HTTP status code 200 OK")
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }

}
