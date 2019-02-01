package de.phantomcreations.backend.rest.impl;

import com.amihaiemil.docker.Container;
import de.phantomcreations.backend.rest.api.ContainerDTO;
import de.phantomcreations.backend.rest.api.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContainerRestService implements ContainerService {

    @Autowired
    private DockerSercive controler;

    @Override
    public String getAllRunningContainers() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Container c : controler.docker.containers()) {
            stringBuilder.append(c.containerId()).append(" ;");
        }
        return stringBuilder.toString();
    }

    @Override
    public String getAllContainers() {
        return null;
    }

    @Override
    public String startContainer(ContainerDTO settings) {
        return null;
    }

    @Override
    public String stopContainer() {
        return null;
    }

    @Override
    public String runContainer(ContainerDTO settings) {
        return null;
    }
}
