package com.grafysi.zoneoperator.crd;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.ShortNames;
import io.fabric8.kubernetes.model.annotation.Version;

@Group("com.grafysi")
@Version("v1")
@ShortNames("neo")
public class SimpleNeo4j extends CustomResource<SimpleNeo4jSpec, SimpleNeo4jStatus> {



}
