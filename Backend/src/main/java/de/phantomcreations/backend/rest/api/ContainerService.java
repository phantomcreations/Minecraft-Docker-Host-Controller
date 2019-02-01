package de.phantomcreations.backend.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


public interface ContainerService {
    @RequestMapping("/getRunningContainers")
    public String getAllRunningContainers();
    @RequestMapping("/getContainers")
    public String getAllContainers();
    @RequestMapping("/startContainer")
    public String startContainer(@RequestParam ContainerDTO settings);
    @RequestMapping("/stopContainer")
    public String stopContainer();
    @RequestMapping("/runContainer")
    public String runContainer(@RequestParam ContainerDTO settings);

}
