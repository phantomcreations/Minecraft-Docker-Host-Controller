package de.phantomcreations.backend.rest.impl;

import com.amihaiemil.docker.Docker;
import com.amihaiemil.docker.LocalDocker;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.io.File;
@Component
@ApplicationScope
public class DockerSercive {
    public Docker docker;

    public DockerSercive(){
        docker = new LocalDocker(new File("/var/run/docker.sock"));
    }
}
