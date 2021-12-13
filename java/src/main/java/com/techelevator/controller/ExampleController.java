package com.techelevator.controller;

import com.techelevator.dao.ExampleDAO;
import com.techelevator.dao.UserDAO;
import com.techelevator.model.Example;
import com.techelevator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin
public class ExampleController {

    @Autowired
    private ExampleDAO exampleDAO;
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(path = "/examples", method = RequestMethod.GET)
    public List<Example> retrieveAllExamples(Principal user) {

        return exampleDAO.retrieveAllExamples(userDAO.findIdByUsername(user.getName()));

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(path = "/examples", method = RequestMethod.POST)
    public void addExample(@RequestBody Example example, Principal user) {
        example.setUserId(userDAO.findIdByUsername(user.getName()));
        exampleDAO.addExample(example);

    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(path = "/examples/{exampleId}", method = RequestMethod.DELETE)
    public void deleteExample(@PathVariable int exampleId, @RequestBody Principal user) {
        exampleDAO.deleteExample(exampleId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(path = "/examples/{exampleId}", method = RequestMethod.PUT)
    public void editExample(@RequestBody Example example, @PathVariable int exampleId, Principal user) {
        example.setExampleId(exampleId);

        exampleDAO.editExample(example);
    }


}
