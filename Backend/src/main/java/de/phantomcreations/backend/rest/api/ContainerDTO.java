package de.phantomcreations.backend.rest.api;

import java.util.List;
import java.util.Map;

public class ContainerDTO {

    private String containerName;

    private String name;

    private Map<String, String> env;

    private Map<String,String> volume;
}
